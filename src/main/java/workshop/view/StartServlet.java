package workshop.view;

import java.io.IOException;
import java.util.UUID;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import workshop.domain.Guest;
import workshop.domain.GuestManager;
import workshop.domain.Service;

public class StartServlet extends HttpServlet {
    private static final long serialVersionUID = -452821502141564336L;

    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        try {
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.html");
            requestDispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }
    
    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        if (GuestManager.getGuest(request) == null) {
            String session = UUID.randomUUID().toString();
            Guest guest = new Guest();
            guest.setSession(session);
            
            Cookie cookie = new Cookie("session", session);
            response.addCookie(cookie);
            
            Service service = Service.getInstance();
            service.addGuest(guest);
        }
        
        try {
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("team.html");
            requestDispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }
}
