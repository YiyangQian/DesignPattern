package com.yiyang.factory.factorymethod;

public class Main {

    public static void main(String[] args) {
        Moveable vehicle = new CarFactory().create();
        vehicle.go();

        vehicle = new BroomFactory().create();
        vehicle.go();
     }
}
