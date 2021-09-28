package com.example.android1urok3.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.android1urok3.R;
import com.example.android1urok3.adapter.GameAdapter;
import com.example.android1urok3.data.GameClient;
import com.example.android1urok3.interfa.OnItemClickListener;

import java.util.ArrayList;
import java.util.List;

public class LevelActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    GameAdapter gameAdapter;
    List<QuestionModel> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);
        recyclerView = findViewById(R.id.recycler_view);
        list = GameClient.getQuiz();
        gameAdapter = new GameAdapter(list);
        recyclerView.setAdapter(gameAdapter);
        gameAdapter.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void itemClick(int position, QuestionModel questionModel) {
                Intent intent = new Intent(LevelActivity.this,GameActivity.class);
                intent.putExtra("KEY",questionModel);
                startActivity(intent);
            }
        });
    }
}