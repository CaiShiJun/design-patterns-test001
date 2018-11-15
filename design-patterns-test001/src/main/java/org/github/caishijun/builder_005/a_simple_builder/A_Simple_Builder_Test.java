package org.github.caishijun.builder_005.a_simple_builder;

/**
 * 5、在我们客户具体使用的时候，只需要知道构建接口、组装接口和一个飞船对象，我们根本不需要知道内部怎么组装的，内部有多少零件。
 *
 * 只需要知道怎么使用组装即可。
 *
 * 结果如下：
 *
 * 万能牌发动机
 *
 * 万能牌逃逸塔
 *
 * 万能牌轨道舱
 *
 *
 *
 * 三、建造者模式应用场景：
 *
 * 如果一个对象的构建很复杂，需要很多步骤，则考虑使用建造者模式，把对象的构建和最后的组装分离开来。
 *
 * 在平常使用的类中如果后缀为builder则就是建造者模式
 *
 * StringBuilder类的apend方法
 *
 * SQL中的PreparedStatement
 *
 * JDOM中的DomBuilder、SAXBuilder
 */

public class A_Simple_Builder_Test {
    public static void main(String[] args) {

        AirShipDirector shipDirector = new FzAirShipDirector(new FzAirShipBuilder());

        AirShip airShip = shipDirector.directorAirShip();//构建对象

//      System.out.println(airShip.getEngine());
    }
}