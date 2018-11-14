package org.github.caishijun.chain_of_responsibility_010.a_simple_chain_of_responsibility;

/**
 * 接下来就可以开始定义处理请求的具体对象了，比如处理请假信息的：主任，经理，总经理等等。这些对象都必须继承抽象类，来处理请求。
 *
 * 主任对象：处理小于等于3天的假期
 */

//主任
public class Director extends Leader {
    public Director(String name) {
        super(name);
    }
    /**
     * 责任链上对象对请求的具体处理
     */
    @Override
    public void handleRequest(LeaveRequest leader) {
        if (leader.getLeaveDays()<=3) {
            System.out.println("请假人："+leader.getEmpName()+",天数："+leader.getLeaveDays()+",理由："+leader.getReason());
            System.out.println("审批人："+this.name+" 主任，审批通过！");
        }else{
            if (this.nextLeader != null ) {//如果有下一个继承者
                //让下一个继承者处理请求
                this.nextLeader.handleRequest(leader);
            }
        }
    }
}
