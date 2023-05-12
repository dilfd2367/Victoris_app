package com.example.projectvictorys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Nextmove2 extends AppCompatActivity {
    public DatabaseVictorina[] Victorin2 = new DatabaseVictorina[]{
            new DatabaseVictorina(1, 2, 1, "17098242 км²", "243610 км²", "9596960 км²", "312685 км²", "Площадь территории России?"),
            new DatabaseVictorina(2, 2, 3, "Машук", "Народная", "Эльбрус", "Белуха", "Самая высокая гора России?"),
            new DatabaseVictorina(3, 2, 2, "Ладожское", "Байкал", "Каспийское", "Онежское", "Самое глубокое озеро России?"),
    };
    private TextView text1;
    private TextView text2;
    private TextView text3;
    private TextView question1;
    private TextView question2;
    private TextView question3;
    private Button btn_goback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nextmove2);
        String MyScore = getIntent().getStringExtra("Score");
        TextView textScore = findViewById(R.id.Your_score2);
        textScore.setText("Ваш результат: " + MyScore + "/3");
        if (MainActivity.TYPE_GAME == 0){
            MainActivity.SCORE2 = MyScore;}
        else
        {MainActivity.TYPE_GAME = 0;}
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
        btn_goback = findViewById(R.id.go_back);
        btn_goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Nextmove2.this, MainActivity.class);
                startActivity(i);
            }
        });
    }

}
