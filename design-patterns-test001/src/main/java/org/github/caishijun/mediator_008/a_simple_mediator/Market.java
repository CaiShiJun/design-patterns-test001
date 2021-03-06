package org.github.caishijun.mediator_008.a_simple_mediator;

/**
 * 市场部：
 */

//具体同事类：市场部
public class Market implements Department{
    private Mediator m;//中介者（总经理）
    //构造的时候将中介者构造进来
    public Market(Mediator m) {
        super();
        this.m = m;
        //ConcreteMediator（具体中介者对象）：实现抽象中介者的方法
        //它需要知道所有具体同事类，并从具体同事接收消息，向具体同事对象发出命令。
        m.register("market", this);//将当前部门对象注册到中介者对象中，
    }
    @Override
    public void selfAction() {
        System.out.println("市场部：正在跑市场......");
    }
    @Override
    public void outAction() {
        System.out.println("市场部向总经理说：合同已搞定，需财务部报销.....");
        m.command("finacial");//通过总经理这个中介，向总经理发出申请，告知需要跟财务部交互报销经费

        /**
         * 注意这里！！！    m.command("finacial");     这里通过总经理这个中介者对象，向财务部发出了申请。
         *
         * 通过中介者对象和财务部交互而没有直接跟财务部打交道
         */
    }
}