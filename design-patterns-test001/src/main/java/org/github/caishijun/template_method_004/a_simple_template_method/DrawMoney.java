package org.github.caishijun.template_method_004.a_simple_template_method;

/**
 * 然后定义具体的模板方法的子类
 */

//子类实现模板方法：取款
public class DrawMoney extends BankTemplateMethod{
    @Override
    public void transact() {
        System.out.println("我要取款");
    }
}
