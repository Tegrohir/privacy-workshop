package nl.hu.bscs.privacygame.domain;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private int id;
    private String code;
    private List<User> users = new ArrayList<>();
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getCode() {
        return code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }
    
    public List<User> getUsers() {
        return users;
    }
    
    public User getUser(String session) {
        for (User user : users) {
            if (user.getSession().equals(session)) {
                return user;
            }
        }
        
        return null;
    }
    
    public void addUser(User user) {
        this.users.add(user);
    }
}
