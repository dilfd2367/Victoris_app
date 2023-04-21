package com.example.projectvictorys;

public class DatabaseVictorina {
    public int id, vict_id, right_ans;
    public String first_ans;
    public String second_ans;
    public String third_ans;
    public String forth_ans;
    public String question_text;
    public DatabaseVictorina(int id, int vict_id, int right_ans, String first_ans, String second_ans, String third_ans, String forth_ans, String question_text) {
        this.id = id;
        this.vict_id = vict_id;
        this.right_ans = right_ans;
        this.first_ans = first_ans;
        this.second_ans = second_ans;
        this.third_ans = third_ans;
        this.forth_ans = forth_ans;
        this.question_text = question_text;
    }
}

