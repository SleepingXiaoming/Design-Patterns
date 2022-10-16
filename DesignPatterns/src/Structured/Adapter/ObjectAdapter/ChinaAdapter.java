package Structured.Adapter.ObjectAdapter;

/**
 * @description:
 * @author: xiaoming
 * @date: 2022/10/14 21:39
 */
public class ChinaAdapter implements DC5Adapter {
    private final int output = 220;

    @Override
    public boolean support(AC ac) {
        return output == ac.outAC();
    }

    @Override
    public int outputDC5V(AC ac) {
        int adapter = ac.outAC();
        //变压器
        int adapterOutput = adapter / 44;
        System.out.println("使用 ChinaAdapter 变压适配器，输入AC:" + adapter + "V" + "，输出DC:" + adapterOutput + "V");
        return adapterOutput;
    }
}
