package Builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: xiaoming
 * @date: 2022/10/12 11:13
 */
public class Meal {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public double getTotalPrice() {
        double sum = 0;
        for (Item item : items) {
            sum += item.price();
        }
        return sum;
    }

    public void showItems() {
        items.forEach(item -> {
            System.out.print("Item : " + item.name());
            System.out.print(", Packing : " + item.packing().pack());
            System.out.println(", Price : " + item.price());
        });
    }
}
