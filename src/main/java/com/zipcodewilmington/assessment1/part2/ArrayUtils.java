package com.zipcodewilmington.assessment1.part2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        Integer count = 0;
        for(Object number : objectArray) {
            if(number.equals(objectToCount)) {
                count++;
            }
        }
        return count;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Integer[] objectArray, Integer objectToRemove) {
        int newLength = objectArray.length - getNumberOfOccurrences(objectArray, objectToRemove);

        Object[] newArray = Arrays.copyOf(objectArray, newLength); // returns an integer array
        int newArrayIndex = 0;


        for (Object item : objectArray) {
            if(!item.equals(objectToRemove)) {
                newArray[newArrayIndex] = item;
                // tells you how many elements to add in
                newArrayIndex++;
            }
        }
        // return Arrays.copyOf(newArray, newArrayIndex); // newArray with a new length
        return newArray;

//        List<Integer> integersAsList = new ArrayList<>();
//        for(Integer number : objectArray) {
//            if(number == objectToRemove) {
//                continue;
//            }
//            integersAsList.add(number);
//        }
//        Integer[] arrayAfterDeletion = new Integer[integersAsList.size()];
//        arrayAfterDeletion = integersAsList.toArray(arrayAfterDeletion);
//        return arrayAfterDeletion;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        Object common = objectArray[0];
        int commonCount = getNumberOfOccurrences(objectArray, common);

        for (Object currentObject : objectArray) {
            int currentCount = getNumberOfOccurrences(objectArray, currentObject);

            if (currentCount > commonCount) {
                common = currentObject;
                commonCount = currentCount;
            }
        }
        return common;

//        int count = 1;
//        int tempCount = 0;
//        Object popular = objectArray[0];
//        Object temp = null;
//        for (int i = 0; i < objectArray.length-1; i ++) {
//            temp = objectArray[i];
//            tempCount = 0;
//            for (int j = 1; j < objectArray.length; j++) {
//                if(temp.equals(objectArray[j])) {
//                    tempCount++;
//                }
//                if (tempCount > count) {
//                    popular = temp;
//                    count = tempCount;
//                }
//            }
//        }
//        return popular;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        Object leastCommon = objectArray[0];
        int leastCount = getNumberOfOccurrences(objectArray, leastCommon);

        for (Object item : objectArray) {
            Object current = item;
            int currentCount = getNumberOfOccurrences(objectArray, current);

            if (currentCount < leastCount) {
                leastCommon = current;
                leastCount = currentCount;
            }
        }

        return leastCommon;
//        Integer[] integerArray = Arrays.copyOfRange(objectArray, 0, objectArray.length, Integer[].class);
//        return countOccurences(integerArray);
    }

    public static Integer countOccurences(Integer[] objectArray) {
        int leastOccurrence = 0;
        for (int i = 0; i < objectArray.length-1; i++) {
                if((objectArray[i] != objectArray[i+1]) && (objectArray[i] != objectArray[i-1])) {
                    leastOccurrence = objectArray[i];
            }
        }
        return leastOccurrence;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        Integer aLen = objectArray.length;
        Integer bLen = objectArray.length;
        Object[] mergedArrays = (Object[]) Array.newInstance(objectArray.getClass().getComponentType(), aLen + bLen);
        System.arraycopy(objectArray,0, mergedArrays, 0, aLen);
        System.arraycopy(objectArrayToAdd,0, mergedArrays, aLen, bLen);
        return mergedArrays;
    }
}
