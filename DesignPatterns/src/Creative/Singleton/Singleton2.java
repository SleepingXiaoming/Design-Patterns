package Creative.Singleton;

/**
 * @description: 单例设计模式 懒汉式 线程安全
 * @author: xiaoming
 * @date: 2022/10/10 11:07
 */
public class Singleton2 {
    private static Singleton2 singletonObject;

    // 私有化构造器
    private Singleton2() {
    }

    public static synchronized Singleton2 getSingletonObject() {
        if (singletonObject == null) {
            singletonObject = new Singleton2();
        }
        return singletonObject;
    }
}
