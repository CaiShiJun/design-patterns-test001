package org.github.caishijun.composite_015.a_simple_composite;

/**
 * 三、总结
 *
 * 开发中应用场景：
 *
 * 操作系统中的资源管理器
 *
 * GUI中的容器层次图
 *
 * XML文件解析
 *
 * OA系统中，组织结构的处理
 *
 * Junit单元测试框架
 */

/**
 * 最后客户端测试代码：添加一个树形结构
 */
public class A_Simple_Composite_Test {
    public static void main(String[] args) {
        Composite root = new Composite("root");
        root.add(new Leaf("Leaf A"));
        root.add(new Leaf("Leaf B"));

        Composite comp = new Composite("Composite X");
        comp.add(new Leaf("Leaf XA"));
        comp.add(new Leaf("Leaf XB"));
        root.add(comp);

        Composite comp2 = new Composite("Composite XY");
        comp2.add(new Leaf("Leaf XYA"));
        comp2.add(new Leaf("Leaf XYB"));
        comp.add(comp2);

        root.add(new Leaf("Leaf C"));
        Leaf leaf = new Leaf("Leaf D");
        root.add(leaf);
    //  root.remove(leaf);//这里可以删除某节点
        root.display(1);
    }
}
