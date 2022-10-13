package Factory.FactoryPattern;

/**
 * @description: 工厂实现
 * @author: xiaoming
 * @date: 2022/10/11 15:50
 */
public class FactoryTest {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Animal cat = factory.getAnimal("cat");
        cat.eat();
        cat.say();
        Animal dog = factory.getAnimal("dog");
        dog.eat();
        dog.say();
    }
}
