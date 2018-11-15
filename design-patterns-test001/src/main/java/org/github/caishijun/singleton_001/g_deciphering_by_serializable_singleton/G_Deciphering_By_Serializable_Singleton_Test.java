package org.github.caishijun.singleton_001.g_deciphering_by_serializable_singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 2、通过序列化和反序列化构建对象
 *
 * 防止反序列化构建对象
 *
 * 在Singleton6中定义一个方法，此时结果就会一样了。System.out.println(s1==s5);结果就是true了
 *
 *
 * 反序列化时，如果定义了readResolve()则直接返回该方法指定的实例。不会再单独创建新对象！
 * @return
 * @throws ObjectStreamException
 *
 * private Object readResolve() throws ObjectStreamException{
 *     return instance;
 * }
 *
 */


/**
 * 通过反射破解单例模式
 */
public class G_Deciphering_By_Serializable_Singleton_Test {

    public static void main(String[] args) throws Exception {
        Singleton7 s1 = Singleton7.getInstance();
        Singleton7 s2 = Singleton7.getInstance();
        System.out.println(s1 == s2);//true

        //通过反序列化构建对象：通过序列化将s1存储到硬盘上，然后再通过反序列化把s1再构建出来
        FileOutputStream fos = new FileOutputStream("e:/a.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s1);
        oos.close();
        fos.close();
        //通过反序列化将s1对象再构建出来
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("e:/a.txt"));
        Singleton7 s5 = (Singleton7) ois.readObject();
        System.out.println(s5);//此时打印出一个新对象
        System.out.println(s1==s5);//false
    }
}
