package org.github.caishijun.observer_016.b_jdk_observer;

import java.util.Observable;

/**
 * 其实java中已经帮我们写好了这两个目标对象接口和观察者接口
 *
 * java.util.Observable 这个类就相当于我们自己定义的subject类
 * java.util.Observer   接口
 * 下面，使用jdk提供的两个接口来实现一个观察者模式demo
 *
 * 定义一个具体的目标对象（原代码中的ConcreteSubject）：继承java.util.Observable类
 *
 * 来源网址：https://www.cnblogs.com/meet/p/5116411.html
 */

//具体的目标对象
public class ConcreteSubject extends Observable {
    private int state;
    public void updateState(int s){
        state = s;//目标对象发生了改变
        setChanged();//Observable类中的setChanged()方法，表示目标对象发生了更改
        notifyObservers(state);//通知所有观察者对象
    }
    public int getState() {
        return state;
    }
    public void setState(int state) {
        this.state = state;
    }
}
