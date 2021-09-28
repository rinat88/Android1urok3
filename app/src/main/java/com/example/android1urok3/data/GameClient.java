package com.example.android1urok3.data;

import com.example.android1urok3.ui.QuestionModel;

import java.util.ArrayList;
import java.util.List;

public class GameClient {

    public static List<QuestionModel> list = new ArrayList<>();

    public static List<QuestionModel> getQuiz() {

        list.add(new QuestionModel("One Level","Что первое появилось","Курица",
                "Яйцо", "Деньги","Скорлупа","Курица"));

        list.add(new QuestionModel("Two Level","Зимой и летом одним цветом", "Ель",
                "Глаза", "Ель","Президент","Кровь"));

        return list;
    }


}
