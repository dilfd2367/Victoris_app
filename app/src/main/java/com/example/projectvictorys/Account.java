package com.example.projectvictorys;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class Account extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.account);
        Button btn3 = findViewById(R.id.button_login);
        Button btn4 = findViewById(R.id.button_registr);
        ImageButton return_back = findViewById(R.id.image_back);
        return_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Account.this, MainActivity.class);
                startActivity(i);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText name = findViewById(R.id.login_input);
                String your_name = name.getText().toString();
                if(your_name.trim().length() != 0) {
                    Intent y = new Intent(Account.this, All_types.class);
                    y.putExtra("Your_Login", your_name);
                    special.BUTTON_SCORE = 1;
                    startActivity(y);
                }
                else
                {
                    Toast toast = Toast.makeText(getApplicationContext(), "Пожалуйста, заполните поля для входа в аккаунт!", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER, 0, 300);
                    toast.show();
                }
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent y = new Intent(Account.this, CreateAccount.class);
                startActivity(y);
            }
        });
    }
}
