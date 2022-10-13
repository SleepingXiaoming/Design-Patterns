package Factory.FactoryPattern;

/**
 * @description: 实现接口的工厂类
 * @author: xiaoming
 * @date: 2022/10/11 14:59
 */
public class Cow implements Animal {
    @Override
    public void eat() {
        System.out.println("grass");
    }

    @Override
    public void say() {
        System.out.println("moo...");
    }
}
