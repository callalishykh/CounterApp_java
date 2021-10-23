package com.example.counterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView CounterView;

    private Button incrementBtn;
    private Button decrementBtn;
    private Button resetBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUI();

        incrementBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CounterView.setText( Integer.toString(Integer.parseInt(CounterView.getText().toString())+1));
            }
        });
        decrementBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(CounterView.getText().toString())!=0) {
                    CounterView.setText(Integer.toString(Integer.parseInt(CounterView.getText().toString()) - 1));
                }
            }
        });
        resetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CounterView.setText("0");

            }
        });
    }

    private void setUI(){

        CounterView = findViewById(R.id.counterView);
        incrementBtn = findViewById(R.id.increment);
        decrementBtn = findViewById(R.id.decrement);
        resetBtn = findViewById(R.id.reset);

    }
}