package com.example.counterapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    
    int counter = 0;
    TextView textCount;
    Button increment_btn, decrement_btn, reset_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        textCount = findViewById(R.id.counter);
        increment_btn = findViewById(R.id.inc);
        decrement_btn = findViewById(R.id.dec);
        reset_btn = findViewById(R.id.reset);
        counter = 0;
        
        increment_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++;
                textCount.setText(" "+counter);
                Toast.makeText(MainActivity.this, "Incremented", Toast.LENGTH_SHORT).show();
            }
        });
        
        decrement_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter--;
                textCount.setText(" "+counter);
                Toast.makeText(MainActivity.this, "Decremented", Toast.LENGTH_SHORT).show();
            }
        });
        
        reset_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter = 0;
                textCount.setText(" "+counter);
                Toast.makeText(MainActivity.this, "Reset", Toast.LENGTH_SHORT).show();
            }
        });
        
    }
}