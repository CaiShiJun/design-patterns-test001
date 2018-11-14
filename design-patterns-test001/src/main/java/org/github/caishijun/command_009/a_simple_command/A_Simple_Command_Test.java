package org.github.caishijun.command_009.a_simple_command;

/**
 * 三、应用场景
 *
 * Struts2中action中的调用过程中存在命令模式
 *
 * 数据库中的事务机制的底层实现
 *
 * 命令的撤销和恢复：增加相应的撤销和恢复命令的方法（比如数据库中的事务回滚）
 *
 */

//客户端测试：客户端
public class A_Simple_Command_Test {
    public static void main(String[] args) {
        //通过请求者（invoker）调用命令对象（command），命令对象中调用了命令具体执行者（Receiver）
        Command command = new ConcreteCommand(new Receiver());
        Invoker invoker = new Invoker(command);
        invoker.call();
    }
}
