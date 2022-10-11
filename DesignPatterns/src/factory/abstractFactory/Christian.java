package factory.abstractFactory;

/**
 * @description: 创建一个 高跟鞋 实现类 Christian
 * @author: xiaoming
 * @date: 2022/10/11 21:34
 */
public class Christian implements HighHeels {
    @Override
    public void height() {
        System.out.println("10公分");
    }
}
