package org.prettyinc.confereceplanner.conference;

import org.prettyinc.confereceplanner.conference.sessions.Session;

import java.util.HashMap;
import java.util.Map;

public class SessionOrganiser{
    Map<String, Session> sessionsMap;
    static SessionOrganiser sessionOrganiser;
    private SessionOrganiser(){
        sessionsMap=new HashMap<>();
    }
    public Map<String, Session> getSessionsMap(){
        return sessionsMap;
    }
    public void addSessions(int n){
        Session session = new Session(SessionsIndex.DESIGN_THINKING.getSessionName(),"Prachi",1);
        sessionsMap .put("creative confidence",session);

        session = new Session(SessionsIndex.XTREME_PROGRAMMING.getSessionName(),"Rajshree",1);
        sessionsMap .put("xTreme Programming",session);

        session = new Session(SessionsIndex.TDD.getSessionName(),"Ravi",1);
        sessionsMap .put("TDD",session);
    }
    public static SessionOrganiser getSessionOrg(){
        if(sessionOrganiser ==null){
            sessionOrganiser = new SessionOrganiser();
        }
        return sessionOrganiser;
    }
}
