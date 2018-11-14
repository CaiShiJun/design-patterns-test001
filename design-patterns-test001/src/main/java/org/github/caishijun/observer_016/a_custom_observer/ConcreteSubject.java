package org.github.caishijun.observer_016.a_custom_observer;

/**
 * 开始定义具体的主题对象：
 */

//具体的主题对象
public class ConcreteSubject extends Subject {
    private int state;//默认状态为0
    public int getState() {
        return state;
    }
    public void setState(int state) {
        this.state = state;
        //当修改了主题对象状态时，通知所有观察者
        this.notifyAllObserver();//通知所有观察者
    }
}
