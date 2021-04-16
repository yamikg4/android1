package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {
EditText username,password;
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username=(EditText)findViewById(R.id.user);
        password=(EditText)findViewById(R.id.pwd);
        btn=(Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
String et1=username.getText().toString();
String et2=password.getText().toString();
if(et1.equals("Test")||et2.equals("TestUser")){
    SharedPreferences pref=getSharedPreferences("MyPref",MODE_PRIVATE);
    String str=pref.getString("user","");
    SharedPreferences.Editor editor=pref.edit();
    editor.putString("user",et1);
    editor.commit();
    Intent intent=new Intent(login.this,abc.class);
    startActivity(intent);
}
else{
    Toast.makeText(login.this, "Invalid user", Toast.LENGTH_SHORT).show();
}
            }
        });

    }
}