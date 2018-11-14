package org.github.caishijun.proxy_006.a_static_proxy;

/**
 *      来源网址：http://www.cnblogs.com/ygj0930/p/6542259.html
 *
 *       一：代理模式（静态代理）
 *
 *           代理模式是常用设计模式的一种，我们在软件设计时常用的代理一般是指静态代理，也就是在代码中显式指定的代理。
 *
 *           静态代理由 业务实现类、业务代理类 两部分组成。业务实现类 负责实现主要的业务方法，业务代理类负责对调用的业务方法作拦截、过滤、预处理，主要是在方法中首先进行预处理动作，然后调用业务实现类的方法，还可以规定调用后的操作。我们在需要调用业务时，不是直接通过业务实现类来调用的，而是通过业务代理类的同名方法来调用被代理类处理过的业务方法。
 *
 *           静态代理的实现：
 *
 *           1：首先定义一个接口，说明业务逻辑。
 */

/**
 * 定义一个账户接口
 */
public interface Count {
    // 查询账户
    public void queryCount();

    // 修改账户
    public void updateCount();

}