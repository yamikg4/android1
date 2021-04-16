package com.example.sqllite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ViewPage extends AppCompatActivity {
    DbHelper dh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_page);
       TextView ls1=(TextView) findViewById(R.id.List);
        Button bt=(Button)findViewById(R.id.button);
        dh = new DbHelper(getApplicationContext());
        Cursor c = dh.displayAll();
        if (c.getCount() == 0) {
            Toast.makeText(getApplicationContext(), "No Record Found", Toast.LENGTH_SHORT).show();
        }
        StringBuffer sb= new StringBuffer();
        while (c.moveToNext()) {
            sb.append("\n\n   Student No: " + c.getString(0) + ";"+"\n");
            sb.append("   Student Name: " + c.getString(1) +";" +"\n");
            sb.append("   Student Age: " + c.getString(2) +";"+ "\n");
        }
        ls1.setText("Student Data"+sb.toString());
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ViewPage.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}