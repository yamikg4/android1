package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CheckBox ch1=(CheckBox)findViewById(R.id.checkBox);
        CheckBox ch2=(CheckBox)findViewById(R.id.checkBox2);
        CheckBox ch3=(CheckBox)findViewById(R.id.checkBox3);
        CheckBox ch4=(CheckBox)findViewById(R.id.checkBox4);
        Button bt1=(Button)findViewById(R.id.button);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int amt=0;
                StringBuffer sb=new StringBuffer();
            //String Message="";
            if(ch1.isChecked()){
                sb.append("Burger is $50");
                amt+=50;
            }
                if(ch2.isChecked()){
                    sb.append("\nPizza is $50");
                    amt+=50;
                }
                if(ch3.isChecked()){
                    sb.append("\nTea is $10");
                    amt+=10;
                }
                if(ch4.isChecked()){
                    sb.append("\nCoffe is $20");
                    amt+=20;
                }
                sb.append("\nTotal amt "+"$"+amt);
                Toast.makeText(MainActivity.this, sb.toString(), Toast.LENGTH_SHORT).show();
            }


        });
    }
}