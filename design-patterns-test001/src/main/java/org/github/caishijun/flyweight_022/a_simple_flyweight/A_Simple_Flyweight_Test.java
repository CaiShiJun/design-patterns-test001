package org.github.caishijun.flyweight_022.a_simple_flyweight;

/**
 * 三、享元模式应用场景
 *
 * 享元模式开发中应用场景：
 *
 * 比如线程池，数据库连接池，这些都利用享元模式共享了部分属性，在池中操作。
 *
 * String类的设计也是享元模式
 *
 * 优点：
 *
 * 1.极大的减少内存中对象的数量
 *
 * 2.相同或相似对象内存中只存在一份，极大的节约资源，提高系统性能
 *
 * 3.外部状态相对独立，不影响内部状态
 *
 * 缺点：
 *
 * 1.模式较复杂，使程序逻辑复杂化
 *
 * 2.为了节省内存，共享了内部状态，分离出外部状态，而读取外部状态使运行时间变长。
 */

/**
 * 测试享元模式代码：
 */
public class A_Simple_Flyweight_Test {
    public static void main(String[] args) {
        ChessFlyWeight chess1 = ChessFlyWeightFactory.getChess("黑色");//黑1
        ChessFlyWeight chess2 = ChessFlyWeightFactory.getChess("黑色");//黑2
        System.out.println(chess1==chess2);//结果为true，相同或相似对象内存中只存在一份

        //使用享元的外部状态
        chess1.display(new Coordinate(10, 10));//黑1在10,10的位置
        chess2.display(new Coordinate(20, 20));//黑2在20,20的位置

    }
}
