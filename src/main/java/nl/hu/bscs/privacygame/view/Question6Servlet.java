package nl.hu.bscs.privacygame.view;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Question6Servlet extends HttpServlet {
    private static final long serialVersionUID = 6794354600325776166L;

    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        QuestionRetriever questionRetriever = new QuestionRetriever(request, response);
        questionRetriever.setCurrentPage("question6.jsp");
        questionRetriever.setCurrentQuestionId(6);
        questionRetriever.retrieve();
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        AnswerProcessor answerProcessor = new AnswerProcessor(request, response);
        answerProcessor.setCurrentQuestionId(6);
        answerProcessor.setNextPageUrl("intermission2.html");
        answerProcessor.process();
    }
}
