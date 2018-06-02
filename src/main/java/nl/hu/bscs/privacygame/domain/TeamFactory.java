package nl.hu.bscs.privacygame.domain;

import java.util.ArrayList;
import java.util.List;

public class TeamFactory {
    public static List<Team> createTeams() {
        List<Team> teams = new ArrayList<>();
        
        Team team1 = new Team();
        team1.setId(1);
        team1.setCode("ANV");
        teams.add(team1);
        
        Team team2 = new Team();
        team2.setId(2);
        team2.setCode("BAX");
        teams.add(team2);
        
        Team team3 = new Team();
        team3.setId(3);
        team3.setCode("CYA");
        teams.add(team3);    
        
        Team team4 = new Team();
        team4.setId(4);
        team4.setCode("DEE");
        teams.add(team4);
        
        Team team5 = new Team();
        team5.setId(5);
        team5.setCode("EYY");
        teams.add(team5);
        
        Team team6 = new Team();
        team6.setId(6);
        team6.setCode("FAH");
        teams.add(team6);
        
        Team team7 = new Team();
        team7.setId(7);
        team7.setCode("GSA");
        teams.add(team7);
        
        Team team8 = new Team();
        team8.setId(8);
        team8.setCode("HQU");
        teams.add(team8);
        
        Team team9 = new Team();
        team9.setId(9);
        team9.setCode("ICE");
        teams.add(team9);
        
        Team team10 = new Team();
        team10.setId(10);
        team10.setCode("JAD");
        teams.add(team10);
        
        return teams;
    }
}
