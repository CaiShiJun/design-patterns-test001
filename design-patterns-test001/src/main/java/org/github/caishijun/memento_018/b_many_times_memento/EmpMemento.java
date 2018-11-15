package org.github.caishijun.memento_018.b_many_times_memento;

/**
 * 创建备忘录对象：备忘录就是用来备份发起人的数据，所以构造器需要提供一个发起人对象
 */

//备忘录对象
public class EmpMemento {
    //自身属性
    private String ename;
    private int age;
    private double salary;
    //构造备忘录对象时，需要传入一个需要备忘的对象（发起人）
    public EmpMemento(EmpOriginator emp) {
        this.ename = emp.getEname();
        this.age = emp.getAge();
        this.salary = emp.getSalary();
    }
    //省略3个属性的set,get方法

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
