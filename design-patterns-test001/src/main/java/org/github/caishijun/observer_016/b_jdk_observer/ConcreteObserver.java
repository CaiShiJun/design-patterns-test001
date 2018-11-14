package org.github.caishijun.observer_016.b_jdk_observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 定义具体的观察者：实现java.util.Observer接口
 */

//具体的观察者
public class ConcreteObserver implements Observer {
    private int state;//具体观察者中的状态和目标对象的状态保持一致
    @Override
    public void update(Observable o, Object arg) {
        state = ((ConcreteSubject)o).getState();
    }
    public int getState() {
        return state;
    }
    public void setState(int state) {
        this.state = state;
    }
}
