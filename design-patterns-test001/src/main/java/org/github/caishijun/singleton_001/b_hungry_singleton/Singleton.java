package org.github.caishijun.singleton_001.b_hungry_singleton;

/**
 * 饿汉式（线程安全，调用效率高，但是不能延时加载）
 *
 * 饿汉式单例：所谓饿汉式，就是比较饿。当类一加载的时候就直接new了一个静态实例。不管后面有没有用到该实例
 *
 * 来源网址：http://www.cnblogs.com/meet/p/5116398.html
 */
public class Singleton {
    /**
     * 1、提供一个静态变量。
     * 当类加载器加载该类时，就new一个实例出来。从属于这个类。不管后面用不用这个类。所以没有延时加载功能
     */
    private static Singleton instance = new Singleton();
    /**
     * 2、私有化构造器:外部是不能直接new该对象的
     */
    private Singleton(){}
    /**
     * 3、对外提供一个公共方法来获取这个唯一对象（方法没有使用synchronized则调用效率高）
     * @return
     */
    public static Singleton getInstance(){
        return instance;
    }
}
