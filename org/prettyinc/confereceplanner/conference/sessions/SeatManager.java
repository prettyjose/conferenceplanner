package org.prettyinc.confereceplanner.conference.sessions;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Boolean.FALSE;

public class SeatManager{
    Map<String,Seat> seats;
    int bookedSeats;
    int capacity;
    SeatManager(int n){
        bookedSeats =0;
        capacity =n;
        seats=new HashMap<>();
        seats .put("1a",new Seat("1a"));
        seats .put("1b",new Seat("1b"));
        seats .put("1c",new Seat("1c"));
    }
    public Boolean bookASeat(){
        if(bookedSeats == capacity ){
            return FALSE; //no free seat
        }
        for(Seat seat:seats. values()) {

            if ( seat.isBooked == FALSE){
                seat.book();
                bookedSeats++;
                return Boolean.TRUE;
            }
        }
        return FALSE;
    }
}