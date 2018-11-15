package org.github.caishijun.factory_002.d_abstract_factory;

/**
 * 3、抽象工厂模式：抽象工厂模式用来生产不同产品族的全部产品，对于只增加产品某一部分则不适用。抽象工厂模式是工厂模式的一种升级版本。
 *
 * 在有多个业务品种，业务分类时，抽象工厂能产品不同类别的一个全部产品。例如：生产汽车，抽象工厂模式可以生产高端汽车全部配件来组成一个高端汽车，
 *
 * 低端汽车全部配件来组成要给低端的汽车，但是不能产生一个高端的发动机和一个低端的座椅来组成一个中等的汽车。这样会混乱。
 *
 *
 *
 * 代码实现：
 *
 * 首先使用一个接口来定义一个发动机，使用具体的类来定义发动机的好坏（具体实现）
 */

/**
 * 发动机接口
 */
public interface Engine {
    void run();
    void start();
}
//好的发动机
class LuxuryEngine implements Engine{
    @Override
    public void run() {
        System.out.println("好发动机转的快");
    }
    @Override
    public void start() {
        System.out.println("启动快，自动启停");
    }
}
//差的发动机
class LowEngine implements Engine{
    @Override
    public void run() {
        System.out.println("转的慢");
    }
    @Override
    public void start() {
        System.out.println("启动慢");
    }
}
