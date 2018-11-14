package org.github.caishijun.adapter_013.a_class_adapter;

/**
 * 一、适配器模式介绍
 *
 * 适配器模式：将一个类的接口转换成客户希望的另外一个接口。Adapter模式使得原本由于接口不兼容而不能一起工作的类可以一起工作。
 *
 * 来源网址：https://www.cnblogs.com/meet/p/5116467.html
 *
 * 例如：
 *
 * NBA中的球员来自不同国家，而世界标准语言是英语。那他们不会英语，也不能各自学习所有国家的语言。所以，最好的办法就是请不同的翻译
 *
 * 将这些球员国家的语言翻译成英语。而这些翻译就是适配器
 *
 * 适配器模式分类：
 *
 * 1、类适配器模式（不推荐使用）：由于类适配器模式需要多重继承对一个接口对另一个接口进行适配，而C#,Java不支持多重继承。
 *
 * 2、对象适配器模式：采用组合的方式
 *
 *
 *
 * 二、适配器模式代码实现
 *
 * 2.1 类适配器
 */

/**
 * 测试对象适配器模式
 */
public class Client {
    //说话
    public void test1(Target t){
        t.handleReq();
    }

    public static void main(String[] args) {
        Client c = new Client();
        Adaptee a = new Adaptee();
        Target t = new Adapter();
        c.test1(t);
    }
}
