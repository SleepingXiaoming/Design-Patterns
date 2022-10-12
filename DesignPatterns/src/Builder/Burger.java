package Builder;

/**
 * @description:
 * @author: xiaoming
 * @date: 2022/10/12 10:50
 */
public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract double price();
}
