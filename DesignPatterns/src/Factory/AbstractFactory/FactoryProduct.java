package Factory.AbstractFactory;

/**
 * @description: 创建一个 工厂 生成器，生成相应的 工厂
 * @author: xiaoming
 * @date: 2022/10/11 21:44
 */
public class FactoryProduct {
    public static AbstractFactory getFactoryByType(String type) {
        if (type == null) return null;
        if ("HeightHeels".equalsIgnoreCase(type)) return new HeightHeelsFactory();
        if ("Sneakers".equalsIgnoreCase(type)) return new SneakersFactory();
        return null;
    }
}
