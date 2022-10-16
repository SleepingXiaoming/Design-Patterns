package Structured.Adapter.ObjectAdapter;

/**
 * @description:
 * @author: xiaoming
 * @date: 2022/10/14 21:23
 */
public class AC110 implements AC {
    private final int output = 110;

    @Override
    public int outAC() {
        return output;
    }
}
