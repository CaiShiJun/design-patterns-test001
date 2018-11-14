package org.github.caishijun.decorator_011.a_simple_decorator;

/**
 * 定义一个具体真实的对象ConcreteComponent：这里是Car，就是具体的汽车，未装饰的汽车
 */
//ConcreteComponent：具体的对象
class Car implements ICar{
    @Override
    public void move() {
        System.out.println("汽车移动");
    }
}
