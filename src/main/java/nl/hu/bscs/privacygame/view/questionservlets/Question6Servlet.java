package nl.hu.bscs.privacygame.view.questionservlets;

import nl.hu.bscs.privacygame.view.Page;
import nl.hu.bscs.privacygame.view.QuestionServletHelper;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Question6Servlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        Page page = new Page("question6.html");
        page.forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        QuestionServletHelper helper = new QuestionServletHelper();
        helper.doProcessAnswer(request, response, "intermission2.html");
    }
}
