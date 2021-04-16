package com.example.androidlifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this,"Oncreate()",Toast.LENGTH_LONG).show();
        TextView tv=(TextView)findViewById(R.id.text);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
                finish();
            }
        });
    }
    public void onStart() {
        super.onStart();
        Toast.makeText(MainActivity.this,"onStart()",Toast.LENGTH_LONG).show();
    }
    public void onResume() {
        super.onResume();
        Toast.makeText(MainActivity.this,"onResume()",Toast.LENGTH_LONG).show();
    }
    public void onPause() {
        super.onPause();
        Toast.makeText(MainActivity.this,"onPause()",Toast.LENGTH_LONG).show();
    }
    public void onStop() {
        super.onStop();
        Toast.makeText(MainActivity.this,"onStop()",Toast.LENGTH_LONG).show();
    }

}