package nl.hu.bscs.privacygame.view;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Question3Servlet extends HttpServlet {
    private static final long serialVersionUID = 738466036132587231L;

    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        QuestionRetriever questionRetriever = new QuestionRetriever(request, response);
        questionRetriever.setCurrentPage("question3.jsp");
        questionRetriever.setCurrentQuestionId(3);
        questionRetriever.retrieve();
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        AnswerProcessor answerProcessor = new AnswerProcessor(request, response);
        answerProcessor.setCurrentQuestionId(3);
        answerProcessor.setNextPageUrl("intermission1.html");
        answerProcessor.process();
    }
}
