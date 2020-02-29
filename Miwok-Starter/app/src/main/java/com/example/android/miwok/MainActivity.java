package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        NumberClickListeners clickListener = new NumberClickListeners();
        //find the view that shows the number category
        TextView numbers = (TextView) findViewById(R.id.numbers);
        //set  a clicklistener on that view
        numbers.setOnClickListener(clickListener);

    }

}
