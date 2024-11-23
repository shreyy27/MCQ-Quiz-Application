package database;

import java.util.ArrayList;

// data model to represent data from question table
public class Question {
    private int QuestionId;
    private int categoryId;
    private String questionText;

    private ArrayList<Answer> answers;

    public int getQuestionId() {
        return QuestionId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public String getQuestionText() {
        return questionText;
    }

    public ArrayList<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<Answer> answers) {
        this.answers = answers;
    }

    public Question(int questionId, int categoryId, String questionText) {
        QuestionId = questionId;
        this.categoryId = categoryId;
        this.questionText = questionText;
    }
}
