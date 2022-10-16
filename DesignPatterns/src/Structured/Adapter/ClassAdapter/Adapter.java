package Structured.Adapter.ClassAdapter;

/**
 * @description:
 * @author: xiaoming
 * @date: 2022/10/14 19:54
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void method() {
        super.adapteeMethod();
    }
}
