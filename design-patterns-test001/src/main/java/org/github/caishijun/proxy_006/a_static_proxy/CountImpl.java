package org.github.caishijun.proxy_006.a_static_proxy;

/**
 * 2：然后，定义业务实现类，实现业务逻辑接口
 */

/**
 * 委托类(包含业务逻辑)
 */
public class CountImpl implements Count {

    @Override
    public void queryCount() {
        System.out.println("查看账户...");

    }

    @Override
    public void updateCount() {
        System.out.println("修改账户...");

    }

}
