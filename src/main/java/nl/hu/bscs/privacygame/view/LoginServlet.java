package nl.hu.bscs.privacygame.view;

import nl.hu.bscs.privacygame.domain.Service;
import nl.hu.bscs.privacygame.domain.SessionUtility;
import nl.hu.bscs.privacygame.domain.Team;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = -452821502141564336L;

    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        Page page = new Page("login.jsp");
        page.forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        Service service = Service.getInstance();

        String session = SessionUtility.getSessionId(request);
        Team team = service.getTeamBySession(session);

        if (team != null) {
            Page page = new Page("question1");
            page.redirect(response);
            return;
        }

        String code = request.getParameter("code").toUpperCase();
        team = service.getTeamByCode(code);

        if (team == null) {
            request.setAttribute("message", "Foute code!");
            Page page = new Page("login");
            page.redirect(response);
            return;
        } else if (team.getSession() != null) {
            request.setAttribute("message", "Er is al iemand ingelogd op die code!");
            Page page = new Page("login");
            page.redirect(response);
            return;
        }

        team.setSession(session);

        Page page = new Page("question1");
        page.redirect(response);
    }
}
