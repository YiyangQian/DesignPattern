package com.yiyang.singleton;

/**
 * same as Mgr01
 */
public class Mgr02 {
    private static final Mgr02 INSTANCE;

    static {
        INSTANCE = new Mgr02();
    }

    private Mgr02 () {};

    public static Mgr02 getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        Mgr02 manager1 = Mgr02.getInstance();
        Mgr02 manager2 = Mgr02.getInstance();
        System.out.println(manager1 == manager2);
    }
}
