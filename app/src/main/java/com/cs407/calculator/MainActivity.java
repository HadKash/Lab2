package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToActivity(String result){
        Intent intent = new Intent(this, Result.class);
        intent.putExtra("result", result);
        startActivity(intent);
    }

    public void addButtonClick(View view) {
        EditText textField1 = (EditText) findViewById(R.id.num1);
        EditText textField2 = (EditText) findViewById(R.id.num2);
        String n1 = textField1.getText().toString();
        String n2 = textField2.getText().toString();
        int num1 = Integer.parseInt(n1);
        int num2 = Integer.parseInt(n2);
        int sum = num1 + num2;
        String sumStr = String.valueOf(sum);
        goToActivity(sumStr);
    }

    public void subtractButtonClick(View view) {
        EditText textField1 = (EditText) findViewById(R.id.num1);
        EditText textField2 = (EditText) findViewById(R.id.num2);
        String n1 = textField1.getText().toString();
        String n2 = textField2.getText().toString();
        int num1 = Integer.parseInt(n1);
        int num2 = Integer.parseInt(n2);
        int difference = num1 - num2;
        String diffStr = String.valueOf(difference);
        goToActivity(diffStr);
    }

    public void multButtonClick(View view) {
        EditText textField1 = (EditText) findViewById(R.id.num1);
        EditText textField2 = (EditText) findViewById(R.id.num2);
        String n1 = textField1.getText().toString();
        String n2 = textField2.getText().toString();
        int num1 = Integer.parseInt(n1);
        int num2 = Integer.parseInt(n2);
        int product = num1 * num2;
        String productStr = String.valueOf(product);
        goToActivity(productStr);
    }

    public void divideButtonClick(View view) {
        EditText textField1 = (EditText) findViewById(R.id.num1);
        EditText textField2 = (EditText) findViewById(R.id.num2);
        String n1 = textField1.getText().toString();
        String n2 = textField2.getText().toString();
        if (n2.equals("0")) {
            goToActivity("Error: Quotient cannot be divisible by 0");
        }
        int num1 = Integer.parseInt(n1);
        int num2 = Integer.parseInt(n2);
        int quotient = num1 / num2;
        String qStr = String.valueOf(quotient);
        goToActivity(qStr);
    }


}