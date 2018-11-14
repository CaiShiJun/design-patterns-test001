package org.github.caishijun.decorator_011.a_simple_decorator;

/**
 * 一、装饰模式介绍
 *
 * 装饰模式（decorator）：表示动态的给一个对象添加一些新的功能（利用子类继承父类也可以实现），但是比生成子类方式更灵活。
 *
 * 也叫装饰者模式或者装饰器模式
 *
 * 例如：我们每个人身上穿的衣服，鞋子，领带，披风都可以理解为是对人的装饰。
 *
 * 装饰器模式类图：
 *
 *
 *
 * Component：定义一个对象接口，可以给这些对象动态添加职责。真实对象和装饰者对象有相同的接口，这样客户端不用知道内部有装饰者对象（Decorator）
 *
 * 存在的，还是以之前处理真实对象的相同方式来和装饰者对象交互。
 *
 * ConcreteComponent：是定义了一个具体的对象（例如：人），也可以给这个对象添加一些其他职责。
 *
 * Decorator：装饰抽象类，继承了Component，从外类来扩展Component类的功能，但对Component来说，是无需知道Decorator存在的。
 *
 * ConcreteDecorator：就是具体的装饰对象了（衣服，鞋子..），它起到了给Component添加职责的功能。
 *
 * 来源网址：https://www.cnblogs.com/meet/p/5116450.html
 *
 * 二、装饰模式代码实现
 *
 *  定义一个Component对象接口（ICar），汽车移动
 */

/**
 * ICar表示Component：
 */
public interface ICar {
    void move();//汽车移动
}