package com.example.projectvictorys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class All_types extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.all_types);
        View fr1 = findViewById(R.id.frame1);
        View fr2 = findViewById(R.id.frame2);
        View fr3 = findViewById(R.id.frame3);
        View fr4 = findViewById(R.id.frame4);
        Button btn6 = findViewById(R.id.buttonVict4);
        Button btn4 = findViewById(R.id.button4);
        Button btn = findViewById(R.id.button156);
        Button btn1 = findViewById(R.id.buttonVict1);
        Button btn2 = findViewById(R.id.buttonVict2);
        Button btn3 = findViewById(R.id.buttonVict3);
        Button btn5 = findViewById(R.id.searchButton);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText search = findViewById(R.id.search);
                String Victorin = search.getText().toString();
                Victorin = Victorin.toLowerCase(Locale.ROOT);
                fr2.setVisibility(View.INVISIBLE);
                fr3.setVisibility(View.INVISIBLE);
                fr4.setVisibility(View.INVISIBLE);
                fr1.setVisibility(View.INVISIBLE);
                if ("астрономия".contains(Victorin)) {
                    fr1.setVisibility(View.VISIBLE);
                }
                if ("года".contains(Victorin)){
                    fr2.setVisibility(View.VISIBLE);
                }
                 if ("русский язык".contains(Victorin)){
                    fr3.setVisibility(View.VISIBLE);
                }
                if ("английский язык".contains(Victorin)) {
                    fr4.setVisibility(View.VISIBLE);
                }
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(All_types.this, Account.class);
                startActivity(b);
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(All_types.this, CreateAccount.class);
                startActivity(b);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(All_types.this, Game.class);
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
