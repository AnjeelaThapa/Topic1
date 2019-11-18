package com.example.topic1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CalculatorActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6,
            btn7, btn8, btn9, btn0, btnadd, btnsub, btnmultiply, btndivide, btncalculate, btndecimal;
    Button btnclear;
    EditText txtnumber;
    float firstnumber, secondnumber;
    boolean add, sub, multiply, divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        this.bindProperties();
        this.clickListener();
    }

    public void bindProperties(){
        btn0= findViewById(R.id.btn0);
        btn1= findViewById(R.id.btn1);
        btn2= findViewById(R.id.btn2);
        btn3= findViewById(R.id.btn3);
        btn4= findViewById(R.id.btn4);
        btn5= findViewById(R.id.btn5);
        btn6= findViewById(R.id.btn6);
        btn7= findViewById(R.id.btn7);
        btn8= findViewById(R.id.btn8);
        btn9= findViewById(R.id.btn9);
        btnadd= findViewById(R.id.btnadd);
        btnsub= findViewById(R.id.btnsub);
        btnmultiply= findViewById(R.id.btnmultiply);
        btndivide= findViewById(R.id.btndivide);
        btndecimal= findViewById(R.id.btndecimal);
        btncalculate= findViewById(R.id.btncalculate);
        txtnumber= findViewById(R.id.txtnumber);
        btnclear= findViewById(R.id.btnclear);
    }

    public void clickListener(){
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtnumber.setText(txtnumber.getText()+"0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtnumber.setText(txtnumber.getText()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtnumber.setText(txtnumber.getText()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtnumber.setText(txtnumber.getText()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtnumber.setText(txtnumber.getText()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtnumber.setText(txtnumber.getText()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtnumber.setText(txtnumber.getText()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtnumber.setText(txtnumber.getText()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtnumber.setText(txtnumber.getText()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtnumber.setText(txtnumber.getText()+"9");
            }
        });
        btndecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtnumber.setText(txtnumber.getText()+".");
            }
        });
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(txtnumber==null){
                 txtnumber.setText("");
                }
                else
                    firstnumber= Float.parseFloat(txtnumber.getText()+"");
                add=true;
                txtnumber.setText(null);
            }
        });
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtnumber==null){
                    txtnumber.setText("");
                }
                else
                    firstnumber= Float.parseFloat(txtnumber.getText()+"");
                sub=true;
                txtnumber.setText(null);
            }
        });
        btnmultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtnumber==null){
                    txtnumber.setText("");
                }
                else
                    firstnumber= Float.parseFloat(txtnumber.getText()+"");
                multiply=true;
                txtnumber.setText(null);
            }
        });
        btndivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtnumber==null){
                    txtnumber.setText("");
                }
                else
                    firstnumber= Float.parseFloat(txtnumber.getText()+"");
                divide=true;
                txtnumber.setText(null);
            }
        });
        btncalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secondnumber= Float.parseFloat(txtnumber.getText()+"");
                if(add==true){
                    txtnumber.setText(firstnumber+secondnumber+"");
                    add=false;
                }
                else if(sub==true){
                    txtnumber.setText(firstnumber-secondnumber+"");
                    sub=false;
                }
                else if(multiply==true){
                    txtnumber.setText(firstnumber*secondnumber+"");
                    multiply=false;
                }
                else if(divide==true){
                    txtnumber.setText(firstnumber/secondnumber+"");
                    divide=false;
                }
            }
        });
        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtnumber.setText("");
            }
        });

    }
}
