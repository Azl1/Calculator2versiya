package com.abdullaev.calculator2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button button0;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button buttonPlus;
    Button buttonMinus;
    Button buttonMultiply;
    Button buttonDivision;
    Button buttonReset;
    Button buttonEquals;

    String display = "";
    Integer oneElement = 0;
    Action action;


    public enum Action {
        PLUS, MINUS, MULTIPLY, DIVISION, EQUALS, RESET, NONE;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view();


        button0.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            display = display + "0";
            textView.setText(display);

        }
    });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display = display + "1";
                textView.setText(display);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display = display + "2";
                textView.setText(display);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display = display + "3";
                textView.setText(display);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display = display + "4";
                textView.setText(display);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display = display + "5";
                textView.setText(display);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display = display + "6";
                textView.setText(display);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display = display + "7";
                textView.setText(display);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display = display + "8";
                textView.setText(display);
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display = display + "9";
                textView.setText(display);
            }
        });

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("+");
              oneElement = Integer.parseInt(display);
              display = "";
              action = Action.PLUS;
            }
        });

        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("-");
                oneElement = Integer.parseInt(display);
                display = "";
                action = Action.MINUS;
            }
        });

        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("*");
                oneElement = Integer.parseInt(display);
                display = "";
                action = Action.MULTIPLY;
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("/");
                oneElement = Integer.parseInt(display);
                display = "";
                action = Action.DIVISION;
            }
        });

        buttonEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer result = 0;
                switch (action) {
                    case PLUS:
                        result = oneElement + Integer.parseInt(display);
                        break;
                    case MINUS:
                        result = oneElement - Integer.parseInt(display);
                        break;
                    case MULTIPLY:
                        result = oneElement * Integer.parseInt(display);
                        break;
                    case DIVISION:
                        result = oneElement / Integer.parseInt(display);
                        break;
                }
                textView.setText(String.valueOf(result));
                display = "";
                oneElement = 0;
            }
        });

        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display = "";
                textView.setText(display);
            }
        });

    }


    public void view() {
        textView = findViewById(R.id.text);
        button0 = findViewById(R.id.zero);
        button1 = findViewById(R.id.one);
        button2 = findViewById(R.id.two);
        button3 = findViewById(R.id.three);
        button4 = findViewById(R.id.four);
        button5 = findViewById(R.id.five);
        button6 = findViewById(R.id.six);
        button7 = findViewById(R.id.seven);
        button8 = findViewById(R.id.eight);
        button9 = findViewById(R.id.nine);
        buttonPlus = findViewById(R.id.plus);
        buttonMinus = findViewById(R.id.minus);
        buttonMultiply = findViewById(R.id.multiply);
        buttonDivision = findViewById(R.id.division);
        buttonEquals = findViewById(R.id.equals);
        buttonReset = findViewById(R.id.reset);

    }
}