package com.yiyang.singleton;

/**
 * lazy loading
 * trying to optimize and make it more efficient
 * multi-thread unsafe
 */
public class Mgr05 {
    private static Mgr05 INSTANCE;

    public Mgr05() {};

    public static Mgr05 getInstance() {
        if (INSTANCE == null) {
            synchronized (Mgr05.class) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                INSTANCE = new Mgr05();
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() ->
                    System.out.println(Mgr05.getInstance().hashCode())
            ).start();
        }
    }
}
