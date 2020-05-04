package com.yiyang.factory.abstractmethod;

/**
 * 1. why not use interface for Vehicle, Food, Weapon, AbstractFactory, but we used Interface for Moveable?
 * A: cause vehicle, food, weapon are real objects in life(noun), and Moveable is more qualified as an interface(adj)
 *
 * 2: compare FactoryMethod and AbstractFactory
 * A: FactoryMethod is easier to add new factories for new products, eg. if having a new product Hat, we can create a
 * HatFactory easily.
 * AbstractFactory is not so flexible to add/remove products from a product family, cause it will affect all implemented
 * Factories. However AbstractFactory is easier to manage multiple product families.
 */
public class Main {

    public static void main(String[] args) {
        AbstractFactory f1 = new ModernFactory();
        createProductFamily(f1);

        AbstractFactory f2 = new MagicFactory();
        createProductFamily(f2);
    }

    private static void createProductFamily(AbstractFactory f) {
        Vehicle v = f.createVehicle();
        v.go();

        Food food = f.createFood();
        food.eat();

        Weapon w = f.createWeapon();
        w.attack();
    }
}
