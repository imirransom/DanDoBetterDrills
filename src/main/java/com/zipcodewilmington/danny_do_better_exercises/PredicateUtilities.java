package com.zipcodewilmington.danny_do_better_exercises;

/**
 * Created by dan on 6/14/17.
 */
public class PredicateUtilities {
    /**
     * @param x
     * @param y
     * @return true if `x` is greater than `y`
     */
    public static Boolean isGreaterThan(int x, int y) {
        boolean answer;
        if (x>y) {
            answer = true;
        }else {
            answer = false;
        }
        return answer;
    }

    /**
     * @param x
     * @param y
     * @return true if `x` is less than `y`
     */
    public static Boolean isLessThan(int x, int y) {
        return isGreaterThan(x,y);
    }

    /**
     * @param x
     * @param y
     * @return true if `x` is greater than or equal to `y`
     */
    public Boolean isGreaterThanOrEqualTo(int x, int y) {
        return null;
    }

    /**
     * @param x
     * @param y
     * @return true if `x` is less than or equal to `y`
     */
    public Boolean isLessThanOrEqualTo(int x, int y) {
        return null;
    }


    /**
     * @return true
     */
    public Boolean returnTrue() {
        return null;
    }

    /**
     * @return false
     */
    public Boolean returnFalse() {
        return null;
    }

}