package workshop.domain;

import java.util.ArrayList;
import java.util.List;

public class Guest {
    private String session;
    private String team;
    private String role;
    private List<String> answers = new ArrayList<>();
    
    public String getSession() {
        return session;
    }
    
    public void setSession(String session) {
        this.session = session;
    }
    
    public String getTeam() {
        return team;
    }
    
    public void setTeam(String team) {
        this.team = team;
    }
    
    public String getRole() {
        return role;
    }
    
    public void setRole(String role) {
        this.role = role;
    }
    
    public List<String> getAnswers() {
        return answers;
    }
    
    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }    
}
