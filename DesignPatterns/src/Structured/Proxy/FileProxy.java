package Structured.Proxy;

/**
 * @description:
 * @author: xiaoming
 * @date: 2022/10/20 16:31
 */
public class FileProxy implements File {
    private String filename;
    private File file;

    public FileProxy(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (file == null) file = new RealFile(filename);
        file.display();
    }
}
