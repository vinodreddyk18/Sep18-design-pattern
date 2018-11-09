package com.bellinfo.designpattern.facade;

import java.util.ArrayList;
import java.util.List;

public class FlightInfo {

    public List<Flight> getFlightDetails(){

        ArrayList<Flight> flist = new ArrayList<>();
        flist.add(new Flight(296, "Sprint"));
        flist.add(new Flight(296, "Sprint"));
        flist.add(new Flight(296, "Sprint"));
        return flist;


    }
}
