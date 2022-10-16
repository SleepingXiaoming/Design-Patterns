package Structured.Bridge;

/**
 * @description:
 * @author: xiaoming
 * @date: 2022/10/15 21:28
 */
public class BridgeTest {
    public static void main(String[] args) {
        Shape red = new Circle(new RedCircle());
        red.draw();


        Shape blue = new Circle(new BlueCircle());
        blue.draw();
    }
}
