package nl.hu.bscs.privacygame.view;

import nl.hu.bscs.privacygame.domain.Answer;
import nl.hu.bscs.privacygame.domain.Service;
import nl.hu.bscs.privacygame.domain.SessionUtility;
import nl.hu.bscs.privacygame.domain.Team;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class QuestionRetriever {
    private Service service = Service.getInstance();
    private HttpServletRequest request;
    private HttpServletResponse response;
    private int currentQuestionId;
    private String currentPage;
    
    public QuestionRetriever(HttpServletRequest request, HttpServletResponse response) {
        this.request = request;
        this.response = response;
    }
    
    public void setCurrentQuestionId(int currentQuestionId) {
        this.currentQuestionId = currentQuestionId;
    }

    public void setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
    }

    public void retrieve() {
        String session = SessionUtility.getSessionId(request);
        Team team = service.getTeamBySession(session);
        
        if (isUnauthorized(team)) {
            showUnauthorizedPage(response);
            return;
        }
        
        Answer answer = team.getAnswerByQuestionId(currentQuestionId);
        
        Page page = new Page(currentPage);
        if (answerExists(answer)) {
            request.setAttribute("answer", answer.getText());
        }
        
        page.forward(request, response);
    }

    private boolean isUnauthorized(Team team) {
        return team == null;
    }
    
    private void showUnauthorizedPage(HttpServletResponse response) {
        Page page = new Page("unauthorized.html");
        page.redirect(response);
    }
    
    private boolean answerExists(Answer answer) {
        return answer != null;
    }

}
