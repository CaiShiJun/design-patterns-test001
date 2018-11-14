package org.github.caishijun.bridge_023.a_simple_bridge;

/**
 * 再定义一个电脑类型的类，为什么用类不用接口呢？因为这个类里还有持有品牌维度的引用
 */
/**
 * 电脑类型维度：这里需要使用一个类，不能用接口。因为这里还需要持有品牌（Brand）的一个引用
 */
public class Computer {
    private Brand brand;//类型维度里持有品牌维度的引用
    public void sale(){
        brand.sale();//具体某品牌的销售
    }
    public Computer(Brand brand) {
        super();
        this.brand = brand;
    }
}
class Desktop extends Computer{
    public Desktop(Brand brand) {
        super(brand);
    }
    @Override
    public void sale() {
        super.sale();
        System.out.println("台式机");
    }
}
class Laptop extends Computer{
    public Laptop(Brand brand) {
        super(brand);
    }
    @Override
    public void sale() {
        super.sale();
        System.out.println("笔记本");
    }
}
