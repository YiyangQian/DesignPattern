package com.yiyang.singleton;

/**
 * Effective Java
 */
public enum Mgr08 {

    INSTANCE;

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() ->
                    System.out.println(Mgr08.INSTANCE.hashCode())
            ).start();
        }
    }
}
