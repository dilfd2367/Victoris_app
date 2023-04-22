package com.example.projectvictorys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Account extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.account);
        Button btn3 = findViewById(R.id.button_login);
        Button btn4 = findViewById(R.id.button_registr);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent y = new Intent(Account.this, All_types.class);
                EditText name = findViewById(R.id.login_input);
                String your_name = name.getText().toString();
                y.putExtra("Your_Login", your_name);
                startActivity(y);
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
