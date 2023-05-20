package com.example.projectvictorys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Play extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play);
        String your_Name = getIntent().getStringExtra("NameId");
        TextView text = findViewById(R.id.your_name);
        text.setText(your_Name);
        Button btn6 = findViewById(R.id.button7);
        ImageButton return_back2 = findViewById(R.id.image_back4);
        return_back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Play.this, Your_name.class);
                startActivity(i);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.TYPE_GAME += 1;
                EditText id_of = findViewById(R.id.id_of_victorin);
                String vict_id = id_of.getText().toString();
                if (vict_id.trim().length() != 0) {
                    int number = Integer.parseInt(vict_id);
                    if (number < 1 || number > 4) {
                        Toast toast = Toast.makeText(getApplicationContext(), "К сожалению, викторины с данным номером пока нет :( " +
                                "Введите число от 1-4", Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER, 0, -100);
                        toast.show();
                    }
                    else {
                        Intent i = new Intent(Play.this, Game.class );
                        i.putExtra("ID_of_vict", vict_id);
                        startActivity(i);}
                }
                else {
                    Toast toast = Toast.makeText(getApplicationContext(), "Пожалуйста, введите ID викторины!", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER, 0, -100);
                    toast.show();
                }

            }
        });
    }
}
