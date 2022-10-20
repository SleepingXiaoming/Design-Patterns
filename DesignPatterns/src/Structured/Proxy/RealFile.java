package Structured.Proxy;

/**
 * @description:
 * @author: xiaoming
 * @date: 2022/10/20 16:29
 */
public class RealFile implements File {
    private String filename;

    public RealFile(String filename) {
        this.filename = filename;
        load();
    }

    @Override
    public void display() {
        System.out.println("正在使用" + filename);
    }

    public void load() {
        System.out.println("正在加载" + filename);
    }
}
