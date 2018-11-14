package org.github.caishijun.facade_017.a_simple_facade;

public class A_Simple_Facade_Test_01 {
    public static void main(String[] args) {
        //未使用外观模式情况
        SubSystemClass s1 = new SubSystemClass();
        SubSystemClass2 s2 = new SubSystemClass2();
        SubSystemClass3 s3 = new SubSystemClass3();
        s1.methodOne();
        s2.methodTwo();
        s3.methodThree();

    }
}

class A_Simple_Facade_Test_02 {
    public static void main(String[] args) {
        //使用了外观模式后
        System.out.println("-----------------------");
        Facade facade = new Facade();
        facade.facade();
    }
}