package org.prettyinc.confereceplanner.conference.sessions;

public class Seat{
    String seatNum;
    Boolean isBooked;
    String owner;
    Seat(String num){
        seatNum =num;
        this.isBooked =Boolean.FALSE;
    }
    public void book(){
        this.isBooked =Boolean.TRUE;
    }
}
