package org.github.caishijun.memento_018.a_once_memento;

/**
 * 开始创建一个备忘录的管理者
 */

//管理者：管理备忘录对象
public class CareTaker {
    //需要管理的备忘录对象，这里也可以使用一个list容器来存储。这样可以备份多个点
    private EmpMemento empMemento;
    public EmpMemento getEmpMemento() {
        return empMemento;
    }
    public void setEmpMemento(EmpMemento empMemento) {
        this.empMemento = empMemento;
    }
}

