package org.github.caishijun.factory_002.d_abstract_factory;

/**
 * 定义一个汽车总工厂，用来生产各种类型的汽车。所有的汽车都需要依赖此工厂来生产汽车。
 */

/**
 *  汽车总工厂，可以创建轮胎，座椅，发动机
 */
public interface CarFactory {
    Engine createEngine();//创建发动机
    Seat createSeat();//创建座椅
    Tyre createTyre();//创建轮胎
}
