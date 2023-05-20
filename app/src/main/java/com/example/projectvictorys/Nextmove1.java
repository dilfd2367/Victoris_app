package com.example.projectvictorys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Nextmove1 extends AppCompatActivity {
    public DatabaseVictorina[] Victorin1 = new DatabaseVictorina[]{
            new DatabaseVictorina(1, 1, 1, "Сатурн", "Венера", "Меркурий", "Земля", "У какой из планет имеются кольца?"),
            new DatabaseVictorina(2, 1, 3, "10", "11", "8", "9", "Сколько планет в Солнечной системе?"),
            new DatabaseVictorina(3, 1, 4, "Полярная звезда", "Сириус", "Арктур", "Солнце", "Какую самую яркую звезду мы можем увидеть на небе?"),
            new DatabaseVictorina(4, 1, 2, "Яблоня", "Большой пёс", "Коса", "Большой кот", "Выберите из этого название созвездия")
    };
    private TextView text1;
    private TextView text2;
    private TextView text3;
    private TextView text4;
    private TextView question1;
    private TextView question2;
    private TextView question3;
    private TextView question4;
    private Button btn_goback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nextmove1);
        String MyScore = getIntent().getStringExtra("Score");
        TextView textScore = findViewById(R.id.Your_score);
        if (MainActivity.TYPE_GAME == 0){
            MainActivity.SCORE = MyScore;}
        else
        {MainActivity.TYPE_GAME = 0;}
        textScore.setText("Ваш результат: " + MyScore + "/4");
        text1 = findViewById(R.id.textAnswer1);
        text2 = findViewById(R.id.textAnswer2);
        text3 = findViewById(R.id.textAnswer3);
        text4 = findViewById(R.id.textAnswer4);
        question1 = findViewById(R.id.textQuestion1);
        question2 = findViewById(R.id.textQuestion2);
        question3 = findViewById(R.id.textQuestion3);
        question4 = findViewById(R.id.textQuestion4);
        text1.setText("Ответ: " + Victorin1[0].first_ans);
        text2.setText("Ответ: " + Victorin1[1].third_ans);
        text3.setText("Ответ: " + Victorin1[2].second_ans);
        text4.setText("Ответ: " + Victorin1[3].second_ans);
        question1.setText("1. " + Victorin1[0].question_text);
        question2.setText("2. " + Victorin1[1].question_text);
        question3.setText("3. " + Victorin1[2].question_text);
        question4.setText("4. " + Victorin1[3].question_text);
        ImageButton return_back = findViewById(R.id.image_back8);
        return_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Nextmove1.this, MainActivity.class);
                startActivity(i);
            }
        });
    }

}
