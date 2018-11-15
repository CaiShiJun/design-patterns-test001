package org.github.caishijun.prototype_007.a_shallow_clone_prototype;

import java.util.Date;

/**
 *一、原型模式介绍
 *
 * 原型模式：原型模式就是从一个对象再创建另外一个可定制的对象，而且不需要知道任何创建的细节。
 *
 * 所谓原型模式，就是java中的克隆技术，以某个对象为原型。复制出新的对象。显然新的对象具备原型对象的特点。效率高（避免了重新执行构造过程步骤）
 *
 * 克隆类似于new，但和new不同。new创建新的对象属性采用的是默认值。克隆出来的对象的属性值完全和原型对象相同。并且克隆出的新对象不会影响原型对象，克隆后。还可以再修改克隆对象的值。
 *
 * 要实现原型模式，必须实现Cloneable接口，而这个接口里面是空的。
 *
 * Cloneable接口是一个空接口，使用Cloneable接口都不用导入包。而clone方法是属于Object对象的。如果要克隆某个对象的话必须实现Cloneable接口
 *
 * @author  unascribed
 * @see     java.lang.CloneNotSupportedException
 * @see     java.lang.Object#clone()
 * @since   JDK1.0
 * public interface Cloneable {
 * }
 *
 * 重写Object对象的clone方法，clone方法为本地方法。效率比较高
 *
 * protected native Object clone() throws CloneNotSupportedException;
 * 如果我们要克隆某个对象有浅克隆和深克隆
 *
 * 浅克隆：copy该对象，然后保留该对象原有的引用。也就是说不克隆该对象的属性。
 *
 * 深克隆：copy该对象，并且把该对象的所有属性也克隆出一份新的。
 *
 *
 * 来源网址：https://www.cnblogs.com/meet/p/5116404.html
 *
 * 二、代码实现
 *
 * 1、浅克隆代码实现：
 *
 */


/**
 * 原型模式:浅克隆
 * Cloneable是一个空接口（标记接口），是一个规范。但是如果要克隆这个类对象的话必须实现Cloneable接口
 */
public class Sheep implements Cloneable{
    private String sname;
    private Date birthday;

    /**
     * 重写Object对象的clone方法
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        //直接调用Object对象的clone方法
        Object obj = super.clone();
        return obj;
    }
    //省略get，set方法和构造方法
    public Sheep(String sname, Date birthday) {
        this.sname = sname;
        this.birthday = birthday;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
