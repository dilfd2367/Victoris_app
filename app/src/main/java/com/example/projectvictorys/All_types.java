package com.example.projectvictorys;

import static android.app.PendingIntent.getActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import java.util.Locale;

public class All_types extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.all_types);
        View fr1 = findViewById(R.id.frame1);
        View fr2 = findViewById(R.id.frame2);
        if (special.BUTTON_SCORE == 1){
            String Your_Login = getIntent().getStringExtra("Your_Login");
            special.NICKNAME = Your_Login;
            special.BUTTON_SCORE += 1;}
        Button btn_account = findViewById(R.id.button_alltypes);
        View fr3 = findViewById(R.id.frame3);
        View fr4 = findViewById(R.id.frame4);
        Button btn6 = findViewById(R.id.buttonVict4);
        Button btn1 = findViewById(R.id.buttonVict1);
        Button btn2 = findViewById(R.id.buttonVict2);
        Button btn3 = findViewById(R.id.buttonVict3);
        ImageButton return_back2 = findViewById(R.id.image_back2);
        return_back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                special.BUTTON_SCORE = 2;
                Intent i = new Intent(All_types.this, MainActivity.class);
                startActivity(i);
            }
        });
        btn_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(All_types.this, Your_login.class);
                startActivity(b);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(All_types.this, Game.class);
                String vict_id = "1";
                b.putExtra("ID_of_vict", vict_id);
                startActivity(b);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(All_types.this, Game.class);
                String vict_id = "2";
                b.putExtra("ID_of_vict", vict_id);
                startActivity(b);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(All_types.this, Game.class);
                String vict_id = "3";
                b.putExtra("ID_of_vict", vict_id);
                startActivity(b);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(All_types.this, Game.class);
                String vict_id = "4";
                b.putExtra("ID_of_vict", vict_id);
                startActivity(b);
            }
        });
    }
}
