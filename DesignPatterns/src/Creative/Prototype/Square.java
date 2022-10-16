package Creative.Prototype;

/**
 * @description: Shape 类的实现类
 * @author: xiaoming
 * @date: 2022/10/13 20:38
 */
public class Square extends Shape {
    public Square() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Square Draw()");
    }
}
