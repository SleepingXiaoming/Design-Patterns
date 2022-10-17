package Structured.Decorator;

/**
 * @description:
 * @author: xiaoming
 * @date: 2022/10/17 21:08
 */
public class WeChatNotifier implements Notifier {
    @Override
    public void notice() {
        System.out.println("发送微信消息");
    }
}
