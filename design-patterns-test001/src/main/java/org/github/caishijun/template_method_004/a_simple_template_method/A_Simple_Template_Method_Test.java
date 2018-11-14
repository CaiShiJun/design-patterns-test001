package org.github.caishijun.template_method_004.a_simple_template_method;

/**
 * 三、总结
 *
 * 什么时候用模板方法模式？
 *
 * 实现一些操作时，整体步骤很固定，但是呢。就是其中一小部分容易变，这时候可以使用模板方法模式，将容易变的部分抽象出来，供子类实现。
 *
 * 开发中常见场景：
 *
 *         其实，各个框架中，都有模板方法模式的影子。
 *
 *         数据库访问的封装
 *
 *         Junit单元测试
 *
 *         servlet中关于doGet/doPost方法的调用
 *
 *         Hibernate中模板程序
 *
 *         spring中JDBCTemplate，HibernateTemplate等等
 */

public class A_Simple_Template_Method_Test {
    public static void main(String[] args) {
        //定义子类方式实现模板方法
        BankTemplateMethod template = new DrawMoney();
        template.process();

        //当然，也可以使用一个匿名内部类的方式来实现这种模板方法。
        BankTemplateMethod template1 = new BankTemplateMethod() {
            //这里使用匿名内部类实现:只需实现具体业务部分，其他部分则使用模板方法定义好的骨架
            @Override
            public void transact() {
                System.out.println("我要存钱");
            }
        };
        template1.process();
    }
}
