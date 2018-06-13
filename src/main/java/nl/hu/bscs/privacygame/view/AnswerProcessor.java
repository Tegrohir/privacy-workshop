package nl.hu.bscs.privacygame.view;

import nl.hu.bscs.privacygame.domain.Answer;
import nl.hu.bscs.privacygame.domain.Service;
import nl.hu.bscs.privacygame.domain.SessionUtility;
import nl.hu.bscs.privacygame.domain.Team;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.logging.Logger;

public class AnswerProcessor {
    private final static Logger logger = Logger.getLogger(AnswerProcessor.class.getName());
    private Service service = Service.getInstance();
    private HttpServletRequest request;
    private HttpServletResponse response;
    private int currentQuestionId;
    private String nextPageUrl;
    
    public AnswerProcessor(HttpServletRequest request, HttpServletResponse response) {
        this.request = request;
        this.response = response;
    }   

    public void setCurrentQuestionId(int currentQuestionId) {
        this.currentQuestionId = currentQuestionId;
    }

    public void setNextPageUrl(String nextPageUrl) {
        this.nextPageUrl = nextPageUrl;
    }

    public void process() {
        String session = SessionUtility.getSessionId(request);
        Team team = service.getTeamBySession(session);

        if (isUnauthorized(team)) {
            showUnauthorizedPage(response);
            return;
        }

        Answer answer = new Answer(currentQuestionId, request.getParameter("answer"));
        team.addAnswer(answer);

        logger.info("Team " + team.getId() + " answer " + answer.getQuestionId() + ": " + answer.getText());

        Page page = new Page(nextPageUrl);
        page.redirect(response);
    }

    private boolean isUnauthorized(Team team) {
        return team == null;
    }
    
    private void showUnauthorizedPage(HttpServletResponse response) {
        Page page = new Page("unauthorized.html");
        page.redirect(response);
    }


}
