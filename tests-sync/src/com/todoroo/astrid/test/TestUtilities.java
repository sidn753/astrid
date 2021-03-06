package com.todoroo.astrid.test;


/**
 * Utility methods used in unit tests
 *
 * @author Tim Su <tim@todoroo.com>
 *
 */
public class TestUtilities {

    /**
     * Sleep, suppressing exceptions
     *
     * @param millis
     */
    public static void sleepDeep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            // do nothing
        }
    }

}
