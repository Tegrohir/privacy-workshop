package nl.hu.bscs.privacygame.domain;

import java.util.Date;

public class Answer {
    private final String text;
    private final Date date;

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
