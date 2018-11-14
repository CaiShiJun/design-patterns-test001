package org.github.caishijun.state_020.a_simple_state;

/**
 * ​一、状态模式介绍
 *
 * 状态模式：当一个对象的内在状态改变时允许改变其行为，这个对象看起来像是改变了其类
 *
 * 状态模式主要解决的是当控制一个对象状态转换的条件表达式过于复杂时的情况。
 *
 * 把状态的判断逻辑转移到表示不同状态的一系列类当中，可以把复杂的判断逻辑简化。
 *
 * 当遇到不同的状态遇到不同的行为的时候，可以使用状态模式
 *
 * 状态模式UML图
 *
 *
 *
 * State（抽象状态类）：定义一个接口以封装与Context的一个特定状态相关的行为。
 *
 * ConcreteStateA，B，C（具体状态）：每一个子类实现一个不同的状态或行为
 *
 * Context（上下文）：维护一个State子类状态的实例，这个实例中定义了当前的状态。
 *
 * 来源网址：https://www.cnblogs.com/meet/p/5116415.html
 *
 * 二、状态模式代码实现
 *
 * 首先按照UML图中，定义一个State接口，使用抽象类也行
 */

//抽象状态类
public interface State {
    void handler();
}