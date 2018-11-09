package com.bellinfo.designpattern.facade;

import java.util.ArrayList;
import java.util.List;

public class HotelInfo {

    public List<Hotel> getFlightDetails(){

        ArrayList<Hotel> hlist = new ArrayList<>();
        hlist.add(new Hotel("Hotel96" , "Sterling"));
        hlist.add(new Hotel("SuitsInn", "Ashburn"));
        hlist.add(new Hotel("Hilton", "Fairfax"));
        return hlist;


    }
}
