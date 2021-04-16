package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class abc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abc);
        TextView twv=(TextView)findViewById(R.id.textView2);
        Button logout=(Button)findViewById(R.id.button3) ;
        SharedPreferences pref=getSharedPreferences("MyPref",MODE_PRIVATE);
        String str=pref.getString("user","");
        twv.setText("Welcome"+str);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences preferences =getSharedPreferences("MyPref",MODE_PRIVATE);
                SharedPreferences.Editor editor = preferences.edit();
                editor.clear();
                editor.apply();
                Intent intent=new Intent(abc.this,login.class);
                startActivity(intent);
                finish();
            }
        });


    }
}