package Builder;

/**
 * @description:
 * @author: xiaoming
 * @date: 2022/10/12 10:53
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "VegBurger";
    }

    @Override
    public double price() {
        return 20;
    }
}
