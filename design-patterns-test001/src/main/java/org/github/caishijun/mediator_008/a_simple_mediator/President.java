package org.github.caishijun.mediator_008.a_simple_mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * 定义具体的中介者（ConcreteMediator）：总经理
 */

//中介者的具体实现：总经理
public class President implements Mediator{
    //总经理也需要知道所有具体同事类
    private Map<String,Department> map = new HashMap<String,Department>();
    @Override
    public void register(String dname, Department d) {
        map.put(dname, d);//将同事注册到总经理的所有同事类容器中
    }
    @Override
    public void command(String dname) {
        map.get(dname).selfAction();//根据部门名称向具体的部门下命令
    }
}