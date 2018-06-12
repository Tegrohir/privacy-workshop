package nl.hu.bscs.privacygame.view;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Page {
    private static Logger logger = Logger.getLogger(Page.class.getName());
    private String page;
    
    public Page(String page) {
        this.page = page;
    }
    
    public void redirect(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.sendRedirect(page);
        } catch (IOException e) {
            String message = "An exception occurred while rendering: " + page;
            logger.log(Level.SEVERE, message, e);
        }
    }

}
