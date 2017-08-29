package org.prettyinc.confereceplanner.participants;

import org.prettyinc.confereceplanner.conference.sessions.Session;
import org.prettyinc.confereceplanner.conference.SessionOrganiser;

public
class SessionBookingAgent {
    public void bookSession(String confId){
        SessionOrganiser organiser=SessionOrganiser.getSessionOrg();
        Session chosenSession = organiser.getSessionsMap().get(confId);
        Boolean isSuccessful = chosenSession.register();
        if(isSuccessful) {
            System.out.println("\nA seat is booked for "+ confId);
        }else{
            System.out.println("\nSorry! "+ confId+ " is housefull. Why don't you check in for another session?");
        }
    }
}
