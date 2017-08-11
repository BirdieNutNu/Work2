package com.example.tngp17_001.cheesefactory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvNum;
    private TextView tvSign;
    private int sum = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvSign = (TextView) findViewById(R.id.tvSign);
        Button btnAdd = (Button) findViewById(R.id.btnAdd);
        Button btnSub = (Button) findViewById(R.id.btnSub);

        View.OnClickListener listener1 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button btn = (Button) v;
                tvSign.setText("" + btn.getText());
            }
        };
        btnAdd.setOnClickListener(listener1);
        btnSub.setOnClickListener(listener1);

        tvNum = (TextView) findViewById(R.id.tvNum);

        Button btn1 = (Button) findViewById(R.id.btn1);
        Button btn3 = (Button) findViewById(R.id.btn3);
        Button btn5 = (Button) findViewById(R.id.btn5);
        Button btn7 = (Button) findViewById(R.id.btn7);
        Button btn9 = (Button) findViewById(R.id.btn9);
        Button btn11 = (Button) findViewById(R.id.btn11);
        Button btnClear = (Button) findViewById(R.id.btnClear);


        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button btn = (Button) v;
//                tvNum.setText("" + btn.getText());
                Log.d("button", btn.getText().toString());
                if (btn.getText().toString().equals("clear")) {
                    sum = 0;
                    tvNum.setText("");
                    tvSign.setText("");
                } else if (tvSign.getText().toString().equals("+")) {
                    sum = sum + Integer.parseInt(btn.getText().toString());
                    tvNum.setText("" + sum);
                } else if (tvSign.getText().toString().equals("-")) {
                    sum = sum - Integer.parseInt(btn.getText().toString());
                    if (sum <= 0) {
                        sum = 0;
                    }
                    tvNum.setText("" + sum);
                }

            }
        };
        btn1.setOnClickListener(listener);
        btn3.setOnClickListener(listener);
        btn5.setOnClickListener(listener);
        btn7.setOnClickListener(listener);
        btn9.setOnClickListener(listener);
        btn11.setOnClickListener(listener);
        btnClear.setOnClickListener(listener);


    }
}
