package org.github.caishijun.mediator_008.a_simple_mediator;

/**
 * 现在开始测试：
 *
 * 市场部需要向财务部发出申请，这时候就可以通过中介者（总经理）来向财务部发出申请了。而不是直接调用财务部的方法
 */

/**
 * 输出结果：
 *
 *             市场部：正在跑市场......
 *
 *             市场部向总经理说：合同已搞定，需财务部报销.....
 *
 *             财务部：会计正在核对财务......
 *
 * 代码的UML图如下：
 *
 *
 *
 *
 *
 * 三、中介者模式总结
 *
 * 中介者模式的本质：解耦多个同事对象之间的交互关系，每个对象都持有中介者对象的引用。只跟中介者对象打交道。
 *
 * 通过中介者对象统一管理这些交互对象。
 *
 * 开发中常见应用场景：
 *
 * MVC模式中的C部分，M和V都和它打交道
 *
 * Java.lang.reflect.Method#invoke()​
 */

public class A_Simple_Mediator_Test {
    public static void main(String[] args) {
        Mediator m = new President();//构建中介者对象：总经理
        Market market = new Market(m);//构建市场部
        market.selfAction();
        market.outAction();//市场部和财务部交互
    }
}
