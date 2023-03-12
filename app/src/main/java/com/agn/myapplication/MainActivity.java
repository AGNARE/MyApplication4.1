package com.agn.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    private MaterialButton buttonNext;
    private EditText name;
    private EditText fatherName;
    private EditText fulName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonNext = findViewById(R.id.MaterialButtonNext);
        name = findViewById(R.id.editText_name);
        fatherName = findViewById(R.id.editText_nameName);
        fulName = findViewById(R.id.editText_fuulName);
    }

    @Override
    protected void onStart() {
        super.onStart();
        buttonNext.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this,SecondActivity.class);
            String name1 = ((EditText) findViewById(R.id.editText_name)).getText().toString();
            String name2 = ((EditText) findViewById(R.id.editText_nameName)).getText().toString();
            String name3 = ((EditText) findViewById(R.id.editText_fuulName)).getText().toString();
            intent.putExtra("Key", name1);
            intent.putExtra("key2", name2);
            intent.putExtra("key3", name3);
            startActivity(intent);
    });


}
}