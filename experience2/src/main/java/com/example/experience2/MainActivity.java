package com.example.experience2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private long plusFirst = 0;
    private long subtractFirst = 0;
    private long step = 516074970;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button plus2 = findViewById(R.id.plus2);
        Button subtract2 = findViewById(R.id.subtract2);
        Button plus1 = findViewById(R.id.plus1);
        Button subtract1 = findViewById(R.id.subtract1);
        Button long0 = findViewById(R.id.long0);

        plus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textView = findViewById(R.id.amount);
                textView.setText(String.valueOf(Integer.valueOf(textView.getText().toString())+1));
            }
        });
        subtract1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textView = findViewById(R.id.amount);
                textView.setText(String.valueOf(Integer.valueOf(textView.getText().toString())-1));
            }
        });

        long0.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                TextView textView = findViewById(R.id.amount);
                textView.setText("0");
                return false;
            }
        });



        plus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(System.nanoTime() - plusFirst <= step){
                    TextView textView = findViewById(R.id.amount);
                    textView.setText(String.valueOf(Integer.valueOf(textView.getText().toString())+2));
                }
                plusFirst = System.nanoTime();
            }
        });

        subtract2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(System.nanoTime() - subtractFirst <= step){
                    TextView textView = findViewById(R.id.amount);
                    textView.setText(String.valueOf(Integer.valueOf(textView.getText().toString())-2));
                }
                subtractFirst = System.nanoTime();
            }
        });
    }
}
