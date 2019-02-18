package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leon on 2/16/18.
 */
public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] ints) {
        return deleteMultiplesOfN(ints, 2);
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {
        List<Integer> intsAsList = new ArrayList<>();
        for(Integer number : ints) {
            if(number % 2 == 1) {
                continue;
            }
            intsAsList.add(number);
        }
        Integer[] removedEvens = new Integer[intsAsList.size()];
        removedEvens = intsAsList.toArray(removedEvens);
        return removedEvens;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) {
        return deleteMultiplesOfN(ints, 3);
    }

    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {
        List<Integer> integersAsList = new ArrayList<>();
        for(Integer number : ints) {
            if(number % multiple == 0) {
                continue;
            }
            integersAsList.add(number);
        }
        Integer[] arrayAfterDeletion = new Integer[integersAsList.size()];
        arrayAfterDeletion = integersAsList.toArray(arrayAfterDeletion);
        return arrayAfterDeletion;
    }
}
