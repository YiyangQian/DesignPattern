package com.yiyang.singleton;

/**
 * lazy instance
 * multi-thread unsafe
 */
public class Mgr03 {
    private static Mgr03 instance;

    private Mgr03() {};

    public static Mgr03 getInstance() {
        if (instance == null) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            instance = new Mgr03();
        }
        return instance;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() ->
                    System.out.println(Mgr03.getInstance().hashCode())
            ).start();
        }
    }
}
