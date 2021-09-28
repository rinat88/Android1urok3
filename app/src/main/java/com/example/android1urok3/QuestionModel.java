package com.example.android1urok3;

import java.io.Serializable;

public class QuestionModel implements Serializable {
    private String currentLevel;
    private String question;
    private String answer;
    private String firstVariant;
    private String secondVariant;
    private String thirdVariant;
    private String fourVariant;

    public String getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(String currentLevel) {
        this.currentLevel = currentLevel;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getFirstVariant() {
        return firstVariant;
    }

    public void setFirstVariant(String firstVariant) {
        this.firstVariant = firstVariant;
    }

    public String getSecondVariant() {
        return secondVariant;
    }

    public void setSecondVariant(String secondVariant) {
        this.secondVariant = secondVariant;
    }

    public String getThirdVariant() {
        return thirdVariant;
    }

    public void setThirdVariant(String thirdVariant) {
        this.thirdVariant = thirdVariant;
    }

    public String getFourVariant() {
        return fourVariant;
    }

    public void setFourVariant(String fourVariant) {
        this.fourVariant = fourVariant;
    }
}
