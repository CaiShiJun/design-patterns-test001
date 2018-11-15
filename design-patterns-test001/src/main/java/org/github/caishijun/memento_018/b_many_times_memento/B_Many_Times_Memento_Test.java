package org.github.caishijun.memento_018.b_many_times_memento;

/**
 * 测试结果如下：
 *
 *             第一次：张三---20---4000.0
 *
 *             1修改后：李四---30---50000.0
 *
 *             2修改后：李四2---32---52000.0
 *
 *             3修改后：李四3---33---32000.0
 *
 *             恢复后：李四3---33---32000.0
 *
 * 当然，也可以恢复之后把它从栈中删除。
 *
 * 测试：恢复之前从栈中删除两个最近的数据
 *
 * //开始恢复
 * taker.getEmpForStackAndRemove();//删除最近一次的备份
 * taker.getEmpForStackAndRemove();//删除最近一次的备份
 * emp.recovery(taker.getEmpForStack());//此时获取的是原来未删除时倒数第二次的备份
 * System.out.println("恢复后："+emp.getEname()+"---"+emp.getAge()+"---"+emp.getSalary());
 * 此时的结果就是如下：可见，这里已经把2和3给删除了
 *
 *                 第一次：张三---20---4000.0
 *
 *                 1修改后：李四---30---50000.0
 *
 *                 2修改后：李四2---32---52000.0
 *
 *                 3修改后：李四3---33---32000.0
 *
 *                 恢复后：李四---30---50000.0
 *
 * 三、总结
 *
 * 开发中常见场景：
 *
 * 棋类游戏中的悔棋操作
 *
 * 软件中的撤销操作
 *
 * 数据库中的事务回滚操作
 *
 * 常用软件中的历史记录功能
 */

/**
 * 再次测试：后进先出，也就是说。恢复的话恢复的是最后一次备份的数据
 */

public class B_Many_Times_Memento_Test {
    public static void main(String[] args) {
        CareTaker taker = new CareTaker();//构建一个备忘录管理者
        //构建发起人
        EmpOriginator emp = new EmpOriginator("张三", 20, 4000);
        System.out.println("第一次："+emp.getEname()+"---"+emp.getAge()+"---"+emp.getSalary());
        //第1次备份
        taker.mementoEmp(emp.memento());

        //备份完了后再修改
        emp.setEname("李四");
        emp.setAge(30);
        emp.setSalary(50000);
        //然后再次打印
        System.out.println("1修改后："+emp.getEname()+"---"+emp.getAge()+"---"+emp.getSalary());
        //第2次备份
        taker.mementoEmp(emp.memento());

        //备份完了后再修改
        emp.setEname("李四2");
        emp.setAge(32);
        emp.setSalary(52000);
        //然后再次打印
        System.out.println("2修改后："+emp.getEname()+"---"+emp.getAge()+"---"+emp.getSalary());
        //第3次备份
        taker.mementoEmp(emp.memento());

        //备份完了后再修改
        emp.setEname("李四3");
        emp.setAge(33);
        emp.setSalary(32000);
        //然后再次打印
        System.out.println("3修改后："+emp.getEname()+"---"+emp.getAge()+"---"+emp.getSalary());
        //第4次备份
        taker.mementoEmp(emp.memento());

        //开始恢复
        emp.recovery(taker.getEmpForStack());//恢复的是第4次备份的数据（3修改后）
        System.out.println("恢复后："+emp.getEname()+"---"+emp.getAge()+"---"+emp.getSalary());

        //开始恢复
        taker.getEmpForStackAndRemove();//删除最近一次的备份
        taker.getEmpForStackAndRemove();//删除最近一次的备份
        emp.recovery(taker.getEmpForStack());//此时获取的是原来未删除时倒数第二次的备份
        System.out.println("恢复后："+emp.getEname()+"---"+emp.getAge()+"---"+emp.getSalary());
    }
}
