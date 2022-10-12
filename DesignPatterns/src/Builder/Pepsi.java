package Builder;

/**
 * @description:
 * @author: xiaoming
 * @date: 2022/10/12 11:12
 */
public class Pepsi extends Drink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public double price() {
        return 9;
    }
}
