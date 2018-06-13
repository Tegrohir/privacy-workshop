package nl.hu.bscs.privacygame.view;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Question1Servlet extends HttpServlet {
    private static final long serialVersionUID = -452821502141564336L;

    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        QuestionRetriever questionRetriever = new QuestionRetriever(request, response);
        questionRetriever.setCurrentPage("question1.jsp");
        questionRetriever.setCurrentQuestionId(1);
        questionRetriever.retrieve();
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        AnswerProcessor answerProcessor = new AnswerProcessor(request, response);
        answerProcessor.setCurrentQuestionId(1);
        answerProcessor.setNextPageUrl("question2");
        answerProcessor.process();
    }
}
