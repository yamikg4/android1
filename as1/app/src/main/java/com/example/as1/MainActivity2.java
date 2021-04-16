package com.example.as1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView twv=(TextView)findViewById(R.id.textView);
        Bundle bundle= getIntent().getExtras();
        String data=bundle.getString("id");
        String name=bundle.getString("name");
        String date=bundle.getString("branch");
        String number=bundle.getString("contact");
        String branch=bundle.getString("bdate");
        twv.setText("\nid:"+data+"\nName:"+name+"\nbdate:"+date+"\nMO:"+number+"\nBRANCH:"+branch);
    }
}