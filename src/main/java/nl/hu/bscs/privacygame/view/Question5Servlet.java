package nl.hu.bscs.privacygame.view;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Question5Servlet extends HttpServlet {
    private static final long serialVersionUID = 2387396288271445076L;

    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        QuestionRetriever questionRetriever = new QuestionRetriever(request, response);
        questionRetriever.setCurrentPage("question5.jsp");
        questionRetriever.setCurrentQuestionId(5);
        questionRetriever.retrieve();
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        AnswerProcessor answerProcessor = new AnswerProcessor(request, response);
        answerProcessor.setCurrentQuestionId(5);
        answerProcessor.setNextPageUrl("question6");
        answerProcessor.process();
    }
}
