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

    public void addAnswer(Answer answer) {
        Answer existingAnswer = getAnswerByQuestionId(answer.getQuestionId());
        if (existingAnswer != null) {
            this.answers.remove(existingAnswer);
        }
        
        this.answers.add(answer);
    }
    
    public Answer getAnswerByQuestionId(int questionId) {
        for (Answer answer: answers) {
            if (answer.getQuestionId() == questionId) {
                return answer;
            }
        }
        
        return null;
    }
}
