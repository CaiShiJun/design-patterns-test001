package org.github.caishijun.singleton_001.f_deciphering_by_reflection_singleton;

/**
 * 用于测试反射破解的单例类
 */
public class Singleton6 {
    /**
     * 1、提供一个静态变量。
     * 当类加载器加载该类时，就new一个实例出来。从属于这个类。不管后面用不用这个类。所以没有延时加载功能
     */
    private static Singleton6 instance = new Singleton6();
    /**
     * 2、私有化构造器:外部是不能直接new该对象的
     */
    private Singleton6(){
    }
    /**
     * 3、对外提供一个公共方法来获取这个唯一对象（方法没有使用synchronized则调用效率高）
     * @return
     */
    public static Singleton6 getInstance(){
        return instance;
    }

}