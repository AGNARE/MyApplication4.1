package com.agn.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView menu;
    private TextView menuTwo;
    private TextView menuThree;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        menu = findViewById(R.id.textViewMenu);
        menuTwo = findViewById(R.id.textViewMenuTwo);
        menuThree = findViewById(R.id.textViewThree);
        menu.setText(getIntent().getStringExtra("Key"));
        menuTwo.setText(getIntent().getStringExtra("Key2"));
        menuThree.setText(getIntent().getStringExtra("Key3"));
    }
}