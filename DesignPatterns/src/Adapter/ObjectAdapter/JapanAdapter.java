package Adapter.ObjectAdapter;

/**
 * @description:
 * @author: xiaoming
 * @date: 2022/10/14 21:42
 */
public class JapanAdapter implements DC5Adapter {
    private final int output = 110;

    @Override
    public boolean support(AC ac) {
        return output == ac.outAC();
    }

    @Override
    public int outputDC5V(AC ac) {
        int adapterInput = ac.outAC();
        //变压器
        int adapterOutput = adapterInput / 22;
        System.out.println("使用 JapanAdapter 变压适配器，输入AC:" + adapterInput + "V" + "，输出DC:" + adapterOutput + "V");
        return adapterOutput;
    }
}
