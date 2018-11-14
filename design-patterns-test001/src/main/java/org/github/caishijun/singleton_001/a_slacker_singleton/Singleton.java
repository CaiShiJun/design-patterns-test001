package org.github.caishijun.singleton_001.a_slacker_singleton;

/**
 * 懒汉式（线程安全，调用效率不高，但是可以延时加载）
 *
 * 来源网址：http://cmsblogs.com/?p=2161
 */
public class Singleton {

    //通过volatile关键字来确保安全
    private volatile static Singleton singleton;

    private Singleton(){}

    public static Singleton getInstance(){
        if(singleton == null){
            synchronized (Singleton.class){
                if(singleton == null){
                    //volatile变量在赋值后会创建一个内存屏障：指令重排序时，位于后面的指令不能排到内存屏障之前。
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
