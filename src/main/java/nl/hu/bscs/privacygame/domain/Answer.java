package nl.hu.bscs.privacygame.domain;

import java.util.Date;

public class Answer {
    private String text;
    private Date date;
    
    public Answer(String text) {
        this.text = text;
        date = new Date();
    }

    public String getText() {
        return text;
    }

    public Date getDate() {
        return date;
    }
}
