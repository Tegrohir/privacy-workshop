package nl.hu.bscs.privacygame.view;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Page {
    private final static Logger logger = Logger.getLogger(Page.class.getName());
    private final String page;

    public Page(String page) {
        this.page = page;
    }

    public void forward(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher(page);
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            String message = "An exception occurred while rendering: " + page;
            logger.log(Level.SEVERE, message, e);
        }
    }

    public void redirect(HttpServletResponse response) {
        try {
            response.sendRedirect(page);
        } catch (IOException e) {
            String message = "An exception occurred while rendering: " + page;
            logger.log(Level.SEVERE, message, e);
        }
    }

}
