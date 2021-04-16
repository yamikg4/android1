package com.example.fragementdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
// 5 To get data from our fragments to our Activity we need to implement two interfaces that we created
public class MainActivity extends AppCompatActivity implements Fragemnet_a.FragmentAListener, Fragement_b.FragmentBListener {
    private Fragemnet_a fr1; //1
    private Fragement_b fr2; //2
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //3 Create the instances of the Fragments
        fr1= new Fragemnet_a();
        fr2= new Fragement_b();
        // 4 Now to display these two fragment in the Frame layout we have to call getSupportFragmentMAnager to replace two fragments in two Frame layout.
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.containerA,fr1)
                .replace(R.id.containerB,fr2).commit();

    }
    @Override
    //6
    public void onInputASent(CharSequence input) { // callback methods
        fr2.updateEditText(input);
    }
    //6
    @Override
    public void onInputBSent(CharSequence input) {// callback methods
        fr1.updateEditText(input);
    }
}