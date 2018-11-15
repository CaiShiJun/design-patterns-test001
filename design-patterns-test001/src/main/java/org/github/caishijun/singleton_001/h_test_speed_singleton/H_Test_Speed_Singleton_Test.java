package org.github.caishijun.singleton_001.h_test_speed_singleton;

import org.github.caishijun.singleton_001.a_slacker_singleton.Singleton1;
import org.github.caishijun.singleton_001.b_hungry_singleton.Singleton2;
import org.github.caishijun.singleton_001.c_double_check_singleton.Singleton3;
import org.github.caishijun.singleton_001.d_static_inner_class_singleton.Singleton4;
import org.github.caishijun.singleton_001.e_enum_singleton.Singleton5;

import java.util.concurrent.CountDownLatch;


/**
 * 测试几种单例的速度
 *
 * 四、总结
 *
 * 如何选用？
 *
 *         枚举式  好于  饿汉式
 *
 *         静态内部类式  好于 懒汉式
 *
 * 常见应用场景
 *
 *         ​windows的任务管理器
 *
 *         网站的计数器
 *
 *         数据库的连接池
 *
 *         Application容器也是单例
 *
 *         Spring中每个bean默认也是单例
 *
 *         Servlet中，每个servlet也是单例
 */

/**
 * 测试几种单例模式的速度
 */
public class H_Test_Speed_Singleton_Test {

    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        int threadNum = 10;//10个线程
        final CountDownLatch countDownLatch = new CountDownLatch(threadNum);

        for (int i = 0; i < threadNum; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 100000; i++) {
                        //Object o = Singleton1.getInstanceSyncMethod();
                        //Object o = Singleton1.getInstanceSyncBlock();
                        //Object o = Singleton2.getInstance();
                        //Object o = Singleton3.getInstance();
                        //Object o = Singleton4.getInstance();
                        //Object o = Singleton5.INSTANCE;
                    }
                    countDownLatch.countDown();//计数器-1
                }
            }).start();
        }

        countDownLatch.await();//main线程阻塞
        long end = System.currentTimeMillis();
        System.out.println("耗时："+(end-start));

        /**
         * 结果（毫秒）:
         * Singleton1（饿汉式）耗时：5
         * Singleton2（懒汉式）耗时：227
         * Singleton3（双重检索式）耗时：7
         * Singleton4（静态内部类式）耗时：40
         * Singleton5（枚举式）耗时：5
         */
    }
}
