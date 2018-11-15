package org.github.caishijun.singleton_001.a_slacker_singleton;

/**
 * 一、单例模式介绍
 *
 * 单例模式：保证一个类只有一个实例，并且提供一个访问该实例的全局访问点。
 *
 * 单例模式优点：
 *
 * 1.只生成一个实例，系统开销比较小
 *
 * 2.单例模式可以在系统设置全局的访问点，优化共享资源的访问。
 *
 * 常见单例模式分类：
 *
 * 主要：
 *
 * 饿汉式（线程安全，调用效率高，但是不能延时加载）
 *
 * 懒汉式（线程安全，调用效率不高，但是可以延时加载）
 *
 * 其他：
 *
 * 双重检测锁式（由于JVM底层内部模型原因，偶尔会出问题。不建议使用）
 *
 * 静态内部类式（线程安全，调用效率高。但是可以延时加载）
 *
 * 枚举单例（线程安全，调用效率高，不能延时加载）
 *
 *
 * 来源网址：https://www.cnblogs.com/meet/p/5116398.html
 *
 * 二、单例模式实例代码
 *
 * 1、懒汉式
 *
 * 懒汉式（线程安全，调用效率不高，但是可以延时加载）
 *
 * 来源网址：
 * http://cmsblogs.com/?p=2161
 * https://www.cnblogs.com/meet/p/5116398.html
 */

/**
 * 懒汉式单例：比较懒，一开始不初始化实例。等什么时候用就什么时候初始化.避免资源浪费
 */
public class Singleton1 {

    /**
     * 1、声明一个静态实例，不给它初始化。等什么时候用就什么时候初始化。节省资源
     *
     * 通过volatile关键字来确保安全，volatile变量在赋值后会创建一个内存屏障：指令重排序时，位于后面的指令不能排到内存屏障之前。
     */
    private volatile static Singleton1 singleton;

    /**
     * 2、依然私有化构造器，对外不让new
     */
    private Singleton1(){}

    /**
     * 3、对外提供一个获取实例的方法，因为静态属性没有实例化。
     * 假如高并发的时候，有可能会同时调用该方法。造成new出多个实例。所以需要加上同步synchronized，因此调用效率不高
     * 在方法上加同步，是整个方法都同步。效率不高
     * @return
     */
    public synchronized static Singleton1 getInstanceSyncMethod(){
        if (singleton == null ) {//第一次调用时为空，则直接new一个
            singleton = new Singleton1();
        }
        //之后第二次再调用的时候就已经初始化了，不用再new。直接返回
        return singleton;
    }

    /**
     * 4、进入同步块前先判断 singleton 是否已经实例化，如果已经实例化则直接返回。可以减少进入同步块的几率，效率较 getInstanceSyncMethod() 方法略高。
     * @return
     */
    public static Singleton1 getInstanceSyncBlock(){
        if(singleton == null){
            synchronized (Singleton1.class){
                if(singleton == null){
                    singleton = new Singleton1();
                }
            }
        }
        return singleton;
    }
}
