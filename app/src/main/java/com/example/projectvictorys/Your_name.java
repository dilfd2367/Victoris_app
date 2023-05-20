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

public class Your_name extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.your_name);
        Button btn7 = findViewById(R.id.button7);
        ImageButton return_back2 = findViewById(R.id.image_back3);
        return_back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Your_name.this, MainActivity.class);
                startActivity(i);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Your_name.this, Play.class );
                EditText name = findViewById(R.id.NamePerson);
                String your_name = name.getText().toString();
                if (your_name.trim().length() == 0){
                    Toast toast = Toast.makeText(getApplicationContext(), "Пожалуйста, введите своё имя :)", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER, 0, 100);
                    toast.show();
                }
                else{
                    i.putExtra("NameId", your_name);
                    startActivity(i);}
            }
        });
    }
}
