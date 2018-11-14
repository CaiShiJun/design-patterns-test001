package org.github.caishijun.decorator_011.a_simple_decorator;

/**
 * 开始实现具体的装饰对象ConcreteDecorator：
 */
//ConcreteDecorator：就是具体的装饰对象
class FlayCar extends SuperCar {
    public FlayCar(ICar car) {
        super(car);
    }
    //这里就是新增的功能
    public void flay(){
        System.out.println("---天上飞");
    }
    @Override
    public void move() {
        super.move();
        flay();//在原有移动的基础上，装饰了一个fly的功能
    }
}
//ConcreteDecorator：就是具体的装饰对象
class WaterCar extends SuperCar {
    public WaterCar(ICar car) {
        super(car);
    }
    //这里就是新增的功能
    public void swim(){
        System.out.println("---水里游");
    }
    @Override
    public void move() {
        super.move();
        swim();//在原有移动的基础上，装饰了一个swim的功能
    }
}
