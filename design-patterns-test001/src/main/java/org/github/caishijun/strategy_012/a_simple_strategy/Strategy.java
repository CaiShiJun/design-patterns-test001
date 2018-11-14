package org.github.caishijun.strategy_012.a_simple_strategy;


/**
 * 一、策略模式介绍
 *
 * 策略模式：它定义了算法家族，分别封装起来，让它们之间可以互相替换，此模式让算法的变化不会影响到使用算法的客户。
 *
 * 例如：
 *
 * 商场中的收银软件，内部是怎么针对不同的商品打不同的折扣呢？又或者，是怎么根据不同会员等级打不同的折扣呢？
 *
 * 其实内部就是定义了一个算法家族，给每个会员或者商品都指定一个特定的算法，根据不同的算法，打不同的折扣。
 *
 * 策略模式UML图：
 *
 *
 *
 * Strategy（抽象算法接口）：定义了所有支持算法的公共接口
 *
 * ConcreteStrategyA、ConcreteStrategyB和ConcreteStrategyC：继承于Strategy，封装了具体的算法
 *
 * Context（上下文）：用来维护不同对象的不同算法实现
 *
 * 来源网址：https://www.cnblogs.com/meet/p/5116419.html
 *
 * 二、策略模式代码实现
 *
 * 这里以不同的用户买商品打折为例
 *
 * 首先定义一个抽象算法接口：
 */

//抽象算法接口：定义了所有支持算法的公共接口
public interface Strategy {
    //算法方法:打印商品的价格（不同的实现打不同的折扣）
    public double getPrice(double price);
}
