package Structured.Flyweight;

/**
 * @description:
 * @author: xiaoming
 * @date: 2022/10/19 15:30
 */
public class FlyweightTest {
    private static final String colors[] =
            {"Red", "Green", "Blue", "White", "Black"};

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int random = (int) (Math.random() * 5);
            Circle circle = CircleFactory.getCircle(colors[random]);
            circle.setRadius((int) (Math.random() * 40));
            circle.setContent(Integer.toString((int) (Math.random() * 80)));
            circle.draw();
        }
    }
}
