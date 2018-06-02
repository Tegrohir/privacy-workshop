package nl.hu.bscs.privacygame.view;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nl.hu.bscs.privacygame.domain.User;
import nl.hu.bscs.privacygame.domain.Service;
import nl.hu.bscs.privacygame.domain.SessionUtility;
import nl.hu.bscs.privacygame.domain.Team;

public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = -452821502141564336L;

    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        Page page = new Page("login.jsp");
        page.render(request, response);
    }
    
    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        Service service = Service.getInstance();
        
        String session = SessionUtility.getSessionId(request);
        User user = service.getUserBySession(session);
        
        if (user != null) {
            Page page = new Page("question1.html");
            page.render(request, response);
            return;
        }
        
        String code = request.getParameter("code").toUpperCase();
        Team team = service.getTeamByCode(code);
        
        if (team == null) {
            request.setAttribute("message", "Foute code!");
            Page page = new Page("login.jsp");
            page.render(request, response);
            return;
        }
        
        user = new User();
        user.setSession(session);
        team.addUser(user);
        
        Page page = new Page("question1.html");
        page.render(request, response);
    }
}
