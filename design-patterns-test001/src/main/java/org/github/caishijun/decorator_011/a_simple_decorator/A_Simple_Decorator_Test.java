package org.github.caishijun.decorator_011.a_simple_decorator;

/**
 * 三、总结
 *
 * 装饰模式（Decorator）也叫包装器模式（Wrapper）
 *
 *         装饰模式降低系统的耦合度，可以动态的增加或删除对象的职责，并使得需要装饰的具体构建类和具体装饰类可以独立变化
 *
 * 以便增加新的具体构建类和具体装饰类。
 *
 * 优点：
 *
 *        扩展功能强，相比继承来说更灵活。继承的话会导致子类个数增加。而装饰者模式不会出现这种情况。
 *
 *        可以对一个对象进行多次装饰，创造出不同行为的组合，得到功能更加强大的对象。
 *
 *        具体构建类和具体装饰类可以独立变化，用户可以根据需要自己增加新的构件子类和具体装饰类。
 *
 * 缺点：
 *
 *         产生很多小对象，大量小对象会占据内存。一定程度上影响了性能。
 *
 *         装饰模式易于出错，调试排查比较麻烦。
 *
 * 开发中应用的场景：
 *
 *         IO中输入流和输出流
 *
 *         Swing包中图形界面构件功能
 *
 *         Servlet API中提供了一个request对象的Decorator设计模式的默认实现类HttpServletRequestWrapper,增强了request对象的功能。
 *
 *         Struts2中，request，response，session对象的处理。
 *
 * 装饰模式和桥接模式的区别：
 *
 *         两个模式都是为了解决过多子类对象的问题，桥接模式是对象自身有过多的维度，造成过多的子类。而让维度分类后在搭建一个桥梁来联系起来。
 *
 * 而装饰模式是解决在增加新功能的时候产生多个类的问题。
 */
public class A_Simple_Decorator_Test {

    public static void main(String[] args) {
        Car car = new Car();
        car.move();//这里打印未增加新功能的时候：汽车移动

        System.out.println("--------增加飞行功能-------");
        FlayCar flyCar = new FlayCar(car);//将真实对象传入装饰对象中
        flyCar.move();//这里就是增加了飞行后的装饰

        System.out.println("--------增加潜水功能-------");
        WaterCar waterCar = new WaterCar(car);//将真实对象传入装饰对象中
        waterCar.move();//这里就是增加了潜水功能后的装饰

    }
}
