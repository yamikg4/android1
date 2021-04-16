package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                SharedPreferences pref=getSharedPreferences("MyPref",MODE_PRIVATE);
                String str=pref.getString("username","");
                if(str.equals("")){
                    Intent intent=new Intent(MainActivity.this,Login.class);
                    startActivity(intent);
                }
                else
                {
                    Intent i=new Intent(MainActivity.this,home.class);
                    startActivity(i);
                }
            }
        },3000);

    }
}