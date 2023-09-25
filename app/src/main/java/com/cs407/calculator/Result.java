package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    TextView textV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        textV = (TextView) findViewById(R.id.result);
        Intent intent = getIntent();
        String num = intent.getStringExtra("result");
        //int num = intent.getIntExtra("result", result);
        textV.setText(num);
    }
}