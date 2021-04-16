package com.example.fragement;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bt1=(Button)findViewById(R.id.bt1);
        Button bt2=(Button)findViewById(R.id.bt2);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            loadFragement(new Fragement_1());
            }

            private void loadFragement(Fragement_1 fragement_1) {
                FragmentManager fr=getSupportFragmentManager();
                FragmentTransaction ft=getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.frame1,fragement_1);
                ft.commit();
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            loadFragement(new fragement_2());
            }

            private void loadFragement(fragement_2 fragement_2) {
                FragmentManager fr=getSupportFragmentManager();
                FragmentTransaction ft=getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.frame1,fragement_2);
                ft.commit();
            }
        });
    }
}