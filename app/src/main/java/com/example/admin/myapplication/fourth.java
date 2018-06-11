package com.example.admin.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class fourth extends AppCompatActivity {

    Spinner dropdown;
    String [] fruits = {"apple", "banana", "chuoi"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        dropdown = findViewById(R.id.dropdown);

        ArrayAdapter<String> da = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, fruits);

        dropdown.setAdapter(da);
    }
}
