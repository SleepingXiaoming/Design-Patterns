package Structured.Appearance;

/**
 * @description: 创建一个外观类，将相对应的操作放入其中
 * @author: xiaoming
 * @date: 2022/10/18 13:59
 */
public class DealMaker {
    private Deal pay;
    private Deal registration;

    public DealMaker() {
        pay = new Pay();
        registration = new Registration();
    }

    public void pay() {
        pay.dealing();
    }

    public void registration() {
        registration.dealing();
    }
}
