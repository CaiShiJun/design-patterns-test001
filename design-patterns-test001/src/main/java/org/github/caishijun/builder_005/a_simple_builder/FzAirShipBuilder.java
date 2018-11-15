package org.github.caishijun.builder_005.a_simple_builder;


/**
 * 4、开始真正的实现飞船的构建和飞船的组装
 *
 * 4.1、 飞船的构建的实现
 */

/**
 * 具体飞船的构造
 */
public class FzAirShipBuilder implements AirShipBuilder{
    @Override
    public Engine builderEngine() {
        System.out.println("万能牌发动机");
        return new Engine("万能牌发动机");
    }
    @Override
    public OrbitalModule builderOrbitalModule() {
        System.out.println("万能牌轨道舱");
        return new OrbitalModule("万能牌轨道舱");
    }
    @Override
    public EscapeTower builderEscapeTower() {
        System.out.println("万能牌逃逸塔");
        return new EscapeTower("万能牌逃逸塔");
    }
}
