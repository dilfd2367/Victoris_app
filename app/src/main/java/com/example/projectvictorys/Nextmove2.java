package com.example.projectvictorys;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Nextmove2 extends AppCompatActivity {
    public DatabaseVictorina[] Victorin2 = new DatabaseVictorina[]{
            new DatabaseVictorina(1, 2, 1, "1961", "1691", "1965", "1963", "В каком году Юрий Гагарин полетел в космос?"),
            new DatabaseVictorina(2, 2, 3, "1699", "1789", "1799", "1801", "В каком году родился Пушкин?"),
            new DatabaseVictorina(3, 2, 2, "1985", "1812", "1900", "1712", "Год Отечественной войны с Наполеоном?"),
    };
    private TextView text1;
    private TextView text2;
    private TextView text3;
    private TextView question1;
    private TextView question2;
    private TextView question3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nextmove2);
        String MyScore = getIntent().getStringExtra("Score");
        TextView textScore = findViewById(R.id.Your_score2);
        textScore.setText("Ваш результат: " + MyScore + "/3");
        MainActivity.SCORE2 = MyScore;
        text1 = findViewById(R.id.textAnswer5);
        text2 = findViewById(R.id.textAnswer6);
        text3 = findViewById(R.id.textAnswer7);
        question1 = findViewById(R.id.textQuestion5);
        question2 = findViewById(R.id.textQuestion6);
        question3 = findViewById(R.id.textQuestion7);
        text1.setText("Ответ: " + Victorin2[0].first_ans);
        text2.setText("Ответ: " + Victorin2[1].third_ans);
        text3.setText("Ответ: " + Victorin2[2].second_ans);
        question1.setText("1. " + Victorin2[0].question_text);
        question2.setText("2. " + Victorin2[1].question_text);
        question3.setText("3. " + Victorin2[2].question_text);
    }

}
