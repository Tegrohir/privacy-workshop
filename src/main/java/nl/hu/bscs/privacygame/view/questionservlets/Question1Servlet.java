package nl.hu.bscs.privacygame.view.questionservlets;

import nl.hu.bscs.privacygame.domain.Answer;
import nl.hu.bscs.privacygame.domain.Service;
import nl.hu.bscs.privacygame.domain.SessionUtility;
import nl.hu.bscs.privacygame.domain.Team;
import nl.hu.bscs.privacygame.view.Page;
import nl.hu.bscs.privacygame.view.QuestionServletHelper;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Question1Servlet extends HttpServlet {
    private static final long serialVersionUID = -452821502141564336L;

    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        Service service = Service.getInstance();
        
        String session = SessionUtility.getSessionId(request);
        Team team = service.getTeamBySession(session);
        
        if (team == null) {
            Page page = new Page("unauthorized.html");
            page.redirect(response);
            return;
        }
        
        Answer answer = team.getAnswerByQuestionId(1);
        
        Page page = new Page("question1.jsp");
        if (answer != null) {
            request.setAttribute("answer", answer.getText());
        }
        
        page.forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        QuestionServletHelper helper = new QuestionServletHelper();
        helper.doProcessAnswer(request, response, 1, "question2");
    }
}
