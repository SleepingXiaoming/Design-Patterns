package Structured.Combination;

/**
 * @description:
 * @author: xiaoming
 * @date: 2022/10/17 15:13
 */
public class CombinationTest {
    public static void main(String[] args) {
        Folder f0 = new Folder("顶层文件夹0", 0);

        Folder f11 = new Folder("第一层文件夹1", 1);
        Folder f12 = new Folder("第一层文件夹2", 1);
        f0.addItem(f11, f12);

        Folder f21 = new Folder("第二层文件夹1", 2);
        Folder f22 = new Folder("第二层文件夹2", 2);
        f11.addItem(f21, f22);

        Folder f23 = new Folder("第二层文件夹3", 2);
        Folder f24 = new Folder("第二层文件夹4", 2);
        f12.addItem(f23, f24);

        System.out.println(f0 + "\n");
        for (Folder folder : f0.getFolders()) {
            System.out.println(folder);
            for (Folder f : folder.getFolders()) {
                System.out.println(f);
            }
            System.out.println();
        }
    }
}
