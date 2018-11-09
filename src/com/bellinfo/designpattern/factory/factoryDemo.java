package com.bellinfo.designpattern.factory;

public class factoryDemo {
    public static void main(String[] args) {

        CarMax carMax = new CarMax();
        Car car = carMax.getCar("Honda");

    }
}
