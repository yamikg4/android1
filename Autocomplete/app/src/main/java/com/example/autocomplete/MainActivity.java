package com.example.autocomplete;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
String []Country={"Afganistan","Algeria","Austrila","Albaria"};
ArrayAdapter<String>adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AutoCompleteTextView ac1=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView);
        TextView tv=(TextView)findViewById(R.id.textView);
        Button bt1=(Button)findViewById(R.id.button);
        adapter=new ArrayAdapter<>(MainActivity.this,android.R.layout.simple_dropdown_item_1line,Country);
       ac1.setThreshold(0);
       ac1.setAdapter(adapter);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(int i = 0; i <adapter.getCount(); i++){
                    tv.setText("Select Country: "+ac1.getText().toString());
                }
            }
        });
    }
}