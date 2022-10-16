package Creative.Builder;

/**
 * @description: 表示食物条目的接口
 * @author: xiaoming
 * @date: 2022/10/12 10:36
 */
public interface Item {
    String name();

    Packing packing();

    double price();
}
