package Creative.Prototype;

/**
 * @description: Shape 类的实现类
 * @author: xiaoming
 * @date: 2022/10/13 20:40
 */
public class Circle extends Shape {
    public Circle() {
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Circle Draw()");
    }
}
