package Creative.Factory.AbstractFactory;

/**
 * @description: 创建 一个 虚拟工厂类
 * @author: xiaoming
 * @date: 2022/10/11 21:34
 */
public abstract class AbstractFactory {
    public abstract Sneakers getSneakers(String sneakers);

    public abstract HighHeels getHighHeels(String heightHeels);
}
