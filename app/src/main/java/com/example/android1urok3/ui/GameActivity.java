package com.example.android1urok3.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android1urok3.R;

public class GameActivity extends AppCompatActivity {
    Button firstAnswer, secondAnswer, thirdAnswer, fourAnswer;
    TextView currentLevelTv, questionTv;
    QuestionModel questionModel;
    private String answer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        initViews();
        setQuestion();
        click();
    }

    private void initViews() {
        currentLevelTv = findViewById(R.id.level_tv);
        questionTv = findViewById(R.id.question_tv);
        firstAnswer = findViewById(R.id.first_answer);
        secondAnswer = findViewById(R.id.second_answer);
        thirdAnswer = findViewById(R.id.third_answer);
        fourAnswer = findViewById(R.id.four_answer);
    }


    private void setQuestion() {
        questionModel = (QuestionModel) getIntent().getSerializableExtra("KEY");
        if (questionModel != null) {
            currentLevelTv.setText(questionModel.getCurrentLevel());
            questionTv.setText(questionModel.getQuestion());
            firstAnswer.setText(questionModel.getFirstVariant());
            secondAnswer.setText(questionModel.getSecondVariant());
            thirdAnswer.setText(questionModel.getThirdVariant());
            fourAnswer.setText(questionModel.getFourVariant());
            answer = questionModel.getAnswer();
        }
    }
    private void click() {
        firstAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (firstAnswer.getText() == answer){
                    Toast.makeText(GameActivity.this, "True", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(GameActivity.this, "False", Toast.LENGTH_SHORT).show();
                }

            }
        });
        secondAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (secondAnswer.getText() == answer){
                    Toast.makeText(GameActivity.this, "True", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(GameActivity.this, "False", Toast.LENGTH_SHORT).show();
                }
            }
        });
        thirdAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (thirdAnswer.getText() == answer){
                    Toast.makeText(GameActivity.this, "True", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(GameActivity.this, "False", Toast.LENGTH_SHORT).show();
                }
            }
        });
        fourAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (fourAnswer.getText() == answer){
                    Toast.makeText(GameActivity.this, "True", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(GameActivity.this, "False", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}