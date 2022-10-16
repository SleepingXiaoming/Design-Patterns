package Creative.Prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: xiaoming
 * @date: 2022/10/13 20:42
 */
public class ShapeCache {
    private static Map<String, Shape> shapeMap = new HashMap<>();

    public static Shape getShape(String id) throws CloneNotSupportedException {
        Shape shape = shapeMap.get(id);
        return (Shape) shape.clone();
    }

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(),square);
    }
}
