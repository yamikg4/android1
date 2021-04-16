package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class home extends AppCompatActivity {
TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        tv=findViewById(R.id.tv);
        Button bt=(Button)findViewById(R.id.button2);
        SharedPreferences pref=getSharedPreferences("MyPref",MODE_PRIVATE);
        String str=pref.getString("username","");
        tv.setText("Welcome "+str);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences pref=getSharedPreferences("MyPref",MODE_PRIVATE);
                SharedPreferences.Editor editor=pref.edit();
                editor.clear();
                editor.apply();
                Intent ab=new Intent(home.this,Login.class);
                startActivity(ab);
            }
        });
    }
}