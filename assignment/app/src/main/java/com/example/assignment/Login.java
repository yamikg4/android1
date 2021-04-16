package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText et1,et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        et1=findViewById(R.id.editTextTextPersonName2);
        et2=findViewById(R.id.editTextTextPassword);
        Button bt=(Button)findViewById(R.id.button);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=et1.getText().toString();
                String s2=et2.getText().toString();
            if(s1.equals("Test")|| s2.equals("TestUser")){
                SharedPreferences pref=getSharedPreferences("MyPref",MODE_PRIVATE);
                String str=pref.getString("user","");
                SharedPreferences.Editor editor=pref.edit();
                editor.putString("username",s1);
                editor.commit();
                Intent intent=new Intent(Login.this,home.class);
                startActivity(intent);
            }
            else{
                Toast.makeText(Login.this, "Invalid User", Toast.LENGTH_SHORT).show();
            }
            }
        });
    }
}