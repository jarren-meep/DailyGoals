package com.myapplicationdev.android.dailygoals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent i = getIntent();
        String info = i.getStringExtra("info");

        String rad1 = i.getStringExtra("rad1");
        String rad2 = i.getStringExtra("rad2");
        String rad3 = i.getStringExtra("rad3");


        TextView tv1 = findViewById(R.id.textView);
        tv1.setText("Read up on materials before class: " + rad1 + "\nArrive on time so as not to miss important part of lesson: " + rad2 + "\nAttempt the problem myself: " + rad3 + "\nReflection: " + info);
    }
}