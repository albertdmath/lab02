package com.cs407.labcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public void clickFunction1(View view) {
        EditText myTextField1 = (EditText) findViewById(R.id.editText1);
        EditText myTextField2 = (EditText) findViewById(R.id.editText2);
        double a = Integer.parseInt(myTextField1.getText().toString());
        double b = Integer.parseInt(myTextField2.getText().toString());
        double c = a + b;
        goToActivity(c);
    }
    public void clickFunction2(View view) {
        EditText myTextField1 = (EditText) findViewById(R.id.editText1);
        EditText myTextField2 = (EditText) findViewById(R.id.editText2);
        double a = Integer.parseInt(myTextField1.getText().toString());
        double b = Integer.parseInt(myTextField2.getText().toString());
        double c = a - b;
        goToActivity(c);
    }
    public void clickFunction3(View view) {
        EditText myTextField1 = (EditText) findViewById(R.id.editText1);
        EditText myTextField2 = (EditText) findViewById(R.id.editText2);
        double a = Integer.parseInt(myTextField1.getText().toString());
        double b = Integer.parseInt(myTextField2.getText().toString());
        double c = a * b;
        goToActivity(c);
    }
    public void clickFunction4(View view) {
        EditText myTextField1 = (EditText) findViewById(R.id.editText1);
        EditText myTextField2 = (EditText) findViewById(R.id.editText2);
        double a = Integer.parseInt(myTextField1.getText().toString());
        double b = Integer.parseInt(myTextField2.getText().toString());
        double c = a / b;
        goToActivity(c);
    }
    public void goToActivity(double c) {
        Intent intent = new Intent(this, resultOfOperationActivity.class);
        String str = String.valueOf(c);
        if(str.equals("Infinity")) {
            str = "Division by zero error!!";
        }
        intent.putExtra("message", str);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}