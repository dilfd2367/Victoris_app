package com.example.projectvictorys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Currency;


public class Game extends AppCompatActivity {
    public DatabaseVictorina[] Victorin1 = new DatabaseVictorina[]{
            new DatabaseVictorina(1, 1, 1, "Сатурн", "Венера", "Меркурий", "Земля", "У какой из планет имеются кольца?"),
            new DatabaseVictorina(2, 1, 3, "10", "11", "8", "9", "Сколько планет в Солнечной системе?"),
            new DatabaseVictorina(3, 1, 4, "Полярная звезда", "Сириус", "Арктур", "Солнце", "Какую самую яркую звезду мы можем наблюдать на небе?"),
            new DatabaseVictorina(4, 1, 2, "Яблоня", "Большой пёс", "Коса", "Большой кот", "Выберите из этого название созвездия")
    };
    public DatabaseVictorina[] Victorin2 = new DatabaseVictorina[]{
            new DatabaseVictorina(1, 2, 1, "1961", "1691", "1965", "1963", "В каком году Юрий Гагарин полетел в космос?"),
            new DatabaseVictorina(2, 2, 3, "1699", "1789", "1799", "1801", "В каком году родился Пушкин?"),
            new DatabaseVictorina(3, 2, 2, "1985", "1812", "1900", "1712", "Год Отечественной войны с Наполеоном?"),
    };
    public DatabaseVictorina[] Victorin3 = new DatabaseVictorina[]{
            new DatabaseVictorina(1, 3, 2, "видеть", "брить", "гнать", "держать", "Выбери глагол относящийся к 1 спряжению"),
            new DatabaseVictorina(2, 3, 4, "искать", "бороться", "убирать", "бесить", "Выбери глагол относящийся ко 2 спряжению"),
            new DatabaseVictorina(3, 3, 2, "черпать", "варить", "брызгать", "понять", "Выбери глагол относящийся к 2 спряжению"),
            new DatabaseVictorina(4, 3, 1, "писать", "укрепить", "спустить", "вылить", "Выбери глагол относящийся к 1 спряжению"),
            new DatabaseVictorina(5, 3, 3, "спать", "играть", "бежать", "стоять", "Выбери разноспрягаемый глагол"),
    };
    public DatabaseVictorina[] Victorin4 = new DatabaseVictorina[]{
            new DatabaseVictorina(1, 4, 1, "каша", "порог", "кукуруза", "стул", "Porridge"),
            new DatabaseVictorina(2, 4, 2, "ритм","чудовище", "праздник", "стол", "Beast"),
            new DatabaseVictorina(3, 4, 4, "срок хранения", "мягкость", "совесть", "безопасность", "Safety"),
            new DatabaseVictorina(4, 4, 3, "утёнок", "блеск", "сплетня", "ритм", "Gossip"),
            new DatabaseVictorina(5, 4, 1, "статья", "название", "артист", "мягкость", "Article"),
    };
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private TextView Question;
    private Button btn_next;
    private int rightAnswer;
    private int currentIndex;
    private int IdVictorina;
    public int CountAnswer;
    public int CountWrongAnswer;
    private TextView Category;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game);
        String idVictorin = getIntent().getStringExtra("ID_of_vict");
        IdVictorina = Integer.parseInt(idVictorin);
        btn1 = findViewById(R.id.button_answer1);
        btn2 = findViewById(R.id.button_answer2);
        btn3 = findViewById(R.id.button_answer3);
        btn4 = findViewById(R.id.button_anwer4);
        btn_next = findViewById(R.id.button_next);
        Question = findViewById(R.id.textView4);
        Category = findViewById(R.id.Category);
        btn_next.setVisibility(View.INVISIBLE);
        if (IdVictorina == 1) {
            Category.setText("Астрономия");
            currentIndex = 0;
            CountAnswer = 0;
            CountWrongAnswer = 0;
            UpdateContent1(currentIndex);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (rightAnswer == 1) {
                        currentIndex++;
                        CountAnswer++;
                        if (currentIndex == Victorin1.length) {
                                    Intent i = new Intent(Game.this, Nextmove1.class);
                                    String Score = "" + CountAnswer;
                                    i.putExtra("Score", Score);
                                    startActivity(i);
                        } else {
                            UpdateContent1(currentIndex);
                        }
                    } else {
                        CountWrongAnswer++;
                        btn1.setEnabled(false);
                        btn2.setEnabled(false);
                        btn3.setEnabled(false);
                        btn4.setEnabled(false);
                        Toast toast = Toast.makeText(getApplicationContext(), "Неправильно!", Toast.LENGTH_SHORT);
                        toast.show();
                        btn_next.setVisibility(View.VISIBLE);
                        btn_next.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                currentIndex++;
                                if (currentIndex == Victorin1.length){
                                    Intent i = new Intent(Game.this, Nextmove1.class);
                                    String Score = "" + CountAnswer;
                                    i.putExtra("Score", Score);
                                    startActivity(i);
                                }
                                else{
                                    UpdateContent1(currentIndex);}
                            }
                        });
                    }
                }
            });
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (rightAnswer == 2) {
                        currentIndex++;
                        CountAnswer++;
                        if (currentIndex == Victorin1.length) {
                                    Intent i = new Intent(Game.this, Nextmove1.class);
                                    String Score = "" + CountAnswer;
                                    i.putExtra("Score", Score);
                                    startActivity(i);
                                }
                        else {
                            UpdateContent1(currentIndex);
                        }
                    } else {
                        CountWrongAnswer++;
                        btn1.setEnabled(false);
                        btn2.setEnabled(false);
                        btn3.setEnabled(false);
                        btn4.setEnabled(false);
                        Toast toast = Toast.makeText(getApplicationContext(), "Неправильно!", Toast.LENGTH_SHORT);
                        toast.show();
                        btn_next.setVisibility(View.VISIBLE);
                        btn_next.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                currentIndex++;
                                if (currentIndex == Victorin1.length){
                                    Intent i = new Intent(Game.this, Nextmove1.class);
                                    String Score = "" + CountAnswer;
                                    i.putExtra("Score", Score);
                                    startActivity(i);
                                }
                                else{
                                UpdateContent1(currentIndex);}
                            }
                        });
                    }
                }
            });
            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (rightAnswer == 3) {
                        currentIndex++;
                        CountAnswer++;
                        if (currentIndex == Victorin1.length) {
                                    Intent i = new Intent(Game.this, Nextmove1.class);
                                    String Score = "" + CountAnswer;
                                    i.putExtra("Score", Score);
                                    startActivity(i);
                        } else {
                            UpdateContent1(currentIndex);
                        }
                    } else {
                        CountWrongAnswer++;
                        btn1.setEnabled(false);
                        btn2.setEnabled(false);
                        btn3.setEnabled(false);
                        btn4.setEnabled(false);
                        Toast toast = Toast.makeText(getApplicationContext(), "Неправильно!", Toast.LENGTH_SHORT);
                        toast.show();
                        btn_next.setVisibility(View.VISIBLE);
                        btn_next.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                currentIndex++;
                                if (currentIndex == Victorin1.length){
                                    Intent i = new Intent(Game.this, Nextmove1.class);
                                    String Score = "" + CountAnswer;
                                    i.putExtra("Score", Score);
                                    startActivity(i);
                                }
                                else{
                                    UpdateContent1(currentIndex);}
                            }
                        });
                    }
                }
            });
            btn4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (rightAnswer == 4) {
                        currentIndex++;
                        CountAnswer++;
                        if (currentIndex == Victorin1.length) {
                                    Intent i = new Intent(Game.this, Nextmove1.class);
                                    String Score = "" + CountAnswer;
                                    i.putExtra("Score", Score);
                                    startActivity(i);
                        } else {
                            UpdateContent1(currentIndex);
                        }
                    } else {
                        CountWrongAnswer++;
                        btn1.setEnabled(false);
                        btn2.setEnabled(false);
                        btn3.setEnabled(false);
                        btn4.setEnabled(false);
                        Toast toast = Toast.makeText(getApplicationContext(), "Неправильно!", Toast.LENGTH_SHORT);
                        toast.show();
                        btn_next.setVisibility(View.VISIBLE);
                        btn_next.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                currentIndex++;
                                if (currentIndex == Victorin1.length){
                                    Intent i = new Intent(Game.this, Nextmove1.class);
                                    String Score = "" + CountAnswer;
                                    i.putExtra("Score", Score);
                                    startActivity(i);
                                }
                                else{
                                    UpdateContent1(currentIndex);}
                            }
                        });
                    }
                }
            });
        }
        else if (IdVictorina == 29630) {
            Category.setText("Года");
            currentIndex = 0;
            CountAnswer = 0;
            CountWrongAnswer = 0;
            UpdateContent2(currentIndex);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (rightAnswer == 1) {
                        currentIndex++;
                        CountAnswer++;
                        if (currentIndex == Victorin2.length) {
                                    Intent i = new Intent(Game.this, Nextmove2.class);
                                    String Score = "" + CountAnswer;
                                    i.putExtra("Score", Score);
                                    startActivity(i);
                        } else {
                            UpdateContent2(currentIndex);
                        }
                    } else {
                        CountWrongAnswer++;
                        btn1.setEnabled(false);
                        btn2.setEnabled(false);
                        btn3.setEnabled(false);
                        btn4.setEnabled(false);
                        Toast toast = Toast.makeText(getApplicationContext(), "Неправильно!", Toast.LENGTH_SHORT);
                        toast.show();
                        btn_next.setVisibility(View.VISIBLE);
                        btn_next.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                currentIndex++;
                                if (currentIndex == Victorin2.length){
                                    Intent i = new Intent(Game.this, Nextmove2.class);
                                    String Score = "" + CountAnswer;
                                    i.putExtra("Score", Score);
                                    startActivity(i);
                                }
                                else{
                                    UpdateContent2(currentIndex);}
                            }
                        });
                    }
                }
            });
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (rightAnswer == 2) {
                        currentIndex++;
                        CountAnswer++;
                        if (currentIndex == Victorin2.length) {
                                    Intent i = new Intent(Game.this, Nextmove2.class);
                                    String Score = "" + CountAnswer;
                                    i.putExtra("Score", Score);
                                    startActivity(i);
                        } else {
                            UpdateContent2(currentIndex);
                        }
                    } else {
                        CountWrongAnswer++;
                        btn1.setEnabled(false);
                        btn2.setEnabled(false);
                        btn3.setEnabled(false);
                        btn4.setEnabled(false);
                        Toast toast = Toast.makeText(getApplicationContext(), "Неправильно!", Toast.LENGTH_SHORT);
                        toast.show();
                        btn_next.setVisibility(View.VISIBLE);
                        btn_next.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                currentIndex++;
                                if (currentIndex == Victorin2.length){
                                    Intent i = new Intent(Game.this, Nextmove2.class);
                                    String Score = "" + CountAnswer;
                                    i.putExtra("Score", Score);
                                    startActivity(i);
                                }
                                else{
                                    UpdateContent2(currentIndex);}
                            }
                        });
                    }
                }
            });
            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (rightAnswer == 3) {
                        currentIndex++;
                        CountAnswer++;
                        if (currentIndex == Victorin2.length) {
                                    Intent i = new Intent(Game.this, Nextmove2.class);
                                    String Score = "" + CountAnswer;
                                    i.putExtra("Score", Score);
                                    startActivity(i);
                        } else {
                            UpdateContent2(currentIndex);
                        }
                    } else {
                        CountWrongAnswer++;
                        btn1.setEnabled(false);
                        btn2.setEnabled(false);
                        btn3.setEnabled(false);
                        btn4.setEnabled(false);
                        Toast toast = Toast.makeText(getApplicationContext(), "Неправильно!", Toast.LENGTH_SHORT);
                        toast.show();
                        btn_next.setVisibility(View.VISIBLE);
                        btn_next.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                currentIndex++;
                                if (currentIndex == Victorin2.length){
                                    Intent i = new Intent(Game.this, Nextmove2.class);
                                    String Score = "" + CountAnswer;
                                    i.putExtra("Score", Score);
                                    startActivity(i);
                                }
                                else{
                                    UpdateContent2(currentIndex);}
                            }
                        });
                    }
                }
            });
            btn4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (rightAnswer == 4) {
                        currentIndex++;
                        CountAnswer++;
                        if (currentIndex == Victorin2.length) {
                                    Intent i = new Intent(Game.this, Nextmove2.class);
                                    String Score = "" + CountAnswer;
                                    i.putExtra("Score", Score);
                                    startActivity(i);
                        } else {
                            UpdateContent2(currentIndex);
                        }
                    } else {
                        CountWrongAnswer++;
                        btn1.setEnabled(false);
                        btn2.setEnabled(false);
                        btn3.setEnabled(false);
                        btn4.setEnabled(false);
                        Toast toast = Toast.makeText(getApplicationContext(), "Неправильно!", Toast.LENGTH_SHORT);
                        toast.show();
                        btn_next.setVisibility(View.VISIBLE);
                        btn_next.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                currentIndex++;
                                if (currentIndex == Victorin2.length){
                                    Intent i = new Intent(Game.this, Nextmove2.class);
                                    String Score = "" + CountAnswer;
                                    i.putExtra("Score", Score);
                                    startActivity(i);
                                }
                                else{
                                    UpdateContent2(currentIndex);}
                            }
                        });
                    }
                }
            });
        }
        else if (IdVictorina == 3) {
            Category.setText("Русский язык");
            currentIndex = 0;
            CountAnswer = 0;
            CountWrongAnswer = 0;
            UpdateContent3(currentIndex);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (rightAnswer == 1) {
                        currentIndex++;
                        CountAnswer++;
                        if (currentIndex == Victorin3.length) {
                                    Intent i = new Intent(Game.this, Nextmove3.class);
                                    String Score = "" + CountAnswer;
                                    i.putExtra("Score", Score);
                                    startActivity(i);
                        } else {
                            UpdateContent3(currentIndex);
                        }
                    } else {
                        btn1.setEnabled(false);
                        btn2.setEnabled(false);
                        btn3.setEnabled(false);
                        btn4.setEnabled(false);
                        Toast toast = Toast.makeText(getApplicationContext(), "Неправильно!", Toast.LENGTH_SHORT);
                        toast.show();
                        btn_next.setVisibility(View.VISIBLE);
                        btn_next.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                currentIndex++;
                                if (currentIndex == Victorin3.length){
                                    Intent i = new Intent(Game.this, Nextmove3.class);
                                    String Score = "" + CountAnswer;
                                    i.putExtra("Score", Score);
                                    startActivity(i);
                                }
                                else{
                                    UpdateContent3(currentIndex);}
                            }
                        });
                    }
                }
            });
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (rightAnswer == 2) {
                        currentIndex++;
                        CountAnswer++;
                        if (currentIndex == Victorin3.length) {
                                    Intent i = new Intent(Game.this, Nextmove3.class);
                                    String Score = "" + CountAnswer;
                                    i.putExtra("Score", Score);
                                    startActivity(i);
                        } else {
                            UpdateContent3(currentIndex);
                        }
                    } else {
                        btn1.setEnabled(false);
                        btn2.setEnabled(false);
                        btn3.setEnabled(false);
                        btn4.setEnabled(false);
                        Toast toast = Toast.makeText(getApplicationContext(), "Неправильно!", Toast.LENGTH_SHORT);
                        toast.show();
                        btn_next.setVisibility(View.VISIBLE);
                        btn_next.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                currentIndex++;
                                if (currentIndex == Victorin3.length){
                                    Intent i = new Intent(Game.this, Nextmove3.class);
                                    String Score = "" + CountAnswer;
                                    i.putExtra("Score", Score);
                                    startActivity(i);
                                }
                                else{
                                    UpdateContent3(currentIndex);}
                            }
                        });
                    }
                }
            });
            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (rightAnswer == 3) {
                        currentIndex++;
                        CountAnswer++;
                        if (currentIndex == Victorin3.length) {
                                    Intent i = new Intent(Game.this, Nextmove3.class);
                                    String Score = "" + CountAnswer;
                                    i.putExtra("Score", Score);
                                    startActivity(i);
                        } else {
                            UpdateContent3(currentIndex);
                        }
                    } else {
                        CountWrongAnswer++;
                        btn1.setEnabled(false);
                        btn2.setEnabled(false);
                        btn3.setEnabled(false);
                        btn4.setEnabled(false);
                        Toast toast = Toast.makeText(getApplicationContext(), "Неправильно!", Toast.LENGTH_SHORT);
                        toast.show();
                        btn_next.setVisibility(View.VISIBLE);
                        btn_next.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                currentIndex++;
                                if (currentIndex == Victorin3.length){
                                    Intent i = new Intent(Game.this, Nextmove3.class);
                                    String Score = "" + CountAnswer;
                                    i.putExtra("Score", Score);
                                    startActivity(i);
                                }
                                else{
                                    UpdateContent3(currentIndex);}
                            }
                        });
                    }
                }
            });
            btn4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (rightAnswer == 4) {
                        currentIndex++;
                        CountAnswer++;
                        if (currentIndex == Victorin3.length) {
                                    Intent i = new Intent(Game.this, Nextmove3.class);
                                    String Score = "" + CountAnswer;
                                    i.putExtra("Score", Score);
                                    startActivity(i);
                        } else {
                            UpdateContent3(currentIndex);
                        }
                    } else {
                        CountWrongAnswer++;
                        btn1.setEnabled(false);
                        btn2.setEnabled(false);
                        btn3.setEnabled(false);
                        btn4.setEnabled(false);
                        Toast toast = Toast.makeText(getApplicationContext(), "Неправильно!", Toast.LENGTH_SHORT);
                        toast.show();
                        btn_next.setVisibility(View.VISIBLE);
                        btn_next.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                currentIndex++;
                                if (currentIndex == Victorin3.length){
                                    Intent i = new Intent(Game.this, Nextmove3.class);
                                    String Score = "" + CountAnswer;
                                    i.putExtra("Score", Score);
                                    startActivity(i);
                                }
                                else{
                                    UpdateContent3(currentIndex);}
                            }
                        });
                    }
                }
            });
        }
        else if (IdVictorina == 4) {
            Category.setText("Английский язык");
            currentIndex = 0;
            CountAnswer = 0;
            CountWrongAnswer = 0;
            UpdateContent4(currentIndex);
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (rightAnswer == 1) {
                        currentIndex++;
                        CountAnswer++;
                        if (currentIndex == Victorin4.length) {
                                    Intent i = new Intent(Game.this, Nextmove4.class);
                                    String Score = "" + CountAnswer;
                                    i.putExtra("Score", Score);
                                    startActivity(i);
                        } else {
                            UpdateContent4(currentIndex);
                        }
                    } else {
                        CountWrongAnswer++;
                        btn1.setEnabled(false);
                        btn2.setEnabled(false);
                        btn3.setEnabled(false);
                        btn4.setEnabled(false);
                        Toast toast = Toast.makeText(getApplicationContext(), "Неправильно!", Toast.LENGTH_SHORT);
                        toast.show();
                        btn_next.setVisibility(View.VISIBLE);
                        btn_next.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                currentIndex++;
                                if (currentIndex == Victorin4.length){
                                    Intent i = new Intent(Game.this, Nextmove4.class);
                                    String Score = "" + CountAnswer;
                                    i.putExtra("Score", Score);
                                    startActivity(i);
                                }
                                else{
                                    UpdateContent4(currentIndex);}
                            }
                        });
                    }
                }
            });
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (rightAnswer == 2) {
                        currentIndex++;
                        CountAnswer++;
                        if (currentIndex == Victorin4.length) {
                            Intent i = new Intent(Game.this, Nextmove4.class);
                            String Score = "" + CountAnswer;
                            i.putExtra("Score", Score);
                            startActivity(i);
                        }
                        else {
                            UpdateContent4(currentIndex);
                        }
                    } else {
                        CountWrongAnswer++;
                        btn1.setEnabled(false);
                        btn2.setEnabled(false);
                        btn3.setEnabled(false);
                        btn4.setEnabled(false);
                        Toast toast = Toast.makeText(getApplicationContext(), "Неправильно!", Toast.LENGTH_SHORT);
                        toast.show();
                        btn_next.setVisibility(View.VISIBLE);
                        btn_next.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                currentIndex++;
                                if (currentIndex == Victorin4.length){
                                    Intent i = new Intent(Game.this, Nextmove4.class);
                                    String Score = "" + CountAnswer;
                                    i.putExtra("Score", Score);
                                    startActivity(i);
                                }
                                else{
                                    UpdateContent4(currentIndex);}
                            }
                        });
                    }
                }
            });
            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (rightAnswer == 3) {
                        currentIndex++;
                        CountAnswer++;
                        if (currentIndex == Victorin4.length) {
                            Intent i = new Intent(Game.this, Nextmove4.class);
                            String Score = "" + CountAnswer;
                            i.putExtra("Score", Score);
                            startActivity(i);
                        } else {
                            UpdateContent4(currentIndex);
                        }
                    } else {
                        CountWrongAnswer++;
                        btn1.setEnabled(false);
                        btn2.setEnabled(false);
                        btn3.setEnabled(false);
                        btn4.setEnabled(false);
                        Toast toast = Toast.makeText(getApplicationContext(), "Неправильно!", Toast.LENGTH_SHORT);
                        toast.show();
                        btn_next.setVisibility(View.VISIBLE);
                        btn_next.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                currentIndex++;
                                if (currentIndex == Victorin4.length){
                                    Intent i = new Intent(Game.this, Nextmove4.class);
                                    String Score = "" + CountAnswer;
                                    i.putExtra("Score", Score);
                                    startActivity(i);
                                }
                                else{
                                    UpdateContent4(currentIndex);}
                            }
                        });
                    }
                }
            });
            btn4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (rightAnswer == 4) {
                        currentIndex++;
                        CountAnswer++;
                        if (currentIndex == Victorin4.length) {
                            Intent i = new Intent(Game.this, Nextmove4.class);
                            String Score = "" + CountAnswer;
                            i.putExtra("Score", Score);
                            startActivity(i);
                        } else {
                            UpdateContent4(currentIndex);
                        }
                    } else {
                        CountWrongAnswer++;
                        btn1.setEnabled(false);
                        btn2.setEnabled(false);
                        btn3.setEnabled(false);
                        btn4.setEnabled(false);
                        Toast toast = Toast.makeText(getApplicationContext(), "Неправильно!", Toast.LENGTH_SHORT);
                        toast.show();
                        btn_next.setVisibility(View.VISIBLE);
                        btn_next.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                currentIndex++;
                                if (currentIndex == Victorin4.length){
                                    Intent i = new Intent(Game.this, Nextmove4.class);
                                    String Score = "" + CountAnswer;
                                    i.putExtra("Score", Score);
                                    startActivity(i);
                                }
                                else{
                                    UpdateContent4(currentIndex);}
                            }
                        });
                    }
                }
            });
        }
    }

    private void UpdateContent1(int index) {
        Question.setText(Victorin1[index].question_text);
        btn1.setText(Victorin1[index].first_ans);
        btn2.setText(Victorin1[index].second_ans);
        btn3.setText(Victorin1[index].third_ans);
        btn4.setText(Victorin1[index].forth_ans);
        rightAnswer = Victorin1[index].right_ans;
        btn_next.setVisibility(View.INVISIBLE);
        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
    }
    private void UpdateContent2(int index) {
        Question.setText(Victorin2[index].question_text);
        btn1.setText(Victorin2[index].first_ans);
        btn2.setText(Victorin2[index].second_ans);
        btn3.setText(Victorin2[index].third_ans);
        btn4.setText(Victorin2[index].forth_ans);
        rightAnswer = Victorin2[index].right_ans;
        btn_next.setVisibility(View.INVISIBLE);
        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
    }
    private void UpdateContent3(int index) {
        Question.setText(Victorin3[index].question_text);
        btn1.setText(Victorin3[index].first_ans);
        btn2.setText(Victorin3[index].second_ans);
        btn3.setText(Victorin3[index].third_ans);
        btn4.setText(Victorin3[index].forth_ans);
        rightAnswer = Victorin3[index].right_ans;
        btn_next.setVisibility(View.INVISIBLE);
        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
    }
    private void UpdateContent4(int index) {
        Question.setText(Victorin4[index].question_text);
        btn1.setText(Victorin4[index].first_ans);
        btn2.setText(Victorin4[index].second_ans);
        btn3.setText(Victorin4[index].third_ans);
        btn4.setText(Victorin4[index].forth_ans);
        rightAnswer = Victorin4[index].right_ans;
        btn_next.setVisibility(View.INVISIBLE);
        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
    }
}
