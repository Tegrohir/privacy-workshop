package nl.hu.bscs.privacygame.domain;

import javax.servlet.http.HttpServletRequest;

public class SessionUtility {
    public static String getSessionId(HttpServletRequest request) {
        return request.getSession().getId();
    }
    
//    public static User getUser(HttpServletRequest request) {
//        Service service = Service.getInstance();        
//        
//        String session = request.getSession().getId();        
//        return service.getUser(session);
//    }
//    
//    public static void createUser(HttpServletRequest request) {
//        String session = request.getSession().getId();
//        User user = new User();
//        user.setSession(session);
//        
//        Service service = Service.getInstance();
//        service.getTeam(user);
//    }
}
