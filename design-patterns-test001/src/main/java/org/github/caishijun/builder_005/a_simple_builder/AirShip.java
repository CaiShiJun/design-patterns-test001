package org.github.caishijun.builder_005.a_simple_builder;

/**
 * 一、建造者模式介绍
 *
 * 建造者模式：将一个复杂的构建与其表示相分离，使得同样的构建过程可以创建不同的表示。 [构建与表示分离，同构建不同表示]
 *
 * 假如一个对象的构建很复杂，需要很多步骤。则可以使用建造者模式，将其构建对象和组装成一个对象这两步给分开来。构建部分为（builder）和组织部分（director），实现了构建和装配的解耦。
 *
 * 不同的构建器，相同的装配也可以做出不同的对象。
 *
 * 相同的构建器，不同的装配顺序也可以做出不同的对象。
 *
 * 例如：现在要生产一个汽车，会有很多零件，有了零件还需要把这些零件组装成一个完整的汽车。建造者模式就是将构建零件（builder）和组装零件（director）两个操作给分开。
 *
 * 与抽象工厂的区别：在建造者模式里，有个指导者，由指导者来管理建造者，用户是与指导者联系的，指导者联系建造者最后得到产品。即建造模式可以强制实行一种分步骤进行的建造过程。
 *
 * 来源网址：https://www.cnblogs.com/meet/p/5116401.html
 *
 * 二、代码实现
 *
 * 代码的具体实现：宇宙飞船的实现
 *
 * 1、假如现在要构建一个宇宙飞船对象，先定义一个宇宙飞船对象，有一些简单的属性。
 */

/**
 * 宇宙飞船
 */
public class AirShip {
    private OrbitalModule orbitalModule;//轨道舱
    private Engine engine;//发动机
    private EscapeTower escapeTower;//逃逸塔
    //省略get，set，构造器
    public AirShip() {
    }
    public AirShip(OrbitalModule orbitalModule, Engine engine, EscapeTower escapeTower) {
        this.orbitalModule = orbitalModule;
        this.engine = engine;
        this.escapeTower = escapeTower;
    }

    public OrbitalModule getOrbitalModule() {
        return orbitalModule;
    }

    public void setOrbitalModule(OrbitalModule orbitalModule) {
        this.orbitalModule = orbitalModule;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public EscapeTower getEscapeTower() {
        return escapeTower;
    }

    public void setEscapeTower(EscapeTower escapeTower) {
        this.escapeTower = escapeTower;
    }
}
//轨道舱
class OrbitalModule{
    private String name;
    //省略get，set，构造器
    public OrbitalModule(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
//发动机
class Engine{
    private String name;
    //省略get，set，构造器
    public Engine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
//逃逸塔
class EscapeTower{
    private String name;
    //省略get，set，构造器
    public EscapeTower(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}