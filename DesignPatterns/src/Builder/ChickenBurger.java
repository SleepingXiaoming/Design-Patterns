package Builder;

/**
 * @description:
 * @author: xiaoming
 * @date: 2022/10/12 10:54
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "ChickenBurger";
    }

    @Override
    public double price() {
        return 30;
    }
}
