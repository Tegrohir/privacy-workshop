package workshop.domain;

import javax.servlet.http.HttpServletRequest;

public class GuestManager {
    public static Guest getGuest(HttpServletRequest request) {
        Service service = Service.getInstance();        
        
        String session = request.getSession().getId();        
        return service.getGuest(session);
    }
}
