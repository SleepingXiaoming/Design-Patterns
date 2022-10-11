package factory.abstractFactory;

/**
 * @description: 创建 高跟鞋 工厂类 继承了 虚拟工厂类
 * @author: xiaoming
 * @date: 2022/10/11 21:40
 */
public class HeightHeelsFactory extends AbstractFactory {
    @Override
    public Sneakers getSneakers(String sneakers) {
        return null;
    }

    @Override
    public HighHeels getHighHeels(String heightHeels) {
        if (heightHeels == null) return null;
        if ("Christian".equalsIgnoreCase(heightHeels)) return new Christian();
        if ("Valentino".equalsIgnoreCase(heightHeels)) return new Valentino();
        return null;
    }
}
