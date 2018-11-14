package org.github.caishijun.state_020.a_simple_state;

/**
 * 然后定义几个具体的状态
 */

//具体状态：空闲
public class FreeState implements State{
    @Override
    public void handler() {
        System.out.println("房间空闲中，可以预定！");
    }
}
//具体状态：已预定
class BookedState implements State{
    @Override
    public void handler() {
        System.out.println("房间已被预定！");
    }
}
//具体状态：已入住
class CheckedInState implements State{
    @Override
    public void handler() {
        System.out.println("房间已入住！");
    }
}
