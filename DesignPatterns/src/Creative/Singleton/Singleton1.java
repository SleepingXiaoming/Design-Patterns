package Creative.Singleton;

/**
 * @description: 单例设计模式 懒汉式 线程不安全
 * @author: xiaoming
 * @date: 2022/10/10 10:51
 */

public class Singleton1 {
    private static Singleton1 singletonObject;

    // 私有化构造器
    private Singleton1() {
    }

    // 获取实例对象
    public static Singleton1 getSingletonObject() {
        if (singletonObject == null) {
            singletonObject = new Singleton1();
        }
        return singletonObject;
    }
}
