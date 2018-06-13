package nl.hu.bscs.privacygame.view;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Question2Servlet extends HttpServlet {
    private static final long serialVersionUID = -452821502141564336L;

    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        QuestionRetriever questionRetriever = new QuestionRetriever(request, response);
        questionRetriever.setCurrentPage("question2.jsp");
        questionRetriever.setCurrentQuestionId(2);
        questionRetriever.retrieve();
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        AnswerProcessor answerProcessor = new AnswerProcessor(request, response);
        answerProcessor.setCurrentQuestionId(2);
        answerProcessor.setNextPageUrl("question3");
        answerProcessor.process();
    }
}
