package org.github.caishijun.observer_016.a_custom_observer;

public class A_Custom_Observer_Test {
    public static void main(String[] args) {
        //构建目标对象（主题对象）
        ConcreteSubject subject = new ConcreteSubject();
        //具体的观察者
        ConcreteObserver c1 = new ConcreteObserver();
        ConcreteObserver c2 = new ConcreteObserver();
        ConcreteObserver c3 = new ConcreteObserver();
        c1.setState(10);//设置观察者1的状态为10
        c2.setState(20);//设置观察者2的状态为20
        c3.setState(30);//设置观察者3的状态为30
        //将三个观察者假如到观察者队列中
        subject.registerObserver(c1);
        subject.registerObserver(c2);
        subject.registerObserver(c3);
        //查看未修改时的状态
        System.out.println(c1.getState());
        System.out.println(c2.getState());
        System.out.println(c3.getState());

        System.out.println("-------------修改后的状态-------------");
        //改变目标对象的状态
        subject.setState(1000);
        //查看观察者对象的状态
        System.out.println(c1.getState());
        System.out.println(c2.getState());
        System.out.println(c3.getState());
    }
}
