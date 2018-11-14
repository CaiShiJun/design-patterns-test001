package org.github.caishijun.flyweight_022.a_simple_flyweight;

/**
 * 一、享元模式介绍
 *
 * 享元模式（FlyWeight）：运用共享技术有效的支持大量细粒度对象的重用。
 *
 * 应用场景：如果项目中有很多完全相同或相似的对象，则可以使用享元模式，节省内存。
 *
 * 享元对象能做到共享的关键就是区分了内部状态和外部状态。
 *
 * 内部状态：可以共享，不会随环境变化而变化
 *
 * 外部状态：不可以共享，会随环境变化而变化
 *
 * 享元模式UML图
 *
 *
 *
 * FlyweightFactory（享元工厂类）：创建并管理享元对象，享元池一般设计成键值对
 *
 * FlyWeight（抽象享元类）：通常是一个接口或者抽象类，声明公共方法，这些方法可以向外界提供对象的内部状态，设置外部状态。
 *
 * ConcreteFlyWeight（具体享元类）：为内部状态提供成员变量进行存储
 *
 * UnsharedConcreteFlyWeight（非共享享元类）：不能被共享的子类可以设计为非共享享元类
 *
 * 例如：围棋中的享元模式，在围棋中，所有的白色或黑色的（形状、大小，颜色都一样）只是位置不同，那像这样的情况，可以使用享元模式。
 *
 * 来源网址：https://www.cnblogs.com/meet/p/5116445.html
 *
 * 把颜色、形状、大小给共享出来（内部状态）。位置不共享（外部状态）
 *
 *
 *
 * 二、享元模式代码实现
 *
 * 将棋子例子用代码实现
 *
 * FlyWeight（抽象享元类）：
 */

/**
 * 享元类接口：可以共享的有颜色，大小，形状
 * FlyWeight（抽象享元类）：通常是一个接口或者抽象类，声明公共方法，
 * 这些方法可以向外界提供对象的内部状态，设置外部状态。
 */
public interface ChessFlyWeight {
    //这里只设置一个颜色,大小和形状省略
    void setColor(String c);
    String getColor();
    void display(Coordinate c);//显示棋子
}

/**
 * ConcreteFlyWeight（具体享元类）：为内部状态提供成员变量进行存储
 */
//享元的具体实现：ConcreteFlyWeight（具体享元类）：为内部状态提供成员变量进行存储
class concreteFlyWeight implements ChessFlyWeight{
    private String color;//这里就是为内部状态提供成员变量进行存储
    //构造的时候初始化color属性
    public concreteFlyWeight(String color) {
        super();
        this.color = color;
    }
    @Override
    public void setColor(String c) {
        this.color = c;
    }
    @Override
    public String getColor() {
        return color;
    }
    @Override
    public void display(Coordinate c) {
        System.out.println("棋子颜色："+color);
        System.out.println("棋子位置：("+c.getX()+","+c.getY()+")");
    }
}