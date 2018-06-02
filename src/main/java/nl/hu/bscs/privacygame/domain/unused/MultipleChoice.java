package nl.hu.bscs.privacygame.domain.unused;

import java.util.List;

public class MultipleChoice {
    private int id;
    private int order;
    private Role role;
    private String question;
    private List<Answer> answers;

    public MultipleChoice(int order, Role role, String question, List<Answer> answers) {
        this.order = order;
        this.role = role;
        this.question = question;
        this.answers = answers;
    }

    public Answer giveCorrectAnswer(){
        for (Answer a : answers) if (a.isCorrect()) return a;
        return null;
    }
}
