package Adapter.ClassAdapter;

/**
 * @description:
 * @author: xiaoming
 * @date: 2022/10/14 19:57
 */
public class AdapterTest {
    public static void main(String[] args) {
        Target target = new Adapter();
        System.out.println("Target 接口");
        target.method();

        Adaptee adaptee = new Adaptee();
        System.out.println("Adaptee 接口");
        adaptee.adapteeMethod();
    }
}
