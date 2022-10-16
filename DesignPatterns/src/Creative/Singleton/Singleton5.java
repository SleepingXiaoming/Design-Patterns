package Creative.Singleton;

/**
 * @description: 单例设计模式 枚举
 * @author: xiaoming
 * @date: 2022/10/11 13:30
 */
public enum Singleton5 {
    SingleObject("test");

    private String temp;


    Singleton5(String temp) {
        this.temp = temp;
    }

    public String getTemp() {
        return temp;
    }
}

