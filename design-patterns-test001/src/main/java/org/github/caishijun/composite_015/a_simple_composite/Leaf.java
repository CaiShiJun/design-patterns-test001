package org.github.caishijun.composite_015.a_simple_composite;

/**
 * 然后定义具体的叶子节点，和容器节点
 *
 * 定义叶子节点，由于叶子节点中没有子节点了，所以不需要add和remove的具体实现
 */

//表示该节点下面没有其他子节点了，就称为叶子
public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }
    @Override
    public void add(Component c) {
        System.out.println("leaf no add");
    }
    @Override
    public void remove(Component c) {
        System.out.println("leaf no remove");
    }
    @Override
    public void display(int depth) {
        StringBuffer sb = new StringBuffer("-");
        for (int i = 0; i <= depth; i++) {
            sb.append("-");
        }
        System.out.println(sb.toString()+name);
    }
}