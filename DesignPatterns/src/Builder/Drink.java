package Builder;

/**
 * @description:
 * @author: xiaoming
 * @date: 2022/10/12 10:52
 */
public abstract class Drink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract double price();
}
