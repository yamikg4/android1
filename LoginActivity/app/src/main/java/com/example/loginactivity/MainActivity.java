package com.example.loginactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText UserName,Password;
Button Login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        UserName=findViewById(R.id.UserName);
        Password=findViewById(R.id.Password);
        Login=findViewById(R.id.Login);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(UserName.getText().toString())||TextUtils.isEmpty(Password.getText().toString()))
                {
                    Toast.makeText(MainActivity.this,"Invalid Login",Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(MainActivity.this,"Login Sucessfully",Toast.LENGTH_LONG).show();
                    Intent i=new Intent(MainActivity.this,Login.class);
                    startActivity(i);
                    finish();
                }
            }
        });
    }
}