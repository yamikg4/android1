package com.example.fragementdemo;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * A simple {@link Fragment} subclass.
 * Use the  factory method to
 * create an instance of this fragment.
 */
public class Fragement_b extends Fragment {

    FragmentBListener listener;// 7 create a variable for FragmentListener
    EditText et1;//1
    Button bt1;//2
    // 6 In order to communicate with activity we have to create interface
    public interface FragmentBListener{
        void onInputBSent(CharSequence input);
    }

    @Nullable  //3 fragment knows which layout to show for that we have to inflate the layout.
    @Override // for that override onCreateView()
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // 4 how fragment will be added to parent layout.
        View view=inflater.inflate(R.layout.fragment_fragement_b, container, false);
        // 5 return the view
        et1=view.findViewById(R.id.edt1);
        bt1=view.findViewById(R.id.button1);
        bt1.setOnClickListener(new View.OnClickListener() { //8
            @Override
            public void onClick(View v) {
                CharSequence input =et1.getText();// 9 get input from the editText and send it to MainActivity and to other Fragment.
                listener.onInputBSent(input); //10 represents to whoever implements this interface in our case we have MainActivity
            }
        });
        return view;
    }
    // 16 One method which will update editText
    public void updateEditText(CharSequence newText){ // data from activity to fragment
        et1.setText(newText);// 17 this is how we getdata from activity in to fragment

    }
    @Override // 11 called when fragment will attach to activity
    public void onAttach(@NonNull Context context) { // called when fragment will attach to activity
        super.onAttach(context);
        if(context instanceof FragmentBListener){ // 12 to check whether our activity implements interface
            listener=(FragmentBListener) context; // 13 here context is our MainActivity
        }else{ // 14 if we forget then throw an exception with erroer message
            throw new RuntimeException((context.toString() + "Must Implement FragmentBListener"));
        }
    }
    // 15 Override onDetach() method when we remove the fragment from our activity make the listener to null
    @Override
    public void onDetach() {
        super.onDetach();
        listener=null;
    }
}
