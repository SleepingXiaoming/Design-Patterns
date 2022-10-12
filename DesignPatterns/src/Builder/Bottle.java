package Builder;

/**
 * @description: 实现 包装 Packing 的实体类 (瓶装)
 * @author: xiaoming
 * @date: 2022/10/12 10:43
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
