package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerUtils {


    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {
        Integer sum =0;
        // includes n to pass test
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    /**
     * @param n integer value input by client
     * @return the product of all integers between 0 and not including `n`
     */
    public static Integer getProductOfN(Integer n) {
        Integer product =1;
        // includes n to pass test
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        return product;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {
        String number = val.toString();
        String reverse = BasicStringUtils.reverse(number);
        return Integer.parseInt(reverse);
//
//        StringBuilder reverseDigitsStr = new StringBuilder(val.toString());
//        String digitsAsStr = reverseDigitsStr.reverse().toString();
//        return val.valueOf(digitsAsStr);
    }
}
