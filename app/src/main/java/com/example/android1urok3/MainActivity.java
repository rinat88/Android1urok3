package com.example.android1urok3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button start,exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initClickers();

    }
    private void initClickers() {
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,LevelActivity.class);
                startActivity(intent);
            }
        });
    }

    private void initViews() {
        start = findViewById(R.id.start_btn);
        exit = findViewById(R.id.exit_btn);

    }
}