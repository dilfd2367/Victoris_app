package com.example.projectvictorys;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Nextmove3 extends AppCompatActivity {
    public DatabaseVictorina[] Victorin3 = new DatabaseVictorina[]{
            new DatabaseVictorina(1, 3, 2, "видеть", "брить", "гнать", "держать", "Выбери глагол относящийся к 1 спряжению"),
            new DatabaseVictorina(1, 3, 4, "искать", "бороться", "убирать", "бесить", "Выбери глагол относящийся ко 2 спряжению"),
            new DatabaseVictorina(1, 3, 2, "черпать", "варить", "брызгать", "понять", "Выбери глагол относящийся к 2 спряжению"),
            new DatabaseVictorina(1, 3, 1, "загнать", "укрепить", "спустить", "вылить", "Выбери глагол относящийся к 1 спряжению"),
            new DatabaseVictorina(1, 3, 3, "спать", "играть", "бежать", "стоять", "Выбери разноспрягаемый глагол"),
    };
    private TextView text1;
    private TextView text2;
    private TextView text3;
    private TextView text4;
    private TextView text5;
    private TextView question1;
    private TextView question2;
    private TextView question3;
    private TextView question4;
    private TextView question5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nextmove3);
        String MyScore = getIntent().getStringExtra("Score");
        TextView textScore = findViewById(R.id.Your_score3);
        MainActivity.SCORE3 = MyScore;
        textScore.setText("Ваш результат: " + MyScore + "/5");
        text1 = findViewById(R.id.textAnswer8);
        text2 = findViewById(R.id.textAnswer9);
        text3 = findViewById(R.id.textAnswer10);
        text4 = findViewById(R.id.textAnswer11);
        text5 = findViewById(R.id.textAnswer12);
        question1 = findViewById(R.id.textQuestion8);
        question2 = findViewById(R.id.textQuestion9);
        question3 = findViewById(R.id.textQuestion10);
        question4 = findViewById(R.id.textQuestion11);
        question5 = findViewById(R.id.textQuestion12);
        text1.setText("Ответ: "+ Victorin3[0].second_ans);
        text2.setText("Ответ: " + Victorin3[1].forth_ans);
        text3.setText("Ответ: " + Victorin3[2].second_ans);
        text4.setText("Ответ: "+ Victorin3[3].first_ans);
        text5.setText("Ответ: "+ Victorin3[4].third_ans);
        question1.setText("1. " + Victorin3[0].question_text);
        question2.setText("2. " + Victorin3[1].question_text);
        question3.setText("3. " + Victorin3[2].question_text);
        question4.setText("4. " + Victorin3[3].question_text);
        question5.setText("5. " + Victorin3[4].question_text);
    }

}
