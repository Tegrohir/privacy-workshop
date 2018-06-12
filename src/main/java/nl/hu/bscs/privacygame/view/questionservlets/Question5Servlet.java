package nl.hu.bscs.privacygame.view.questionservlets;

import nl.hu.bscs.privacygame.view.Page;
import nl.hu.bscs.privacygame.view.QuestionServletHelper;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Question5Servlet extends HttpServlet {
    private static final long serialVersionUID = 2387396288271445076L;

    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        Page page = new Page("question5.jsp");
        page.forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        QuestionServletHelper helper = new QuestionServletHelper();
        helper.doProcessAnswer(request, response, 5, "question6");
    }
}
