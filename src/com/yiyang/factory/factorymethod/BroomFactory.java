package com.yiyang.factory.factorymethod;

public class BroomFactory {
    public Moveable create() {
        //steps of building broom
        return new Broom();
    }
}
