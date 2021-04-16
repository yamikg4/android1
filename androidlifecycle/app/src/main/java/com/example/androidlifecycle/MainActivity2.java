package com.example.androidlifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toast.makeText(MainActivity2.this,"Oncreate()",Toast.LENGTH_LONG).show();
    }
    public void onStart() {
        super.onStart();
        Toast.makeText(MainActivity2.this,"onStart()",Toast.LENGTH_LONG).show();
    }
    public void onResume() {
        super.onResume();
        Toast.makeText(MainActivity2.this,"onResume()",Toast.LENGTH_LONG).show();
    }
    public void onPause() {
        super.onPause();
        Toast.makeText(MainActivity2.this,"onPause()",Toast.LENGTH_LONG).show();
    }
    public void onStop() {
        super.onStop();
        Toast.makeText(MainActivity2.this,"onStop()",Toast.LENGTH_LONG).show();
    }
}