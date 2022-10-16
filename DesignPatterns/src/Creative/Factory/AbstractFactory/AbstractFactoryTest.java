package Creative.Factory.AbstractFactory;

/**
 * @description: 抽象工厂类的测试
 * @author: xiaoming
 * @date: 2022/10/11 21:41
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        AbstractFactory heightHeels = FactoryProduct.getFactoryByType("HeightHeels");

        HighHeels valentino = heightHeels.getHighHeels("Valentino");
        valentino.height();

        HighHeels christian = heightHeels.getHighHeels("Christian");
        christian.height();

        AbstractFactory sneakers = FactoryProduct.getFactoryByType("Sneakers");
        Sneakers puma = sneakers.getSneakers("PUMA");
        puma.size();

        Sneakers anta = sneakers.getSneakers("Anta");
        anta.size();
    }
}
