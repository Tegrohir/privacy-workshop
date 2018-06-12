package nl.hu.bscs.privacygame.domain;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private int id;
    private String code;
    private String session;
    private List<Answer> answers = new ArrayList<>();
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getCode() {
        return code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }

    public String getSession() {
        return session;
    }
    
    public void setSession(String session) {
        this.session = session;
    }
    
    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }
    
    public void addAnswer(Answer answer) {
        this.answers.add(answer);
    }
}
