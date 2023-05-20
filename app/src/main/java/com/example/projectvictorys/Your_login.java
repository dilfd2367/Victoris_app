package com.example.projectvictorys;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Your_login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.your_login);
        Button btn_logout = findViewById(R.id.go_back);
        ImageButton btn_back = findViewById(R.id.image_back6);
        btn_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showInfoAlert("Вы уверены, что хотите выйти из аккаунта?");
            }
        });
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                special.BUTTON_SCORE = 2;
                Intent i = new Intent(Your_login.this, All_types.class);
                startActivity(i);
            }
        });
        TextView text = findViewById(R.id.textView_your);
        if (special.NICKNAME.trim().length() != 0)
        {text.setText(special.NICKNAME);}
        TextView Scores1 = findViewById(R.id.Scores1);
        Scores1.setText("Ваш последний счёт: " + MainActivity.SCORE3 + "/5");
        TextView Scores2 = findViewById(R.id.Scores2);
        Scores2.setText("Ваш последний счёт: " + MainActivity.SCORE4 + "/5");
        TextView Scores3 = findViewById(R.id.Scores3);
        Scores3.setText("Ваш последний счёт: " + MainActivity.SCORE + "/4");
        TextView Scores4 = findViewById(R.id.Scores4);
        Scores4.setText("Ваш последний счёт: " + MainActivity.SCORE2 + "/3");
    }
    private void showInfoAlert(String text){
        AlertDialog.Builder builder = new AlertDialog.Builder(Your_login.this);
        builder.setTitle("Подтверждение")
                .setMessage(text)
                .setCancelable(false)
                .setPositiveButton("Да", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        special.BUTTON_SCORE = 0;
                        Intent i = new Intent(Your_login.this,MainActivity.class);
                        startActivity(i);
                    }
                })
                .setNegativeButton("Нет", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
        AlertDialog dialogg = builder.create();
        dialogg.show();
    }
}
