package com.example.android1urok3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LevelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);
        findViewById(R.id.first_level).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                QuestionModel questionModel = new QuestionModel();
                questionModel.setCurrentLevel("1");
                questionModel.setQuestion("Что первое появилось");
                questionModel.setFirstVariant("Курица");
                questionModel.setSecondVariant("Яйцо");
                questionModel.setThirdVariant("Деньги");
                questionModel.setFourVariant("Скорлупа");
                questionModel.setAnswer("Курица");
                Intent intent = new Intent(LevelActivity.this,GameActivity.class);
                intent.putExtra("KEY",questionModel);
                startActivity(intent);
            }
        });
        findViewById(R.id.second_level).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                QuestionModel questionModel = new QuestionModel();
                questionModel.setCurrentLevel("1");
                questionModel.setQuestion("Зимой и летом одним цветом");
                questionModel.setFirstVariant("Кровь");
                questionModel.setSecondVariant("Глаза");
                questionModel.setThirdVariant("Ель");
                questionModel.setFourVariant("Президент");
                questionModel.setAnswer("Ель");
                Intent intent = new Intent(LevelActivity.this,GameActivity.class);
                intent.putExtra("KEY",questionModel);
                startActivity(intent);
            }
        });
    }
}