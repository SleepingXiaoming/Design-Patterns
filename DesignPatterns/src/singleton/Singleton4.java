package singleton;

/**
 * @description: 单例设计模式 双检索
 * @author: xiaoming
 * @date: 2022/10/10 10:52
 */
public class Singleton4 {
    private static volatile Singleton4 singletonObject;

    private Singleton4() {
    }

    public Singleton4 getSingletonObject() {
        if (singletonObject == null) {
            synchronized (this) {
                if (singletonObject == null) {
                    singletonObject = new Singleton4();
                }
            }
        }
        return singletonObject;
    }
}
