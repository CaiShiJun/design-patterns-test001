package org.github.caishijun.factory_002.d_abstract_factory;

/**
 * 然后根据生产的不同产品，类创建具体的实现来生产汽车。例如：专门生产高端的汽车，专门生产低端的汽车。都可以用针对CarFactory具体的实现来创建。
 *
 * 高端汽车制造工厂，所有汽车的生产必须依赖汽车总工厂
 */

/**
 *  高端汽车制造工厂
 */
public class LuxuryCarFactory implements CarFactory{
    @Override
    public Engine createEngine() {
        return new LuxuryEngine();
    }
    @Override
    public Seat createSeat() {
        return new LuxurySeat();
    }
    @Override
    public Tyre createTyre() {
        return new LuxuryTyre();
    }
}