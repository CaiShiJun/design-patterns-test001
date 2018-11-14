package org.github.caishijun.observer_016.a_custom_observer;

/**
 * 具体的观察者：相当于具体的游戏玩家
 */

//具体的观察者
public class ConcreteObserver implements Observer{
    private int state;//state对象需要和subject中的state保持一致
    @Override
    public void upadte(Subject subject) {
        //当目标对象（主题对象）状态发生改变时，观察者也发生改变。
        this.state = ((ConcreteSubject)subject).getState();
    }
    public int getState() {
        return state;
    }
    public void setState(int state) {
        this.state = state;
    }
}
