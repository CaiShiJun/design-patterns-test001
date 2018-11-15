package org.github.caishijun.memento_018.b_many_times_memento;


/**
 * 一、备忘录模式介绍
 *
 * 备忘录模式：在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。这样以后就可将该对象恢复到原先保存的状态。
 *
 * 例如：
 *
 * 1.office重新打开时的恢复功能。
 *
 * 2.事务的回滚操作
 *
 * 备忘录模式UML图：
 *
 *
 *
 * Originator（发起人）：负责创建一个备忘录Memento，用以记录当前时刻它的内部状态，并可使用备忘录恢复内部状态。
 *
 * Originator可根据需要决定Memento存储Originator的哪些内部状态
 *
 * Memento（备忘录）：负责存储Originator对象的内部状态，并可防止Originator以外的其他对象访问备忘录Memento。
 *
 * 备忘录有两个接口，Caretaker只能看到备忘录的窄接口，它只能将备忘录传递给其他对象。Originator能够看到一个宽接口，允许它访问返回到
 *
 * 先前状态所需的所有数据。
 *
 * Caretaker（管理者）：负责保存好备忘录Memento，不能对备忘录的内存进行操作或检查。
 *
 * 来源网址：https://www.cnblogs.com/meet/p/5116407.html
 *
 * 二、备忘录模式代码实现
 *
 * 以一个Emp实体对象来作为例子
 *
 * 首先，创建一个发起人：发起人内部保存着需要备忘的属性，它负责创建一个备忘录Memento，用以记录当前时刻它的内部状态，并可使用备忘录恢复内部状态。
 */


//发起人：发起人内部有自身的内部状态，并且发起人可以创建备忘录和恢复备忘录
public class EmpOriginator {
    //需要备份的自身属性
    private String ename;
    private int age;
    private double salary;
    //备份
    public EmpMemento memento(){
        return new EmpMemento(this);//将当前自身对象备份
    }
    //恢复
    public void recovery(EmpMemento emp){
        this.ename = emp.getEname();
        this.age = emp.getAge();
        this.salary = emp.getSalary();
    }
    //省略get，set和带参构造器
    public EmpOriginator(String ename, int age, double salary) {
        this.ename = ename;
        this.age = age;
        this.salary = salary;
    }

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
