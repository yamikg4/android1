package com.example.student;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView twv=(TextView)findViewById(R.id.result);
        Bundle bundle= getIntent().getExtras();
        String data=bundle.getString("data");
        String name=bundle.getString("name");
        String date=bundle.getString("date");
        String number=bundle.getString("number");
        String branch=bundle.getString("branch");
        twv.setText("Branch:"+data+"Name:"+name+"DOB:"+date+"MO:"+number+"BRANCH"+branch);

    }
}