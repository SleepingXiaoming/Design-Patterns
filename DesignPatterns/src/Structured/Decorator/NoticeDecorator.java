package Structured.Decorator;

/**
 * @description:
 * @author: xiaoming
 * @date: 2022/10/17 21:25
 */
public class NoticeDecorator extends Notice {
    public NoticeDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void notice() {
        super.notice();
        System.out.println("执行了新的操作……");
    }
}
