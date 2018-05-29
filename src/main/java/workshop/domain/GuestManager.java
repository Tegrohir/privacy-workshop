package workshop.domain;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

public class GuestManager {
    public static Guest getGuest(HttpServletRequest request) {
        Service service = Service.getInstance();        
        String session = null;
        Guest guest = null;
        
        if (request.getCookies() == null) {
            return null;
        }
        
        for (Cookie cookie: request.getCookies()) {
            if (cookie.getName().equals("session")) {
                session = cookie.getValue();
            }
        }
        
        if (session != null) {
            guest = service.getGuest(session);
        }
        
        return guest;
    }
}
