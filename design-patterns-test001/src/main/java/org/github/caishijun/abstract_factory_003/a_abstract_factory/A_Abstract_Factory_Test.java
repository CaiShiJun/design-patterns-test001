package org.github.caishijun.abstract_factory_003.a_abstract_factory;

/**
 * 来源网址：https://www.cnblogs.com/meet/p/5116400.html
 *
 * 具体生产汽车的时候就可以根据需要来创建具体的汽车了。
 *
 * 以上就是一个针对产品族的工厂，用来生产一个产品，而不是一个配件。假如以后想生产一个中端汽车产品。就可以增加相应的类，实现汽车总工厂CarFactory
 *
 * 来生产。
 *
 *
 *
 * 三、工厂模式要点
 *
 * 简单工厂模式（静态工厂模式）
 *
 *    虽然某种程度不符合面向对象规则（不符合开闭原则，每次新增内容都需要在原有代码上修改），但是实际使用最多。
 *
 * 工厂方法模式
 *
 *    不修改已有类的前提下，通过增加新类来实现扩展。
 *
 * 抽象工厂模式
 *
 *     不可以增加产品中某一个配件，可以增加一个具体的产品族。
 *
 *
 *
 * 四、应用场景
 *
 * JDK中的Calendar的getInstance方法
 *
 * JDBC中Connection对象的获取getConnection
 *
 * Hibernate中SessionFactory创建Session
 *
 * spring中的IOC容器创建管理bean对象的时候也是工厂模式
 *
 * XML解析时的DocumentBuilderFactory创建解析器对象
 *
 * 反射中Class对象的newInstance方法。
 */

public class A_Abstract_Factory_Test {
    public static void main(String[] args) {
        //想要好车
        CarFactory factory = new LuxuryCarFactory();
        Engine engine = factory.createEngine();//创建高端发动机
        engine.run();
        engine.start();

        //想要差一点的车
        CarFactory factory2 = new LowCarFactory();
        Engine e2= factory2.createEngine();
        Seat s2 = factory2.createSeat();
        Tyre t2 = factory2.createTyre();
        e2.run();
        e2.start();
        //以后想要中等车的话可以增加相应中等配件的接口
    }
}
