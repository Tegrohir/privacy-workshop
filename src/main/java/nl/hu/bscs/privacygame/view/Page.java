package nl.hu.bscs.privacygame.view;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Page {
    private static Logger logger = Logger.getLogger(Page.class.getName());
    private String page;
    
    public Page(String page) {
        this.page = page;
    }
    
    public void render(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher(page);
        
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            String message = "An exception occurred while rendering: " + page;
            logger.log(Level.SEVERE, message, e);
        }
    }

}
