package com.example.sqllite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class UpdateDeletePage extends AppCompatActivity {
    DbHelper dh;
    Button btnUpdate, btnDelete,btn;
    EditText ud_sno, ud_sname, ud_sage;
    int flag = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_delete_page);
        btn=findViewById(R.id.btn);
        btnUpdate = findViewById(R.id.btnUpdate);
        btnDelete = findViewById(R.id.btnDelete);
        ud_sno = findViewById(R.id.ud_sno);
        ud_sname = findViewById(R.id.ud_sname);
        ud_sage = findViewById(R.id.ud_sage);

        ud_sno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag = 0;
                btnUpdate.setText("Show");
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(UpdateDeletePage.this,MainActivity.class);
                startActivity(intent);
            }
        });

        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int ud_stdno = Integer.parseInt(ud_sno.getText().toString());
                if (flag == 0) {
                    dh = new DbHelper(getApplicationContext());
                    Cursor c = dh.display(ud_stdno);

                    if (c.getCount() == 0) {
                        Toast.makeText(getApplicationContext(), "No Record Found", Toast.LENGTH_SHORT).show();
                        ud_sname.setText("");
                        ud_sage.setText("");
                    } else {
                        c.moveToNext();
                        ud_sname.setText(c.getString(1));
                        ud_sage.setText(c.getString(2));

                        flag = 1;
                        btnUpdate.setText("Update Now");
                    }
                } else {
                    String ud_stdname = ud_sname.getText().toString();
                    int ud_stdage = Integer.parseInt(ud_sage.getText().toString());

                    if (ud_sage.getText().toString() == "" || ud_stdname == "") {
                        Toast.makeText(getApplicationContext(), "All fields are required.", Toast.LENGTH_SHORT).show();
                    } else {
                        boolean b = dh.update(ud_stdno, ud_stdname, ud_stdage);
                        if (b == true) {
                            flag = 0;
                            btnUpdate.setText("Show");
                            startActivity(new Intent(getApplicationContext(), ViewPage.class));
                            ud_sno.setText("");
                            ud_sname.setText("");
                            ud_sage.setText("");
                        }
                    }
                }
            }
        });

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int ud_stdno = Integer.parseInt(ud_sno.getText().toString());
                if(ud_sno.getText().toString() == ""){
                    Toast.makeText(getApplicationContext(), "All fields are required.", Toast.LENGTH_SHORT).show();
                } else {
                    boolean b = dh.delete(ud_stdno);
                    if (b == true) {
                        startActivity(new Intent(getApplicationContext(), ViewPage.class));
                        ud_sno.setText("");
                        ud_sname.setText("");
                        ud_sage.setText("");
                        //Toast.makeText(getApplicationContext(), "Deleted", Toast.LENGTH_SHORT).show();
                    } else{
                        Toast.makeText(getApplicationContext(), "Something went wrong", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });
    }


}