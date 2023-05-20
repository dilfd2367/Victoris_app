package com.example.projectvictorys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class CreateAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.createaccount);
        Button btn = findViewById(R.id.button_login);
        ImageButton return_back = findViewById(R.id.image_back5);
        return_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CreateAccount.this, MainActivity.class);
                startActivity(i);
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText name = findViewById(R.id.login_input);
                String your_name = name.getText().toString();
                if (your_name.trim().length() != 0){
                    special.BUTTON_SCORE += 1;
                    Intent y = new Intent(CreateAccount.this, All_types.class);
                    y.putExtra("Your_Login", your_name);
                    MainActivity.SCORE = "0";
                    MainActivity.SCORE2 = "0";
                    MainActivity.SCORE3 = "0";
                    MainActivity.SCORE4 = "0";
                    startActivity(y);
                }
                else{
                    Toast toast = Toast.makeText(getApplicationContext(), "Пожалуйста, заполните поля для регистрации!", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER, 0, 300);
                    toast.show();
                }
            }
        });
    }
}
