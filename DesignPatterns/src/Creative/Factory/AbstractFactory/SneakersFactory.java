package Creative.Factory.AbstractFactory;

/**
 * @description: 创建 球鞋 工厂类 继承了 虚拟工厂类
 * @author: xiaoming
 * @date: 2022/10/11 21:37
 */
public class SneakersFactory extends AbstractFactory {
    @Override
    public Sneakers getSneakers(String sneakers) {
        if (sneakers == null) return null;
        if ("PUMA".equalsIgnoreCase(sneakers)) return new PUMA();
        if ("Anta".equalsIgnoreCase(sneakers)) return new Anta();
        return null;
    }

    @Override
    public HighHeels getHighHeels(String heightHeels) {
        return null;
    }
}
