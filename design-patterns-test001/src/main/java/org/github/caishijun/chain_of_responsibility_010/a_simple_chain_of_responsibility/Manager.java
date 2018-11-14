package org.github.caishijun.chain_of_responsibility_010.a_simple_chain_of_responsibility;

/**
 * 经理对象：处理大于3天，小于等于10天的假期
 */
//经理
public class Manager extends Leader {
    public Manager(String name) {
        super(name);
    }
    /**
     * 责任链上对象对请求的具体处理
     */
    @Override
    public void handleRequest(LeaveRequest leader) {
        if (leader.getLeaveDays()<=10) {
            System.out.println("请假人："+leader.getEmpName()+",天数："+leader.getLeaveDays()+",理由："+leader.getReason());
            System.out.println("审批人："+this.name+" 经理，审批通过！");
        }else{
            if (this.nextLeader != null ) {//如果有下一个继承者
                //让下一个继承者处理请求
                this.nextLeader.handleRequest(leader);
            }
        }
    }
}
