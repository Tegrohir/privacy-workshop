package nl.hu.bscs.privacygame.view;

import nl.hu.bscs.privacygame.domain.Service;
import nl.hu.bscs.privacygame.domain.Team;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogoutServlet extends HttpServlet {
    private static final long serialVersionUID = 7736701509638435653L;

    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        Service service = Service.getInstance();

        String teamIdParameter = request.getParameter("teamId");
        int teamId = 0;
        try {
            teamId = Integer.parseInt(teamIdParameter);
        } catch (NumberFormatException e) {
            Page page = new Page("error.html");
            page.redirect(response);
            return;
        }
        
        Team team = service.getTeamById(teamId);

        if (team == null) {
            Page page = new Page("error.html");
            page.redirect(response);
            return;
        }
        
        team.setSession(null);

        Page page = new Page("admin");
        page.redirect(response);
    }
}
