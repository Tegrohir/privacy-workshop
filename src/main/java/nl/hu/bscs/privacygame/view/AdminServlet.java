package nl.hu.bscs.privacygame.view;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nl.hu.bscs.privacygame.domain.Service;

public class AdminServlet extends HttpServlet {
    private static final long serialVersionUID = -452821502141564336L;

    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        Service service = Service.getInstance();
        
        request.setAttribute("teams", service.getTeams());

        Page page = new Page("admin.jsp");
        page.render(request, response);
    }
}
