package org.github.caishijun.chain_of_responsibility_010.a_simple_chain_of_responsibility;


/**
 * 然后定义一个抽象类，来处理各个请求之间的关系。也就是UML图中的Handler部分
 */

/**
 * 抽象类：管理责任链上的对象处理的抽象类
 */
public abstract class Leader {
    protected String name;
    protected Leader nextLeader;//下一个继承者
    public Leader(String name) {
        super();
        this.name = name;
    }
    //设置责任链上的下一个继承者
    public void setNextLeader(Leader nextLeader) {
        this.nextLeader = nextLeader;
    }
    //处理请求的抽象方法
    public abstract void handleRequest(LeaveRequest leader);
}
