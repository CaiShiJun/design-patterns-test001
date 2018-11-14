package org.github.caishijun.command_009.a_simple_command;

/**
 * 然后定义抽象命令和抽象命令的具体实现，具体命令类中需要持有真正执行命令的那个对象。
 */

//抽象命令类：抽象的命令，可以根据不同类型的命令写出不同的实现
public interface Command {
    //调用命令
    void execute();
}
//具体命令类
class ConcreteCommand implements Command{
    private Receiver receiver;//持有真正执行命令对象的引用
    public ConcreteCommand(Receiver receiver) {
        super();
        this.receiver = receiver;
    }
    @Override
    public void execute() {
        //调用接收者执行命令的方法
        receiver.action();
    }
}