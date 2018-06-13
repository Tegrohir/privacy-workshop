package nl.hu.bscs.privacygame.view;

import nl.hu.bscs.privacygame.domain.Service;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ResetServlet extends HttpServlet {
    private static final long serialVersionUID = -452821502141564336L;

    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        Service service = Service.getInstance();
        service.reset();
        
        Page page = new Page("admin");
        page.redirect(response);
    }
}
