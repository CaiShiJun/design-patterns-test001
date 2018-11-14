package org.github.caishijun.proxy_006.c_cglib_dynamic_proxy;

/**
 * 3：创建业务类和代理类对象，然后通过  代理类对象.getInstance(业务类对象)  返回一个动态代理类对象（它是业务类的子类，可以用业务类引用指向它）。最后通过动态代理类对象进行方法调用。
 */

/**
 * 四：比较
 *
 *     静态代理是通过在代码中显式定义一个业务实现类一个代理，在代理类中对同名的业务方法进行包装，用户通过代理类调用被包装过的业务方法；
 *
 *     JDK动态代理是通过接口中的方法名，在动态生成的代理类中调用业务实现类的同名方法；
 *
 *     CGlib动态代理是通过继承业务类，生成的动态代理类是业务类的子类，通过重写业务方法进行代理；
 */
public class CCglibDynamicProxyTest {
    public static void main(String[] args) {
        BookFacadeImpl1 bookFacade=new BookFacadeImpl1();
        BookFacadeCglib  cglib=new BookFacadeCglib();
        BookFacadeImpl1 bookCglib=(BookFacadeImpl1)cglib.getInstance(bookFacade);
        bookCglib.addBook();
    }
}
