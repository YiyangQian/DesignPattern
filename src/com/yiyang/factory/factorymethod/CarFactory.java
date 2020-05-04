package com.yiyang.factory.factorymethod;


public class CarFactory {
    public Moveable create() {
        //steps of building cars
        return new Car();
    }
}
