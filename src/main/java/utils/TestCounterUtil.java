package utils;

public class TestCounterUtil {

    private static int counterValue = 0;
    private static final String COUNTER_INFO_TEXT = "run test #%d into method %s";

    public static String getInfo() {
        return String.format(COUNTER_INFO_TEXT, ++counterValue,
                MethodNameUtil.getCurrentMethodName());
    }

}
