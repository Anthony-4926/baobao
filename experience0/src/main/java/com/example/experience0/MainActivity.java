package com.example.experience0;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText name = findViewById(R.id.name);
                EditText telephone = findViewById(R.id.telephone);
                TextView content = findViewById(R.id.content);
                String information = name.getText().toString() + "的电话号码是：\n"+telephone.getText().toString();
                content.setText(information);
            }
        });

    }
}

