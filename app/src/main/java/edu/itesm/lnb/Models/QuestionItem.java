package edu.itesm.lnb.Models;

public class QuestionItem {

    private String question;
    private String answer1;
    private String answer2;

    public QuestionItem(String question, String answer1, String answer2) {
        this.question = question;
        this.answer1 = answer1;
        this.answer2 = answer2;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer1() {
        return answer1;
    }

    public String getAnswer2() {
        return answer2;
    }
}
