package org.github.caishijun.mediator_008.a_simple_mediator;

/**
 * 再定义一个抽象同事类（Colleague）：仍然使用一个接口来定义
 */

//抽象同事类：部门
public interface Department {
    void selfAction();//做本部门的事
    void outAction();//向总经理发出申请
}
