package Adapter.ObjectAdapter;

/**
 * @description: 5V 输出 适配器
 * @author: xiaoming
 * @date: 2022/10/14 21:24
 */
public interface DC5Adapter {
    boolean support(AC ac);

    int outputDC5V(AC ac);
}
