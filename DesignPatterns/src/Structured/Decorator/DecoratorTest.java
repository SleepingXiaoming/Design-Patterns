package Structured.Decorator;

/**
 * @description:
 * @author: xiaoming
 * @date: 2022/10/17 21:26
 */
public class DecoratorTest {
    public static void main(String[] args) {
        Notifier smsNotifier = new SMSNotifier();
        NoticeDecorator smsNoticeDecorator = new NoticeDecorator(new SMSNotifier());

        System.out.println("未修饰之前的 SMS");
        smsNotifier.notice();
        System.out.println();
        System.out.println("修饰后的 SMS");
        smsNoticeDecorator.notice();

        System.out.println();

        // 发送微信同理
        NoticeDecorator wxNoticeDecorator = new NoticeDecorator(new WeChatNotifier());
        wxNoticeDecorator.notice();
    }
}
