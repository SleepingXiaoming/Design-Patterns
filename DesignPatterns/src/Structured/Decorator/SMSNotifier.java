package Structured.Decorator;

/**
 * @description:
 * @author: xiaoming
 * @date: 2022/10/17 21:07
 */
public class SMSNotifier implements Notifier {
    @Override
    public void notice() {
        System.out.println("发送短信");
    }
}
