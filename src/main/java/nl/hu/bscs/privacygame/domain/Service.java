package nl.hu.bscs.privacygame.domain;

import java.util.ArrayList;
import java.util.List;

public class Service {
    private static Service service = new Service();
    public List<Team> teams = new ArrayList<>();
    
    private Service() {
        teams.addAll(TeamFactory.createTeams());
    }
    
    public static Service getInstance() {
        return service;
    }

    public Team getTeamByCode(String code) {
        for (Team team : teams) {
            if (team.getCode().equals(code)) {
                return team;
            }
        }
        
        return null;
    }
    
    public List<Team> getTeams() {
        return teams;
    }
    
    public Team getTeamBySession(String session) {
        for (Team team : teams) {
            if (team.getSession() == null) {
                continue;
            }
            
            if (team.getSession().equals(session)) {
                return team;
            }
        }
        
        return null;
    }
}
