package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        str = str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();
        return str;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        StringBuilder reverseStr = new StringBuilder(str);
        reverseStr.reverse();
        return reverseStr.toString();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        str = camelCase(str);
        StringBuilder reverseStr = new StringBuilder(str);
        reverseStr.reverse();
        str = camelCase(reverseStr.toString());
        return str;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        str = str.substring(1,str.length()-1);
        return str;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isLowerCase(c)) {
                result += Character.toUpperCase(c);
            } else {
                result += Character.toLowerCase(c);
            }
        }

        return result;
    }
//
//
//
//
//
//
//
//        char[] charArray = str.toCharArray();
//
//        for (int i = 0; i < charArray.length; i++) {
//
//            if(Character.isUpperCase(charArray[i])) {
//                charArray[i] = Character.toLowerCase(charArray[i]);
//            } else if(Character.isLowerCase(charArray[i])) {
//                charArray[i] = Character.toUpperCase(charArray[i]);
//            }
//        }
//        str = new String(charArray);
//        return str;
//    }

}
