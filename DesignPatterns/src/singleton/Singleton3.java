package singleton;

/**
 * @description: 单例设计模式 饿汉式
 * @author: xiaoming
 * @date: 2022/10/10 10:52
 */
public class Singleton3 {
    private static Singleton3 singletonObject = new Singleton3();

    // 私有化构造器
    private Singleton3() {
    }

    public static Singleton3 getSingletonObject() {
        return singletonObject;
    }
}
