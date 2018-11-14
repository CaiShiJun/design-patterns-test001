package org.github.caishijun.bridge_023.a_simple_bridge;

/**
 * 控制台结果：
 *
 *     联想
 *
 *     笔记本
 *
 * 在这里，如果想增加一个电脑类型（Pad）或者想增加一个品牌（apple），都很简单。只需继承类型维度（Computer）或者实现维度接口（Brand）即可。
 *
 * 变化某一个维度，则不会影响到其他实现。
 *
 *
 *
 * 三、桥接模式实际开发中应用场景
 *
 * JDBC驱动程序
 *
 * AWT中的Pear架构
 *
 * 银行日志管理：
 *
 *         格式分类：操作日志，交易日志，异常日志
 *
 *         距离分类：本地记录日志，异地记录日志
 *
 * 人力资源系统中的奖金计算模块：
 *
 *         奖金分类：个人奖金，团体奖金，项目奖金，激励奖金
 *
 *         部门分类：人事部，销售部，研发部
 *
 * OA系统中的消息处理：
 *
 *         业务类型：普通消息，加急消息，特急消息
 *
 *         ​发送消息方式：系统内消息，手机短信，邮件
 */

public class A_Simple_Bridge_Test {
    public static void main(String[] args) {
        //销售联想的笔记本
        Computer c = new Laptop(new Lenovo());
        c.sale();
    }
}
