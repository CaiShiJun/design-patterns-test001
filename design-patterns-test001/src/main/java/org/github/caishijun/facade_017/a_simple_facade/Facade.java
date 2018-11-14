package org.github.caishijun.facade_017.a_simple_facade;

/**
 * 增加外观模式后：新增一个Facade类
 *
 * 三、开发中外观模式应用场景
 *
 * 其实外观模式就是我们常见的封装，在我们实际开发中，遇到的各种对子系统各模块封装的逻辑，都可以理解为外观模式
 *
 * JDBC封装后的，commons提供的DBUtils类
 *
 * Hibernate提供的工具类，Spring JDBC工具类等
 */

/**
 * 外观模式：封装子系统，对外提供一个门面方法
 */
public class Facade {
    //所有子系统的引用
    private SubSystemClass s1 = null;
    private SubSystemClass2 s2 = null;
    private SubSystemClass3 s3 = null;
    //构造子系统的引用
    public Facade() {
        this.s1 = new SubSystemClass();
        this.s2 = new SubSystemClass2();
        this.s3 = new SubSystemClass3();
    }
    /**
     * 具体的外观方法
     */
    public void facade(){
        s1.methodOne();
        s2.methodTwo();
        s3.methodThree();
    }
}