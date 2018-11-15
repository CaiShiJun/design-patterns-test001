package org.github.caishijun.builder_005.a_simple_builder;

/**
 * 3、把这些零件构建完成后，就需要把构建好的这些组件构建成一个完整的飞船（AirShip）了。使用接口来定义，不同类型的飞船组装可以用不同的具体实现。
 */

/**
 * 组装接口:用于将飞船组件组装起来
 */
public interface AirShipDirector {
    /**
     * 组装飞船
     * @return
     */
    AirShip directorAirShip();
}
