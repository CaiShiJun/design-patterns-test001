package org.github.caishijun.builder_005.a_simple_builder;

/**
 * 2、有了以上属性后，接下来就可以将飞船中部分零件给构建出来了。为了以后构建不同种类的飞船，这里使用接口来定义构建。有什么类型的飞船就用什么
 *
 * 类来实现该接口。
 */

/**
 * 构建接口:用来构建AirShipz中组件的接口
 */
public interface AirShipBuilder {
    Engine builderEngine();//构建发动机
    OrbitalModule builderOrbitalModule();//构建轨道舱
    EscapeTower builderEscapeTower();//构建逃逸塔
}
