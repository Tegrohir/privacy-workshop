package nl.hu.bscs.privacygame.view;

import nl.hu.bscs.privacygame.domain.Answer;
import nl.hu.bscs.privacygame.domain.Service;
import nl.hu.bscs.privacygame.domain.SessionUtility;
import nl.hu.bscs.privacygame.domain.Team;
import nl.hu.bscs.privacygame.view.questionservlets.Question1Servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.logging.Logger;

public class QuestionServletHelper {
    private final static Logger logger = Logger.getLogger(Question1Servlet.class.getName());

    public void doProcessAnswer(HttpServletRequest request, HttpServletResponse response, int currentPageId, String nextPageUrl) {
        Service service = Service.getInstance();

        String session = SessionUtility.getSessionId(request);
        Team team = service.getTeamBySession(session);

        if (authorizeUser(response, team)) return;

        Answer answer = new Answer(currentPageId, request.getParameter("answer"));
        team.addAnswer(answer);

        logger.info("Team " + team.getId() + " answer " + answer.getQuestionId() + ": " + answer.getText());

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
