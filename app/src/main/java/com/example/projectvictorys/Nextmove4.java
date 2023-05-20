package com.example.projectvictorys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Nextmove4 extends AppCompatActivity {
    public DatabaseVictorina[] Victorin4 = new DatabaseVictorina[]{
            new DatabaseVictorina(1, 4, 1, "каша", "порог", "кукуруза", "стул", "Porridge"),
            new DatabaseVictorina(2, 4, 2, "ритм","чудовище", "праздник", "стол", "Beast"),
            new DatabaseVictorina(3, 4, 4, "срок хранения", "мягкость", "совесть", "безопасность", "Safety"),
            new DatabaseVictorina(4, 4, 3, "утёнок", "блеск", "сплетня", "ритм", "Gossip"),
            new DatabaseVictorina(5, 4, 1, "статья", "название", "артист", "мягкость", "Article"),
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
    private Button btn_goback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nextmove4);
        String MyScore = getIntent().getStringExtra("Score");
        TextView textScore = findViewById(R.id.Your_score4);
        if (MainActivity.TYPE_GAME == 0){
            MainActivity.SCORE4 = MyScore;}
        else
        {MainActivity.TYPE_GAME = 0;}
        textScore.setText("Ваш результат: " + MyScore + "/5");
        text1 = findViewById(R.id.textAnswer13);
        text2 = findViewById(R.id.textAnswer14);
        text3 = findViewById(R.id.textAnswer15);
        text4 = findViewById(R.id.textAnswer16);
        text5 = findViewById(R.id.textAnswer17);
        question1 = findViewById(R.id.textQuestion13);
        question2 = findViewById(R.id.textQuestion14);
        question3 = findViewById(R.id.textQuestion15);
        question4 = findViewById(R.id.textQuestion16);
        question5 = findViewById(R.id.textQuestion17);
        text1.setText("Ответ: "+ Victorin4[0].first_ans);
        text2.setText("Ответ: " + Victorin4[1].second_ans);
        text3.setText("Ответ: " + Victorin4[2].forth_ans);
        text4.setText("Ответ: "+ Victorin4[3].third_ans);
        text5.setText("Ответ: "+ Victorin4[4].first_ans);
        question1.setText("1. " + Victorin4[0].question_text);
        question2.setText("2. " + Victorin4[1].question_text);
        question3.setText("3. " + Victorin4[2].question_text);
        question4.setText("4. " + Victorin4[3].question_text);
        question5.setText("5. " + Victorin4[4].question_text);
        ImageButton return_back = findViewById(R.id.image_back11);
        return_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Nextmove4.this, MainActivity.class);
                startActivity(i);
            }
        });
    }

}
