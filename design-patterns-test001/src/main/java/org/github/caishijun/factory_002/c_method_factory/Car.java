package org.github.caishijun.factory_002.c_method_factory;

/**
 * 一、工厂模式介绍：
 *
 * 工厂模式实现了创建者和调用者的分离
 *
 * 工厂模式分类：
 *
 * 1.简单工厂模式
 *
 * 2.工厂方法模式：定义一个用于创建对象的接口，让子类决定实例化哪一个类，工厂方法使一个类的实例化延迟到其子类
 *
 * ​3.抽象工厂模式：提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类。
 *
 * 面向对象设计的基本原则：
 *
 * OCP（开闭原则，Open-Closed Principle）：
 *
 *         一个软件的实体应当对扩展开放，对修改关闭。也就是说如果你要对一个已存在的系统做扩展的时候尽量要新增加类，而不是在原有的基础上修改。
 *
 * DIP（依赖倒转原则，Dependence Inversion Principle）
 *
 *        针对接口编程，不要针对实现编程。
 *
 * LoD（迪米特法则，Law Of Demeter）
 *
 *        只与你直接的朋友通信，而避免和陌生人通信。一个类尽量少的依赖其他类
 *
 *
 * 来源网址：https://www.cnblogs.com/meet/p/5116400.html
 *
 * 二、工厂模式代码实现
 */

//汽车接口
public interface Car {
    void run();
}

//奥迪
class Audi implements Car {
    @Override
    public void run() {
        System.out.println("奥迪在跑");
    }
}

//比亚迪
class Byd implements Car {
    @Override
    public void run() {
        System.out.println("比亚迪在跑。");
    }
}

//汽车测试类
class TestCar {//调用者
    public static void main(String[] args) {
        Car c1 = new Byd();
        Car c2 = new Audi();
        c1.run();
        c2.run();
        //未使用工厂模式的时候，调用者会依赖很多类。违反了开闭原则
    }
}