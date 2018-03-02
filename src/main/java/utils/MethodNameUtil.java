package utils;

import logger.Log4JWrapper;

public class MethodNameUtil {

    public static String getCurrentMethodName() {
        return getMethodName(22);
    }

    /**
     * Get the method name for a depth in call stack.
     *
     * @param depth depth in the call stack (0 means current method, 1 means call method, ...)
     * @return method name
     */
    private static String getMethodName(final int depth) {
        final StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        for (int i = ste.length - 1; i >= 0; i--) {
            /* debug for find need method */
            Log4JWrapper.trace(ste[i].toString());
        }
        return ste[ste.length - 1 - depth].getMethodName();
    }

}
