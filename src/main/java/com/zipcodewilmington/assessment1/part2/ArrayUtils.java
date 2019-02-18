package com.zipcodewilmington.assessment1.part2;

import java.lang.reflect.Array;

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
    public static Integer[] removeValue(Integer[] objectArray, Integer objectToRemove) {
        Integer[] arr = new Integer[objectArray.length-1];

        Integer[] integersArray = new Integer[objectArray.length];
//        String stringToRemove = objectToRemove.toString();
//        Integer integerToRemove = Integer.valueOf(stringToRemove);
        System.arraycopy(objectArray, 0, integersArray, 0, objectArray.length);

        for(Integer number : integersArray) {
            if(number.equals(objectToRemove)) {
                continue;
            }
            for (int i = 0; i < arr.length; i++) {
                arr[i] = number;
            }
        }
        return arr;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        int count = 1;
        int tempCount = 0;
        Object popular = objectArray[0];
        Object temp = null;
        for (int i = 0; i < objectArray.length-1; i ++) {
            temp = objectArray[i];
            tempCount = 0;
            for (int j = 1; j < objectArray.length; j++) {
                if(temp.equals(objectArray[j])) {
                    tempCount++;
                }
                if (tempCount > count) {
                    popular = temp;
                    count = tempCount;
                }
            }
        }
        return popular;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        return null;
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
