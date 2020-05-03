package com.yiyang.singleton;

/**
 *  instance will already be created, once class is loaded into JVM
 *  thread-safe
 */
public class Mgr01 {
    private static final Mgr01 INSTANCE = new Mgr01();

    private Mgr01() {};

    public static Mgr01 getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        Mgr01 manager1 = Mgr01.getInstance();
        Mgr01 manager2 = Mgr01.getInstance();
        System.out.println(manager1 == manager2);
        System.out.println("manager1 hashCode: " + manager1.hashCode());
        System.out.println("manager2 hashCode: " + manager2.hashCode());
    }
}
