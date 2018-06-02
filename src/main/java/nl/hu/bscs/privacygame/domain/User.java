package nl.hu.bscs.privacygame.domain;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String session;
    private List<Answer> answers = new ArrayList<>();
    
    public String getSession() {
        return session;
    }
    
    public void setSession(String session) {
        this.session = session;
    }
    
    public List<Answer> getAnswers() {
        return answers;
    }
    
    public void addAnswer(Answer answer) {
        this.answers.add(answer);
    }
}
