package com.example.projectvictorys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Your_login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.your_login);
        TextView text = findViewById(R.id.textView_your);
        if (MainActivity.NICKNAME.trim().length() != 0)
        {text.setText(MainActivity.NICKNAME);}
        TextView Scores1 = findViewById(R.id.Scores1);
        Scores1.setText("Ваш последний счёт: " + MainActivity.SCORE3 + "/5");
        TextView Scores2 = findViewById(R.id.Scores2);
        Scores2.setText("Ваш последний счёт: " + MainActivity.SCORE4 + "/5");
        TextView Scores3 = findViewById(R.id.Scores3);
        Scores3.setText("Ваш последний счёт: " + MainActivity.SCORE + "/4");
        TextView Scores4 = findViewById(R.id.Scores4);
        Scores4.setText("Ваш последний счёт: " + MainActivity.SCORE2 + "/3");
    }
}
