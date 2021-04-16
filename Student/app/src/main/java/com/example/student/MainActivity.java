package com.example.student;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
Button btn;
EditText branch,id,name,date,number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button)findViewById(R.id.button);
        branch=(EditText)findViewById(R.id.branch);
        id=(EditText)findViewById(R.id.id);
        name=(EditText)findViewById(R.id.name);
        date=(EditText)findViewById(R.id.editTextDate);
    number=(EditText)findViewById(R.id.editTextNumber);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Intent=new Intent(MainActivity.this,MainActivity2.class);
                Intent.putExtra("data",id.getText().toString());
                Intent.putExtra("name",name.getText().toString());
                Intent.putExtra("date",date.getText().toString());
                Intent.putExtra("number",number.getText().toString());
               Intent.putExtra("branch",branch.getText().toString());
                startActivity(Intent);
            }
        });
    }
}