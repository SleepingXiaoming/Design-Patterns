package Structured.Flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: xiaoming
 * @date: 2022/10/19 15:16
 */
public class CircleFactory {
    private static final Map<String, Circle> map = new HashMap<>();

    // 根据颜色获取 相对应的对象
    public static Circle getCircle(String color) {
        Circle circle = map.get(color);
        if (circle == null) {
            circle = new Circle();
            circle.setColor(color);
            System.out.println("创建了一个新的 " + color + " Circle 对象");
            map.put(color, circle);
        }
        return circle;
    }
}
