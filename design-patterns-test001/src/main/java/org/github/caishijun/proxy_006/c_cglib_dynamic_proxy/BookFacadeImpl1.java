package org.github.caishijun.proxy_006.c_cglib_dynamic_proxy;

/**
 * 三：动态代理的第二种实现——CGlib
 *
 *        cglib是针对类来实现代理的，原理是对指定的业务类生成一个子类，并覆盖其中业务方法实现代理。因为采用的是继承，所以不能对final修饰的类进行代理。
 *
 *        1：首先定义业务类，无需实现接口（当然，实现接口也可以，不影响的）
 */
public class BookFacadeImpl1 {
    public void addBook() {
        System.out.println("新增图书...");
    }
}
