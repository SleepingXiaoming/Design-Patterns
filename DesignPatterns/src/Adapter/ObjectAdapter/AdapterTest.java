package Adapter.ObjectAdapter;


import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: xiaoming
 * @date: 2022/10/14 21:44
 */
public class AdapterTest {
    private List<DC5Adapter> adapters = new ArrayList<>();

    public AdapterTest() {
        adapters.add(new ChinaAdapter());
        adapters.add(new JapanAdapter());
    }

    public DC5Adapter getProper(AC ac) {
        DC5Adapter dc5Adapter = null;
        for (DC5Adapter dc : adapters) {
            if (dc.support(ac)) {
                dc5Adapter = dc;
                break;
            }
        }
        return dc5Adapter;
    }

    public static void main(String[] args) {
        AdapterTest test = new AdapterTest();

        AC acChina = new AC220();
        // 寻找 合适的适配器
        DC5Adapter china = test.getProper(acChina);
        // 使用 适配器 将 AC 转换为 相对应的 DC
        if (china != null) china.outputDC5V(acChina);

        System.out.println();

        AC acJan = new AC110();
        DC5Adapter jan = test.getProper(acJan);
        if (jan != null) jan.outputDC5V(acJan);

    }
}
