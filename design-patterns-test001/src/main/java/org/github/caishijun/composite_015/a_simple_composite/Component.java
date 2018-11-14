package org.github.caishijun.composite_015.a_simple_composite;

/**
 * 一、组合模式介绍
 *
 * 组合模式：将对象组合成树形结构以表示：部分--整体 的层次结构。组合模式使得用户对单个对象和组合对象的使用具有一致性。
 *
 * java中的组合是指：在A类里定义一个B类的引用，A拥有了B，叫组合。只是单纯的组合而已，而不是一种设计模式。
 *
 * 组合和组合模式不是一回事！
 *
 * 基本上见到的树形结构都使用到了组合模式。
 *
 * 组合模式结构图：
 *
 *
 *
 * 组合模式中有几个核心的部分：
 *
 * Leaf（叶子）：表示该节点下面没有其他子节点了，就称为叶子
 *
 * Compostie（容器构件）：容器构件，该节点下还有其他子节点，理解为一个容器，里面包含了其他子节点。就叫做容器构件
 *
 * Component（抽象构件）：抽象构件中定义了叶子和容器构件的共同点。比如，有公共的添加删除叶子功能，有显示节点功能。
 *
 * 例如：Windows中的文件管理
 *
 *
 * 来源网址：https://www.cnblogs.com/meet/p/5116455.html
 *
 *
 * 二、组合模式代码实现
 *
 * 首先，定义一个抽象的Component。提供一系列的公共接口
 */

//Component（抽象构件）：抽象构件中定义了叶子和容器构件的共同点。比如，有公共的添加删除叶子功能，有显示节点功能。
public abstract class Component {
    protected String name;
    public Component(String name) {
        super();
        this.name = name;
    }
    public abstract void add(Component c);
    public abstract void remove(Component c);
    public abstract void display(int depth);
}
