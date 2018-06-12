package nl.hu.bscs.privacygame.view.questionservlets;

import nl.hu.bscs.privacygame.view.Page;
import nl.hu.bscs.privacygame.view.QuestionServletHelper;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Question1Servlet extends HttpServlet {
    private static final long serialVersionUID = -452821502141564336L;

    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        Page page = new Page("question1.html");
        page.forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        QuestionServletHelper helper = new QuestionServletHelper();
        helper.doProcessAnswer(request, response, "question2");
    }
}
