package Factory.FactoryPattern;

/**
 * @description: 实现接口的工厂类
 * @author: xiaoming
 * @date: 2022/10/11 14:58
 */
public class Cat implements Animal{
    @Override
    public void eat() {
        System.out.println("Fish");
    }

    @Override
    public void say() {
        System.out.println("meow...");
    }
}
