package com.example.anroid_fragment_2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class First_Fragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_first_, container, false);


        EditText EtFrag=v.findViewById(R.id.ET1);
        Button fragButton= v.findViewById(R.id.fbn1);

       fragButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Toast.makeText(getActivity(), ""+EtFrag.getText(), Toast.LENGTH_SHORT).show();
           }
       });

        return v;
    }
}