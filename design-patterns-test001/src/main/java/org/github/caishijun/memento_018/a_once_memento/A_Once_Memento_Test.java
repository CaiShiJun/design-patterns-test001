package org.github.caishijun.memento_018.a_once_memento;

/**
 * 单次备份测试：测试只能备份一次的备忘录
 *
 * 测试结果如下：
 *
 *                 第一次：张三---20---4000.0
 *
 *                 修改后：李四---30---50000.0
 *
 *                 恢复后：张三---20---4000.0
 *
 * 但是，这样的效果是只能备份一次。有时候我们需要备份多个点，根据需要来还原具体哪次的数据
 */

public class A_Once_Memento_Test {
    public static void main(String[] args) {
        CareTaker taker = new CareTaker();//构建一个备忘录管理者
        //构建发起人
        EmpOriginator emp = new EmpOriginator("张三", 20, 4000);
        System.out.println("第一次："+emp.getEname()+"---"+emp.getAge()+"---"+emp.getSalary());
        //备份
        taker.setEmpMemento(emp.memento());

        //备份完了后再修改
        emp.setEname("李四");
        emp.setAge(30);
        emp.setSalary(50000);
        //然后再次打印
        System.out.println("修改后："+emp.getEname()+"---"+emp.getAge()+"---"+emp.getSalary());

        //开始恢复
        emp.recovery(taker.getEmpMemento());
        System.out.println("恢复后："+emp.getEname()+"---"+emp.getAge()+"---"+emp.getSalary());
    }
}
