package org.github.caishijun.proxy_006.b_jdk_dynamic_proxy;

/**
 * 2：然后，实现业务逻辑接口创建业务实现类
 */
public class BookFacadeImpl implements BookFacade {
    @Override
    public void addBook() {
        System.out.println("增加图书方法。。。");
    }

}