package org.github.caishijun.factory_002.d_abstract_factory;

/**
 * 低端汽车制造工厂，所有汽车的生产必须依赖汽车总工厂
 */

/**
 *  低端汽车制造工厂
 */
public class LowCarFactory implements CarFactory{
    @Override
    public Engine createEngine() {
        return new LowEngine();
    }
    @Override
    public Seat createSeat() {
        return new LowSeat();
    }
    @Override
    public Tyre createTyre() {
        return new LowTyre();
    }
}
