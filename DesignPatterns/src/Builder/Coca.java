package Builder;

/**
 * @description:
 * @author: xiaoming
 * @date: 2022/10/12 11:12
 */
public class Coca extends Drink {
    @Override
    public String name() {
        return "Coca";
    }

    @Override
    public double price() {
        return 8;
    }
}
