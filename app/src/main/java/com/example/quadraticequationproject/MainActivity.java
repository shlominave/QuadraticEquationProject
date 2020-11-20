package com.example.quadraticequationproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private double A;
    private double B;
    private double C;
    private EditText aET;
    private EditText bET;
    private EditText cET;
    private TextView x1tv;
    private TextView x2tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        x1tv=findViewById(R.id.x1tv);
        x2tv=findViewById(R.id.x2tv);
        aET=findViewById(R.id.editTextNumberDecimal);
        bET=findViewById(R.id.editTextNumberDecimal2);
        cET=findViewById(R.id.editTextNumberDecimal3);
        aET.addTextChangedListener(AListener);
        bET.addTextChangedListener(BListener);
        cET.addTextChangedListener(CListener);
    }
    public void calculator(View v) {
        double delta = (double) (B*B)-(4*A*C);
        if (delta < 0) {
            x1tv.setText("NO valid solutions");
            x2tv.setText("  ");
        } else {


double answer1= (double)((-1*B+Math.sqrt(delta)) /(2*A));
double answer2=(double)((-1*B-Math.sqrt(delta)) /(2*A));

            String x1 = String.format("%.02f", answer1);
            String x2 = String.format("%.02f", answer2);
            if (delta == 0){
                x1tv.setText("x1= "+x1);
                x2tv.setText("only one solution");
            }
            else {
                x1tv.setText("x1= "+x1);
                x2tv.setText("x2= "+x2);

            }
        }
    }
    private TextWatcher AListener=new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        try {
            A=Double.parseDouble(s.toString());
        }
        catch (Exception e)
        {

        }
        }
        @Override
        public void afterTextChanged(Editable s) {

        }
    };
    private TextWatcher BListener=new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            try {
                B=Double.parseDouble(s.toString());
            }
            catch (Exception e)
            {

            }
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };
    private TextWatcher CListener=new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        try {
            C=Double.parseDouble(s.toString());
        }
        catch (Exception E)
        {

        }
        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            try {
                C=Double.parseDouble(s.toString());
            }
            catch (Exception E)
            {

            }
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };

}