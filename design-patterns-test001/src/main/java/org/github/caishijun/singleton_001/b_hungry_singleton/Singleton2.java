package org.github.caishijun.singleton_001.b_hungry_singleton;

/**
 * 饿汉式（线程安全，调用效率高，但是不能延时加载）
 *
 * 饿汉式单例：所谓饿汉式，就是比较饿。当类一加载的时候就直接new了一个静态实例。不管后面有没有用到该实例
 *
 * 来源网址：http://www.cnblogs.com/meet/p/5116398.html
 */
public class Singleton2 {
    /**
     * 1、提供一个静态变量。
     * 当类加载器加载该类时，就new一个实例出来。从属于这个类。不管后面用不用这个类。所以没有延时加载功能。
     * 这里就不需要加 volatile ，因为可以调用 getInstance() 方法获取 Singleton 实例的引用的时候， Singleton 对象已经完成构建和赋值。
     */
    private static Singleton2 instance = new Singleton2();
    /**
     * 2、私有化构造器:外部是不能直接new该对象的
     */
    private Singleton2(){}
    /**
     * 3、对外提供一个公共方法来获取这个唯一对象（方法没有使用synchronized则调用效率高）
     * @return
     */
    public static Singleton2 getInstance(){
        return instance;
    }
}
