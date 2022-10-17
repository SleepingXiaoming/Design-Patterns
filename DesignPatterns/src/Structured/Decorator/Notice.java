package Structured.Decorator;

/**
 * @description:
 * @author: xiaoming
 * @date: 2022/10/17 21:23
 */
public abstract class Notice implements Notifier {
    private Notifier notifier;

    public Notice(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void notice() {
        notifier.notice();
    }
}
