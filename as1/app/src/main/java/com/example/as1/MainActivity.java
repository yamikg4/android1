package com.example.as1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText et1=(EditText)findViewById(R.id.editTextTextPersonName);
        EditText et2=(EditText)findViewById(R.id.editTextTextPersonName2);
        EditText et3=(EditText)findViewById(R.id.editTextTextPersonName3);
        EditText et4=(EditText)findViewById(R.id.editTextNumber);
        EditText et5=(EditText)findViewById(R.id.editTextDate);
        Button bt=(Button)findViewById(R.id.button);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent=new Intent(MainActivity.this,MainActivity2.class);
                Intent.putExtra("id",et1.getText().toString());
                Intent.putExtra("name",et2.getText().toString());
                Intent.putExtra("branch",et3.getText().toString());
                Intent.putExtra("contact",et4.getText().toString());
                Intent.putExtra("bdate",et5.getText().toString());
                startActivity(Intent);
            }
        });
    }
}