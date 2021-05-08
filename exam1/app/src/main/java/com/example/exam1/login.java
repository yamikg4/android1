package com.example.exam1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        EditText et1=(EditText)findViewById(R.id.username);
        EditText et2=(EditText)findViewById(R.id.pwd);
        Button bt1=(Button)findViewById(R.id.submit);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(et1.getText().toString().equals("admin") & et2.getText().toString().equals("admin")){
                    startActivity(new Intent(login.this,home.class));
                }
                else{
                    Toast.makeText(login.this, "Pls Try Again", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}