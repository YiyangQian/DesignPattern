package com.yiyang.factory.abstractmethod;

public class MagicFactory extends AbstractFactory {
    @Override
    Food createFood() {
        return new Mushroom();
    }

    @Override
    Weapon createWeapon() {
        return new Wand();
    }

    @Override
    Vehicle createVehicle() {
        return new Broom();
    }
}
