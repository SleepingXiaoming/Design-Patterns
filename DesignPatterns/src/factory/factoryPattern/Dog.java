package factory.factoryPattern;

/**
 * @description: 实现接口的工厂类
 * @author: xiaoming
 * @date: 2022/10/11 15:00
 */
public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("bone");
    }

    @Override
    public void say() {
        System.out.println("bark...");
    }
}
