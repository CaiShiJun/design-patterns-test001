package org.github.caishijun.chain_of_responsibility_010.a_simple_chain_of_responsibility;

/**
 * 一、责任链模式介绍
 *
 * 责任链模式：将能够处理同一类请求的对象连成一条链，使这些对象都有机会处理请求，所提交的请求沿着链传递。从而避免请求的
 *
 * 发送者和接受者之间的耦合关系。链上的对象逐个判断是否有能力处理该请求，如果能则就处理，如果不能，则传给链上的下一个对象。
 *
 * 直到有一个对象处理它为止。
 *
 * 场景：
 *
 * 1、打牌时，轮流出牌
 *
 * 2、接力赛跑
 *
 * 3、请假审批
 *
 * 4、公文审批
 *
 * 责任链UML图：
 *
 *
 *
 * Handler：表示处理请求的接口，在这个接口里可以定义链上的下一个继承者，和一个处理请求的抽象方法。
 *
 * ConcreteHandler1和ConcreteHandler2：表示具体的处理者
 *
 * 来源网址：https://www.cnblogs.com/meet/p/5116440.html
 *
 * 二、责任链模式代码实现
 *
 * 这里以请假的流程为例，用责任链模式来实现
 *
 * 首先这里定义一个请假信息的对象
 */

/**
 * 请假的基本信息
 */
public class LeaveRequest {
    private String empName;//请假人
    private int leaveDays;//请假天数
    private String reason;//请假理由
    public LeaveRequest(String empName, int leaveDays, String reason) {
        super();
        this.empName = empName;
        this.leaveDays = leaveDays;
        this.reason = reason;
    }
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public int getLeaveDays() {
        return leaveDays;
    }
    public void setLeaveDays(int leaveDays) {
        this.leaveDays = leaveDays;
    }
    public String getReason() {
        return reason;
    }
    public void setReason(String reason) {
        this.reason = reason;
    }
}