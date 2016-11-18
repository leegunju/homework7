package com.example.a403.calculator;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etNum1;
    EditText etNum2;

    Button btnAdd;
    Button btnSub;
    Button btnMult;
    Button btnDiv;

    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNum1 = (EditText)findViewById(R.id.editText);
        etNum2 = (EditText)findViewById(R.id.editText2);
        btnAdd = (Button)findViewById(R.id.button);
        btnSub = (Button)findViewById(R.id.button2);
        btnMult = (Button)findViewById(R.id.button3);
        btnDiv = (Button)findViewById(R.id.button4);
        tvResult = (TextView)findViewById(R.id.textView2);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = etNum1.getText().toString();
                String num2 = etNum2.getText().toString();

                int inum1 = Integer.parseInt(num1);
                int inum2 = Integer.parseInt(num2);

                int result = inum1 + inum2;
                tvResult.setText(result +"");
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = etNum1.getText().toString();
                String num2 = etNum2.getText().toString();

                int inum1 = Integer.parseInt(num1);
                int inum2 = Integer.parseInt(num2);

                int result = inum1 - inum2;
                tvResult.setText(result +"");
            }
        });

        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = etNum1.getText().toString();
                String num2 = etNum2.getText().toString();

                int inum1 = Integer.parseInt(num1);
                int inum2 = Integer.parseInt(num2);

                int result = inum1 * inum2;
                tvResult.setText(result +"");
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = etNum1.getText().toString();
                String num2 = etNum2.getText().toString();

                int inum1 = Integer.parseInt(num1);
                int inum2 = Integer.parseInt(num2);

                int result = inum1 / inum2;
                tvResult.setText(result +"");
            }
        });
    }
}
