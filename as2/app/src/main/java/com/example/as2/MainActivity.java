package com.example.as2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import static java.util.Calendar.MONTH;

public class MainActivity extends AppCompatActivity {
    EditText title,subject,date, start_time;
            TextView reslut,reslut1;
    Button submit;
    String c_date,c_time;
    DatePickerDialog dob_picker_dg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        title=findViewById(R.id.title);
        subject=findViewById(R.id.suject);
        date =findViewById(R.id.date);
        start_time =findViewById(R.id.starttme);
        reslut =findViewById(R.id.reslut);
        reslut1 =findViewById(R.id.reslut1);
        submit=findViewById(R.id.submit);
        getSupportActionBar().hide();
        date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar calendar=Calendar.getInstance();
                int day=calendar.get(Calendar.YEAR);
                int month=calendar.get(Calendar.MONTH);
                int year=calendar.get(Calendar.DAY_OF_MONTH);
                 dob_picker_dg =new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int mday, int mmonth, int myear) {
                        mmonth=datePicker.getMonth()+1;
                        date.setText(datePicker.getDayOfMonth()+"-"+mmonth+"-"+datePicker.getYear());
                    }
                },day,month,year);

                dob_picker_dg.show();
            }
        });

        start_time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar mcurrentTime = Calendar.getInstance();
                int hour = mcurrentTime.get(Calendar.HOUR_OF_DAY);
                int minute = mcurrentTime.get(Calendar.MINUTE);
                TimePickerDialog mTimePicker;
                mTimePicker = new TimePickerDialog(MainActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int selectedHour, int selectedMinute) {
                        start_time.setText( selectedHour + ":" + selectedMinute);
                    }
                }, hour, minute, true);//Yes 24 hour time
                mTimePicker.setTitle("Select Time");
                mTimePicker.show();
            }
        });



        String date_n = new SimpleDateFormat("dd-M-yyyy", Locale.getDefault()).format(new Date());
        String time = new SimpleDateFormat("HH:mm", Locale.getDefault()).format(new Date());

        c_date=date.getText().toString();
        c_time= start_time.getText().toString();
        if(c_date.equals(date_n) && c_time.equals(time)){
            Toast.makeText(this, "Test Is started", Toast.LENGTH_SHORT).show();
            enable();
        }
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String date_n = new SimpleDateFormat("dd-M-yyyy", Locale.getDefault()).format(new Date());
                String time = new SimpleDateFormat("HH:mm", Locale.getDefault()).format(new Date());
                String  r_date=date.getText().toString();
                String r_time= start_time.getText().toString();
                if(r_date.equals(date_n) && r_time.equals(time)){
                    Toast.makeText(MainActivity.this, "Test Is started", Toast.LENGTH_SHORT).show();
                    enable();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "You Exam Will be Strated in soon", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    void enable()
    {
        title.setEnabled(false);
        subject.setEnabled(false);
        date.setEnabled(false);
        start_time.setEnabled(false);
        submit.setEnabled(false);
        reslut.setVisibility(View.VISIBLE);
        reslut1.setVisibility(View.VISIBLE);
        reslut.setText(title.getText().toString());
        reslut1.setText("Test Is Started  "+c_date+c_time);
    }
}