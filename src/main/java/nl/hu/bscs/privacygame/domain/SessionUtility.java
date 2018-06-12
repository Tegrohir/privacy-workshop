package nl.hu.bscs.privacygame.domain;

import javax.servlet.http.HttpServletRequest;

public class SessionUtility {

    private SessionUtility(){
    }

    public static String getSessionId(HttpServletRequest request) {
        return request.getSession().getId();
    }
}
