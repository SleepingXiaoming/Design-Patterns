package Creative.Factory.AbstractFactory;

/**
 * @description: 创建一个 球鞋实现类 PUMA
 * @author: xiaoming
 * @date: 2022/10/11 21:31
 */
public class PUMA implements Sneakers {
    @Override
    public void size() {
        System.out.println("43码");
    }
}
