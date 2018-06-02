package nl.hu.bscs.privacygame.view;

import java.util.logging.Logger;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nl.hu.bscs.privacygame.domain.User;
import nl.hu.bscs.privacygame.domain.Answer;
import nl.hu.bscs.privacygame.domain.Service;
import nl.hu.bscs.privacygame.domain.SessionUtility;
import nl.hu.bscs.privacygame.domain.Team;

public class QuestionTwoServlet extends HttpServlet {
    private static Logger logger = Logger.getLogger(QuestionTwoServlet.class.getName());
    private static final long serialVersionUID = -452821502141564336L;

    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        Page page = new Page("question2.html");
        page.render(request, response);
    }
    
    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        Service service = Service.getInstance();
        
        String session = SessionUtility.getSessionId(request);
        User user = service.getUserBySession(session);
        
        if (user == null) {
            Page page = new Page("unauthorized.html");
            page.render(request, response);
            return;
        }
        
        Answer answer = new Answer(request.getParameter("answer"));
        user.addAnswer(answer);
        
        Team team = service.getTeamBySession(session);
        logger.info("Team " + team.getId() + " answer: " + answer.getText());
        
        Page page = new Page("final.html");
        page.render(request, response);
    }
}
