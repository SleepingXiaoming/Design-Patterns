package Structured.Combination;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description:
 * @author: xiaoming
 * @date: 2022/10/17 15:07
 */
public class Folder {
    // 文件夹名称
    private String folderName;
    // 处于第几层
    private int level;
    private List<Folder> folders;

    public Folder(String folderName, int level) {
        this.folderName = folderName;
        this.level = level;
        folders = new ArrayList<>();
    }

    public void addItem(Folder... folder) {
        folders.addAll(Arrays.asList(folder));
    }

    public void removeItem(Folder... folder) {
        for (Folder f : folder) {
            folders.remove(f);
        }
    }

    public List<Folder> getFolders(){
        return folders;
    }

    @Override
    public String toString() {
        return "Folder{" + "folderName='" + folderName + '\'' + ", level=" + level + '}';
    }
}
