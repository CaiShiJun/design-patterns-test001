package org.github.caishijun.singleton_001.c_double_check_singleton;

/**
 * 3、双重检索方式
 */

/**
 * 双重检索单例模式
 * 将锁加在判断实例为空的地方，不加在方法上
 */
public class Singleton3 {
    /**
     * 1、提供未实例化的静态实例
     */
    private volatile static Singleton3 instance = null;
    /**
     * 2、私有化构造器
     */
    private Singleton3(){}
    /**
     * 3、对外提供获取实例的方法
     * 但是同步的时候将锁放到第一次获取实例的时候，这样的好处就是只有第一次会同步。效率高
     * @return
     */
    public static Singleton3 getInstance(){
        if (instance == null ) {
            Singleton3 s3;
            synchronized (Singleton3.class) {
                s3 = instance;
                if (s3 == null ) {
                    synchronized (Singleton3.class) {
                        if (s3 == null ) {
                            s3 = new Singleton3();
                        }
                    }
                    instance = s3;
                }
            }
        }
        return instance;
    }

}