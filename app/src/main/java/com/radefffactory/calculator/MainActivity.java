package com.radefffactory.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;




public class MainActivity extends AppCompatActivity {

Button btn1, btn2, btn3, btn4;
TextView tv1, tv2, tv3, tv4;
EditText ed1, ed2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button B1 = (Button) findViewById(R.id.btn1);
        Button B2 = (Button) findViewById(R.id.btn2);
        Button B3 = (Button) findViewById(R.id.btn3);
        Button B4 = (Button) findViewById(R.id.btn4);









            B1.setOnClickListener(new View.OnClickListener() {
                @Override

                public void onClick(View v) {


                    EditText sum1 = (EditText) findViewById(R.id.ed1);
                    EditText sum2 = (EditText) findViewById(R.id.ed2);
                    double num1 = Double.parseDouble(sum1.getText().toString());
                    double num2 = Double.parseDouble(sum2.getText().toString());
                    double sum = num1 + num2;
                    TextView TVsum = (TextView) findViewById(R.id.tv4);
                    TVsum.setText((Double.toString(sum)));

                }
            });

            B2.setOnClickListener(new View.OnClickListener() {
                @Override

                public void onClick(View v) {


                    EditText min1 = (EditText) findViewById(R.id.ed1);
                    EditText min2 = (EditText) findViewById(R.id.ed2);
                    double num1 = Double.parseDouble(min1.getText().toString());
                    double num2 = Double.parseDouble(min2.getText().toString());
                    double min = num1 - num2;
                    TextView TVmin = (TextView) findViewById(R.id.tv4);
                    TVmin.setText((Double.toString(min)));

                }
            });

        B3.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {


                EditText mul1 = (EditText) findViewById(R.id.ed1);
                EditText mul2 = (EditText) findViewById(R.id.ed2);
                double num1 = Double.parseDouble(mul1.getText().toString());
                double num2 = Double.parseDouble(mul2.getText().toString());
                double mul = num1 * num2;
                TextView TVmul = (TextView) findViewById(R.id.tv4);
                TVmul.setText((Double.toString(mul)));

            }
        });

        B4.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {


                EditText div1 = (EditText) findViewById(R.id.ed1);
                EditText div2 = (EditText) findViewById(R.id.ed2);
                double num1 = Double.parseDouble(div1.getText().toString());
                double num2 = Double.parseDouble(div2.getText().toString());
                double div = num1 / num2;
                TextView TVdiv = (TextView) findViewById(R.id.tv4);
                TVdiv.setText((Double.toString(div)));
            }
        });



    }


}
