package org.prettyinc.confereceplanner.conference.sessions;

public class Session{
    String sessionName;
    String presenter;
    SeatManager seatMgr;
    //add volunteers, attendees if needed.Think.
    public Session(String a, String b, int nSeats){
        sessionName =a;
        presenter =b;
        seatMgr = new SeatManager(nSeats);
    }
    public Boolean register(){
        return seatMgr.bookASeat();
    }
}
