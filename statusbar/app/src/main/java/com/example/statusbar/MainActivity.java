package com.example.statusbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView t1=(TextView) findViewById(R.id.textView2);
        TextView t2=(TextView) findViewById(R.id.textView3);
         SeekBar sk=(SeekBar) findViewById(R.id.seekBar2);
        RatingBar rd=(RatingBar)findViewById(R.id.ratingBar);
sk.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
    int progrsschange=0;
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        progrsschange=i;
       t1.setText("value of "+progrsschange);
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        t1.setText("value of "+progrsschange);
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        t1.setText("value of "+progrsschange);
    }
});
rd.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
    @Override
    public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
        t2.setText("value of Rating Bar is:"+v);
    }
});

    }


}

