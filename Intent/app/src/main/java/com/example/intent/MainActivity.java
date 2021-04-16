package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn=(Button) findViewById(R.id.button);
        Button btn2=(Button)findViewById(R.id.button2);
        Button btn3=(Button)findViewById(R.id.button3);
        Button btn4=(Button)findViewById(R.id.button5);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/"));
               startActivity(intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gps= Uri.parse("https://www.google.com/maps/dir//Khambhat,+Gujarat/@22.3180779,72.5839649,13z/data=!4m8!4m7!1m0!1m5!1m1!1s0x395f06a6b5ea46af:0x4dec950277e0854d!2m2!1d72.6189845!2d22.3180817");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gps);
                startActivity(mapIntent);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent phone=new Intent(Intent.ACTION_DIAL,Uri.parse("tel:9265866744"));
                startActivity(phone);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent contact=new Intent();
                contact.setAction(Intent.ACTION_VIEW);
                contact.setData(Uri.parse("content://contacts/people/"));
                startActivity(contact);
            }
        });
    }
}