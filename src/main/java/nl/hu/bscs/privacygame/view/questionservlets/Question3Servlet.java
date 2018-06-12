package nl.hu.bscs.privacygame.view.questionservlets;

import nl.hu.bscs.privacygame.view.Page;
import nl.hu.bscs.privacygame.view.QuestionServletHelper;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Question3Servlet extends HttpServlet {
    private static final long serialVersionUID = 738466036132587231L;

    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        Page page = new Page("question3.html");
        page.forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        QuestionServletHelper helper = new QuestionServletHelper();
        helper.doProcessAnswer(request, response, "intermission1.html");
    }
}
