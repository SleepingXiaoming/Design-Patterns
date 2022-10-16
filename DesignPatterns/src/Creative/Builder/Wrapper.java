package Creative.Builder;

/**
 * @description: 实现 包装 Packing 的实体类 (盒装)
 * @author: xiaoming
 * @date: 2022/10/12 10:42
 */
public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }
}
