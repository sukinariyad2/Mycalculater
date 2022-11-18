package com.example.mycalculater;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView myresult;
EditText number1,number2;
Button sumbtn = findViewById(R.id.sumbtn);
    Button subbtnn;
    Button mulbtn;
    Button divbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         myresult=findViewById(R.id.myresult);
         number1=findViewById(R.id.number1);
          number2=findViewById(R.id.number2);
         subbbtnn = findViewById(R.id.subbtnn);
        mulbtn=findViewById(R.id.mulbtn);
        divbtn=findViewById(R.id.divbtn);
    }
    public void clickSum(View view){
        double mynumber1=Double.parseDouble(number1.getText().toString());
        double mynumber2=Double.parseDouble(number2.getText().toString());
        myresult.setText("Result:"+(mynumber1+mynumber2));
    }
    public void clicksub(View view){
        double mynumber1=Double.parseDouble(number1.getText().toString());
        double mynumber2=Double.parseDouble(number2.getText().toString());
        myresult.setText("Result:"+(mynumber1-mynumber2));
    }
    public void clickmul(View view){
        double mynumber1=Double.parseDouble(number1.getText().toString());
        double mynumber2=Double.parseDouble(number2.getText().toString());
        myresult.setText("Result:"+(mynumber1*mynumber2));
    }
    public void clickdiv(View view){
        double mynumber1=Double.parseDouble(number1.getText().toString());
        double mynumber2=Double.parseDouble(number2.getText().toString());
        myresult.setText("Result:"+(mynumber1/mynumber2));
    }
}