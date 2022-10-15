package Bridge;

/**
 * @description: DrawAPI 的实现类
 * @author: xiaoming
 * @date: 2022/10/15 21:19
 */
public class BlueCircle implements DrawAPI {
    @Override
    public void drawCircle() {
        System.out.println("输出一个蓝色的圆，实现于接口 DrawAPI");
    }
}
