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
        User user = service.getUserBySession(session);

        if (authorizeUser(request, response, user)) return;

        Answer answer = new Answer(request.getParameter("answer"));
        user.addAnswer(answer);

        Team team = service.getTeamBySession(session);
        logger.info("Team " + team.getId() + " answer: " + answer.getText());

        Page page = new Page(nextPageUrl);
        page.render(request, response);
    }

    private boolean authorizeUser(HttpServletRequest request, HttpServletResponse response, User user) {
        if (user == null) {
            Page page = new Page("unauthorized.html");
            page.render(request, response);
            return true;
        }
        return false;
    }


}
