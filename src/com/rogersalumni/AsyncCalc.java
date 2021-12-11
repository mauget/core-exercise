package com.rogersalumni;

/**
 * AyncCalc burns system cycles on a Java thread.
 */
public class AsyncCalc {
    private void burnSystemCycles(double arg) {
        for (double d = 0; d < Math.random() * 1e5; ++d) {
            double result = Math.sqrt(Math.random() * arg);
//            System.out.println("sqrt(" + arg + ") => " +result);
            System.gc();
        }
    }

    public void calc(final double arg) {
        new Thread(() -> burnSystemCycles(arg)).start();
    }
}
