package com.memory.gof.singleton;

/**
 * @author MemoRyAxis
 * @todo Singleton
 * @date 2014/8/12 1:40
 */

/**
 * @todo The Simplest
 */
class Singleton1 {
    // one and only instantiation
    private static final Singleton1 singleton = new Singleton1();
    // private constructor
    private Singleton1() {
    }
    // provide public method that consumer could call it
    public static Singleton1 getInstance() {
        return singleton;
    }
}

/**
 * @todo Lazy Loaded
 */
class Singleton2 {

    private static Singleton2 singleton = null;
    private Singleton2() {
    }
    public static Singleton2 getInstance() {
        // Instantiate when need
        if (singleton == null)
            singleton = new Singleton2();
        return singleton;
    }
}

/**
 * @todo Synchronize
 */
class Singleton3 {

    private static Singleton3 singleton = null;
    private Singleton3() {
    }
    // effectively avoid multi thread instantiate object synchronously
    public synchronized static Singleton3 getInstance() {
        if (singleton == null)
            singleton = new Singleton3();
        return singleton;
    }
}

/**
 * @todo Double Check Lock
 */
class Singleton4 {

    private static Singleton4 singleton = null;
    private Singleton4() {
    }
    public static Singleton4 Singleton4() {
        if(singleton == null) {
            synchronized (Singleton4.class) {
                if(singleton == null) {
                    singleton = new Singleton4();
                }
            }
        }
        return singleton;
    }
}

public class Singleton {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Singleton2.getInstance());
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Singleton2.getInstance());
            }
        });
        t1.start();
        t2.start();
    }
}
