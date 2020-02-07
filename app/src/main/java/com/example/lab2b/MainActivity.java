package com.example.lab2b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView result;
    Counter counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counter = new Counter();

        Button decrementBtn = findViewById(R.id.decrementBtn);
        Button resetBtn = findViewById(R.id.resetBtn);
        Button incrementBtn = findViewById(R.id.incrementBtn);

        decrementBtn.setOnClickListener(this);
        resetBtn.setOnClickListener(this);
        incrementBtn.setOnClickListener(this);

        result = findViewById(R.id.textView);

        incrementBtn.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                counter.incrementValueLong();
                result.setText(String.valueOf(counter.counter));
                return true;
            }
        });

        decrementBtn.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                counter.decrementValueLong();
                result.setText(String.valueOf(counter.counter));
                return true;
            }
        });
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.decrementBtn:
                counter.decrementValue();
                result.setText(String.valueOf(counter.counter));
                break;

            case R.id.resetBtn:
                counter.reset();
                result.setText(String.valueOf(counter.counter));
                break;

            case R.id.incrementBtn:
                counter.incrementValue();
                result.setText(String.valueOf(counter.counter));
                break;
        }
    }

}