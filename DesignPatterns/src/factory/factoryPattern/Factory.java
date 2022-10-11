package factory.factoryPattern;

/**
 * @description: 创建工厂
 * @author: xiaoming
 * @date: 2022/10/11 15:48
 */
public class Factory {

    public Animal getAnimal(String type) {
        if (type == null) return null;
        if ("Cat".equalsIgnoreCase(type)) return new Cat();
        if ("Cow".equalsIgnoreCase(type)) return new Cow();
        if ("Dog".equalsIgnoreCase(type)) return new Dog();
        return null;
    }
}
