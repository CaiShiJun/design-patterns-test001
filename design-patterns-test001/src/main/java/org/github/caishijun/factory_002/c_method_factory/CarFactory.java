package org.github.caishijun.factory_002.c_method_factory;

/**
 * 2、工厂方法模式：将工厂类调整为工厂接口，需要什么类型的工厂就使用该类实现该工厂，创建相应的产品。
 */

//工厂接口
public interface CarFactory {
    //创建汽车方法
    Car createCar();
}

//创建比亚迪汽车的工厂
class BydFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new Byd();
    }
}

//创建奥迪的工厂
class AudiFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Audi();
    }
}

//测试工厂方法
class TestFactoryMethod {
    public static void main(String[] args) {
        /**
         * 工厂方法模式好处在于，以后如果再增加一辆车。只需再实现CarFactory接口即可。避免了OCP开闭原则
         * 不用在原来的代码上修改，只需新增类即可。
         * 例如:增加一辆奔驰，增加一个奔驰工厂BenzFactory即可。更好扩展
         */
        Car audi = new AudiFactory().createCar();
        Car byd = new BydFactory().createCar();
        audi.run();
        byd.run();
    }
}