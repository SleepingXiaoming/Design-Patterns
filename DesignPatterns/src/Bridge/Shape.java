package Bridge;

/**
 * @description: 创建桥接接口 Shape
 * @author: xiaoming
 * @date: 2022/10/15 21:22
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    public Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    protected abstract void draw();
}
