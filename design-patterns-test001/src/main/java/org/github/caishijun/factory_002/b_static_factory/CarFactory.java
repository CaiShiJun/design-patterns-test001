package org.github.caishijun.factory_002.b_static_factory;

/**
 * 1、简单工厂模式：虽然能通过工厂来创建对象，但是违反了开闭原则。一旦增加功能需要在原有基础上修改代码。
 *
 * 使用了简单工厂模式后：可以创建一个工厂类，该类中提供一个创建汽车的工厂（方法）
 */

//汽车工厂
public class CarFactory {
    /**
     * 创建汽车
     * @param type
     * @return
     */
    public static Car createCar(String type){
        //该方法还会有问题，假如以后有很多汽车都需要工厂来创建。则又得修改源代码，违反了OCP开闭原则
        if ("audi".equals(type)) {
            return new Audi();
        }else if ("byd".equals(type)) {
            return new Byd();
        }else{
            return null;
        }
    }
}
//测试简单工厂方法
class TestSimpleFactoryCar {//调用者
    public static void main(String[] args) {
        //创建汽车
        Car audi = CarFactory.createCar("audi");//创建者
        Car byd = CarFactory.createCar("byd");
        audi.run();
        byd.run();
    }
}
