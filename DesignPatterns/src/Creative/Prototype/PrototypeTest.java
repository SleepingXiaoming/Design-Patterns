package Creative.Prototype;

/**
 * @description:
 * @author: xiaoming
 * @date: 2022/10/13 20:52
 */
public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 模拟从数据库中查询对象
        ShapeCache.loadCache();

        Shape shape1 = ShapeCache.getShape("1");
        System.out.println(shape1.getType());

        Shape shape2 = ShapeCache.getShape("2");
        System.out.println(shape2.getType());
    }
}
