package nl.hu.bscs.privacygame.view;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StartServlet extends HttpServlet {
    private static final long serialVersionUID = -452821502141564336L;

    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        Page page = new Page("index.html");
        page.redirect(request, response);
    }
    
    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        Page page = new Page("login.jsp");
        page.redirect(request, response);
    }
}
