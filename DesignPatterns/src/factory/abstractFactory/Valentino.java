package factory.abstractFactory;

/**
 * @description: 创建一个 高跟鞋 实现类 Valentino
 * @author: xiaoming
 * @date: 2022/10/11 21:33
 */
public class Valentino implements HighHeels {
    @Override
    public void height() {
        System.out.println("15公分");
    }
}
