package nl.hu.bscs.privacygame.domain;

import java.util.Date;

public class Answer {
    private final int questionId;
    private final String text;
    private final Date date;

    public Answer(int questionId, String text) {
        this.questionId = questionId;
        this.text = text;
        this.date = new Date();
    }
    
    public int getQuestionId() {
        return questionId;
    }

    public String getText() {
        return text;
    }

    public Date getDate() {
        return date;
    }
}
