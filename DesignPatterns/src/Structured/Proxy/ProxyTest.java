package Structured.Proxy;

/**
 * @description:
 * @author: xiaoming
 * @date: 2022/10/20 16:33
 */
public class ProxyTest {
    public static void main(String[] args) {
        FileProxy fileProxy = new FileProxy("test1.txt");

        fileProxy.display();
        System.out.println();
        fileProxy.display();
    }
}
