package org.github.caishijun.prototype_007.b_deep_clone_prototype;

import java.util.Date;


/**
 * 2、深克隆代码实现：克隆对象的同时，把该对象的属性也连带着克隆出新的。
 *
 * 深克隆只需要在clone方法中将该对象的属性也克隆即可
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
        //深克隆：把对象下的所有属性也克隆出来
        Sheep s = (Sheep) obj;
        s.birthday = (Date) this.birthday.clone();
        return s;
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
