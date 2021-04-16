package com.example.form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn2=(Button)findViewById(R.id.button2);
        RadioButton rd1=(RadioButton)findViewById(R.id.radioButton4);
        RadioButton rd2=(RadioButton)findViewById(R.id.radioButton5);
        EditText et1=(EditText)findViewById(R.id.editTextTextPersonName9);
        TextView tv=(TextView)findViewById(R.id.textView);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                //startActivity(intent);
                String Message="";
                if(rd1.isChecked()){
                    Message+="Java";
                }
                if(rd2.isChecked()){
                    Message+="Android";
                }
                showNotication(Message);
            }

            private void showNotication(String message) {
                String Name=et1.getText().toString();
                tv.setText("Hi "+Name+"\nYou have Choosen "+ message);
            }
        });
    }
}