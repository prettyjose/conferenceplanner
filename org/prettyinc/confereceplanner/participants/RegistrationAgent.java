package org.prettyinc.confereceplanner.participants;

import org.prettyinc.confereceplanner.conference.Conference;
import org.prettyinc.confereceplanner.conference.SessionOrganiser;
import org.prettyinc.confereceplanner.conference.SessionsIndex;
import org.prettyinc.confereceplanner.conference.sessions.Session;
import org.prettyinc.confereceplanner.participants.Attendee;

public
class RegistrationAgent {
    Conference conference;
    public RegistrationAgent(){
        conference = new Conference("Vapasi-TW", "Talks organised by TW for women who wish to come back to Dev");
        conference.plan(3);
    }
    public void doRegistrations(){
        //logic to add user and book sessions
        Attendee attendee=new Attendee("preethy");
        attendee.bookSessions(SessionsIndex.XTREME_PROGRAMMING.getSessionName());

        attendee=new Attendee("pretty");
        attendee.bookSessions(SessionsIndex.XTREME_PROGRAMMING.getSessionName());

        attendee=new Attendee("Neha");
        attendee.bookSessions(SessionsIndex.TDD.getSessionName());

        attendee=new Attendee("Pratibha");
        attendee.bookSessions(SessionsIndex.TDD.getSessionName());

        attendee=new Attendee("Anu");
        attendee.bookSessions(SessionsIndex.DESIGN_THINKING.getSessionName());

    }
}
