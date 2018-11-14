package org.github.caishijun.strategy_012.a_simple_strategy;

/**
 * 接下来开始定义一个上下文，用来维护不同用户不同的折扣。
 */

//上下文：用来维护不同对象的不同折扣
public class Context {
    private Strategy strategy;//持有算法族的引用
    public Context(Strategy strategy) {
        super();
        this.strategy = strategy;
    }
    //打印价钱
    public void printPrice(double price){
        System.out.println("应付金额："+Math.round(strategy.getPrice(price)));
    }
}
