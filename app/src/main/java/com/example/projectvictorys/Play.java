package com.example.projectvictorys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

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
       btn6.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
//               try {
//                   Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/victoris","root", "");
//               } catch (SQLException e) {
//                   e.printStackTrace();
//               }
//               try {
//                   Class.forName("com.mysql.jdbc.Driver");
//               } catch (ClassNotFoundException e) {
//                   System.out.println("Where is your MySQL JDBC Driver?");
//                   e.printStackTrace();
//                   return;
//               }
               MainActivity.TYPE_GAME = 1;
               Intent i = new Intent(Play.this, Game.class );
               EditText id_of = findViewById(R.id.id_of_victorin);
               String vict_id = id_of.getText().toString();
               i.putExtra("ID_of_vict", vict_id);
               startActivity(i);
           }
       });
    }
}
