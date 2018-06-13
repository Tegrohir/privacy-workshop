package nl.hu.bscs.privacygame.domain;

import java.util.ArrayList;
import java.util.List;

public class Service {
    private static final Service service = new Service();
    private List<Team> teams;

    private Service() {
        reset();
    }

    public static Service getInstance() {
        return service;
    }
    
    public void reset() {
        teams = new ArrayList<>();
        teams.addAll(TeamFactory.createTeams());
    }

    public List<Team> getTeams() {
        return teams;
    }
    
    public Team getTeamById(int id) {
        for (Team team : teams) {
            if (team.getId() == id) {
                return team;
            }
        }

        return null;
    }
    
    public Team getTeamByCode(String code) {
        for (Team team : teams) {
            if (team.getCode().equals(code)) {
                return team;
            }
        }

        return null;
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
