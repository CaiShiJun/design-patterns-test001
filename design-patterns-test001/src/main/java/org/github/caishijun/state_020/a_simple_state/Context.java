package org.github.caishijun.state_020.a_simple_state;

/**
 * 开始定义重要的部分，Context上下文。这个对象中定义了当前状态
 */

//上下文对象：用来引用一个State的实例，维护各个状态
public class Context {
    private State state;//当前状态
    public void request(State s){
        System.out.print("修改状态：");
        this.state = s;
        state.handler();
    }
}