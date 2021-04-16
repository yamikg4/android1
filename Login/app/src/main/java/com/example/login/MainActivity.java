package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                SharedPreferences pref=getSharedPreferences("MyPref",MODE_PRIVATE);
                String str=pref.getString("user","");
                if(str.equals("")){
                      Intent abc=new Intent(MainActivity.this,login.class);
                      startActivity(abc);
                }
                else{
                    Intent intent=new Intent(MainActivity.this,abc.class);
                    startActivity(intent);
                }
            }
        },3000);
    }
}