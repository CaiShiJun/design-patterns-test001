package org.github.caishijun.state_020.a_simple_state;

/**
 * 在上面的例子中，如果不用状态模式，想要改变房间状态的话。则需要大量条件分支判断
 *
 * 三、总结
 *
 * 开发中场景：
 *
 *         银行系统中账号状态的管理
 *
 *         OA系统中公文状态的管理
 *
 *         酒店系统中，房间状态的管理
 *
 *         线程对象各状态之间的切换
 *
 * 状态模式的好处：
 *
 * 1、可以将不同状态的不同行为分割开来，将相关的行为进行局部化。以便更改局部状态
 *
 * 2、消除了庞大的条件分支语句。
 *
 * 什么时候使用状态模式呢？
 *
 * 当一个对象的行为取决于它的状态，并且它必须在运行时刻根据状态改变它的行为时，就可以考虑使用状态模式了。
 */

public class A_Simple_State_Test {
    public static void main(String[] args) {
        Context context = new Context();
        context.request(new FreeState());//空闲状态
        context.request(new BookedState());//预定状态
        context.request(new CheckedInState());//已入住
    }
}