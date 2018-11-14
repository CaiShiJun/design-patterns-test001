package org.github.caishijun.command_009.a_simple_command;

/**
 * 接下来就可以定义命令的发起者了，发起者需要持有一个命令对象。以便来发起命令。
 */

//请求者/调用者：发起执行命令请求的对象
public class Invoker {
    private Command command;//持有命令对象的引用
    public Invoker(Command command) {
        super();
        this.command = command;
    }
    public void call(){
        //请求者调用命令对象执行命令的那个execute方法
        command.execute();
    }
}
