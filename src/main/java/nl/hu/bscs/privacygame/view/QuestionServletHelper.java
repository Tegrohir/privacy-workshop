package nl.hu.bscs.privacygame.view;

import nl.hu.bscs.privacygame.domain.*;
import nl.hu.bscs.privacygame.view.questionservlets.Question1Servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.logging.Logger;

public class QuestionServletHelper {
    private static Logger logger = Logger.getLogger(Question1Servlet.class.getName());

    public void doProcessAnswer(HttpServletRequest request, HttpServletResponse response, String nextPageUrl) {
        Service service = Service.getInstance();

        String session = SessionUtility.getSessionId(request);
        Team team = service.getTeamBySession(session);

        if (authorizeUser(response, team)) return;

        Answer answer = new Answer(request.getParameter("answer"));
        team.addAnswer(answer);
        
        logger.info("Team " + team.getId() + " answer: " + answer.getText());

        Page page = new Page(nextPageUrl);
        page.redirect(response);
    }

    private boolean authorizeUser(HttpServletResponse response, Team team) {
        if (team == null) {
            Page page = new Page("unauthorized.html");
            page.redirect(response);
            return true;
        }
        return false;
    }


}
