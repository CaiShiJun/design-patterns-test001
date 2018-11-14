package org.github.caishijun.adapter_013.b_object_adapter;

/**
 * 2.2 对象适配器
 *
 * 由于类适配器中只能继承一个被需要适配的对象，则不推荐使用。
 *
 * 要使用对象适配器，只需要使用组合即可。修改适配器实现代码
 *
 * 来源网址：https://www.cnblogs.com/meet/p/5116467.html
 */

/**
 * 三、总结
 *
 * 适配器模式应用场景：
 *
 * java.io.InputStreamReader(InputStream)
 *
 * java.io.OutputStreamWriter(OutputStream)
 */

/**
 * 测试对象适配器模式
 */
public class Client {
    //说话
    public void test1(Target t){
        t.handleReq();
    }
    public static void main(String[] args) {
        Client c = new Client();
        Adaptee a = new Adaptee();
        Target t = new Adapter(a);//需要传入适配器
        c.test1(t);
    }
}
