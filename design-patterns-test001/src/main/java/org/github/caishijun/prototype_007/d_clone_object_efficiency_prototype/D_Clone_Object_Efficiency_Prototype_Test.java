package org.github.caishijun.prototype_007.d_clone_object_efficiency_prototype;

/**
 * 三、测试克隆对象的效率
 *
 * 测试clone对象的效率
 *
 * 最后结果为：
 *
 * new 对象耗时：10063
 *
 * clone 对象耗时：10
 *
 * 四、使用场景
 *
 * 原型模式适用场景：如果某个对象new的过程中很耗时，则可以考虑使用原型模式。
 *
 * Spring框架中bean对象的创建就两种模式：单例模式或者原型模式
 */
public class D_Clone_Object_Efficiency_Prototype_Test {
}

class TestClone {
    //new 对象
    public static void testNew(int size){
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            Laptop l = new Laptop();
        }
        long end = System.currentTimeMillis();
        System.out.println("new 对象耗时："+(end-start));
    }
    //clone 对象
    public static void testClone(int size){
        long start = System.currentTimeMillis();
        Laptop l = new Laptop();
        for (int i = 0; i < size; i++) {
            try {
                Laptop temp = (Laptop) l.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("clone 对象耗时："+(end-start));
    }
    public static void main(String[] args) {
        testNew(1000);
        testClone(1000);
    }
}

class Laptop implements Cloneable{
    public Laptop() {
        //模拟创建Laptop对象的时候比较耗时
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}