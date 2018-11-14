package org.github.caishijun.iterator_014.a_simple_iterator;


/**
 * 一、迭代器模式介绍
 *
 * 迭代器模式：提供一种方法顺序的访问一个聚合对象中各个元素，而又不暴露该对象的内部表示。
 *
 * 一般情况，我们自己开发时很少自定义迭代器，因为java本身已经把迭代器做到内部中了（比如：常用的list和set中都内置了迭代器）。
 *
 * 当然，如果真有这种需求需要我们自定义迭代器的话，可以参考jdk的迭代器实现方式来实现自己的迭代器。
 *
 * 迭代器是可以从前往后，或者从后往前遍历的。
 *
 * 为遍历不同聚集结构提供如：开始，下一个，是否有下一个，是否结束，当前哪一个等等的一个统一接口。
 *
 * 迭代器模式UML图：
 *
 *
 *
 * 聚集类：Aggregate(抽象类)和ConcreteAggregate(具体聚集类)表示聚集类，是用来存储迭代器的数据。
 *
 * 在Aggregate(抽象类)中有一个CreateIterator方法，用来获取迭代器
 *
 * 迭代器：迭代器用来为聚集类提供服务，提供了一系列访问聚集类对象元素的方法。
 *
 * 来源网址：https://www.cnblogs.com/meet/p/5116437.html
 *
 * 二、模拟迭代器的实现
 *
 * 首先定义一个迭代器的抽象，这里使用接口定义
 */

//迭代器接口
public interface MyIterator {
    void first();//将游标指向第一个元素
    void next();//将游标指向下一个元素
    boolean hasNext();//判断是否有下一个元素

    boolean isFirst();//判断是否是第一个元素
    boolean isLast();//判断是否是最后一个元素
    Object getCurrentObj();//获取当前对象
}
