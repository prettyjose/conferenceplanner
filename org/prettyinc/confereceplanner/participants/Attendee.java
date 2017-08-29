package org.prettyinc.confereceplanner.participants;

public class Attendee{
    String name;
    public Attendee(String nme){
        name=nme;
    }
    public void bookSessions(String... sessions) {
        SessionBookingAgent sessionBookingAgent = new SessionBookingAgent();
        for (String sessionName : sessions) {
            sessionBookingAgent.bookSession(sessionName);
        }
    }
}
