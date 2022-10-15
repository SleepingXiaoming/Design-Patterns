package Bridge;

/**
 * @description: 实现了 桥接 虚拟类的实体类
 * @author: xiaoming
 * @date: 2022/10/15 21:26
 */
public class Circle extends Shape {
    public Circle(DrawAPI drawAPI) {
        super(drawAPI);
    }

    @Override
    protected void draw() {
        drawAPI.drawCircle();
    }
}
