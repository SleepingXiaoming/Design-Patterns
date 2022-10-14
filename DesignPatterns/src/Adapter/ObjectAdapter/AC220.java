package Adapter.ObjectAdapter;

/**
 * @description:
 * @author: xiaoming
 * @date: 2022/10/14 21:21
 */
public class AC220 implements AC {
    private final int output = 220;

    @Override
    public int outAC() {
        return output;
    }
}
