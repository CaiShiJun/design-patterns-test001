package org.github.caishijun.singleton_001.f_deciphering_by_reflection_singleton;

/**
 * 三、如何破解单例模式？
 *
 * a、通过反射破解（不包括枚举，因为枚举本身是单例，是由JVM管理的）
 *
 * b、通过反序列化
 *
 * 1、通过反射破解单例实例代码
 *
 * 如何防止反射破解单例模式呢？
 *
 * 在Singleton6构造的时候，假如不是第一次就直接抛出异常。不让创建。这样第二次构建的话就直接抛出异常了。
 *
 * private Singleton6(){
 *     if (instance != null) {
 *         //如果不是第一次构建，则直接抛出异常。不让创建
 *         throw new RuntimeException();
 *     }
 * }
 */

import java.lang.reflect.Constructor;

/**
 * 通过反射破解单例模式
 */
public class F_Deciphering_By_Reflection_Singleton_Test {
    public static void main(String[] args) throws Exception {
        Singleton6 s1 = Singleton6.getInstance();
        Singleton6 s2 = Singleton6.getInstance();
        System.out.println(s1 == s2);//true

        //通过反射破解
        Class<Singleton6> clazz = (Class<Singleton6>) Class.forName(Singleton6.class.getName());
        Constructor<Singleton6> c = clazz.getDeclaredConstructor(null);//获得无参构造器
        c.setAccessible(true);//跳过检查：可以访问private构造器
        Singleton6 s3 = c.newInstance();//此时会报错：没有权限访问私有构造器
        Singleton6 s4 = c.newInstance();
        System.out.println(s3==s4);//不加c.setAccessible(true)则会报错。此时的结果就是false，获得的就是两个对象
    }
}
