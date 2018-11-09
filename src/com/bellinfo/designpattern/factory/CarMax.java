package com.bellinfo.designpattern.factory;

public class CarMax {

    Car getCar(String name){

        Car car = null;
        /*if(name.equalsIgnoreCase("Honda")){
            car = new Honda():
        }else if (name.equalsIgnoreCase("Audi")){
            car = new Audi();
        }*/

        return car;

    }
}
