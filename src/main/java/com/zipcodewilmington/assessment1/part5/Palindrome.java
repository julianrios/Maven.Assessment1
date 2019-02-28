package com.zipcodewilmington.assessment1.part5;

import com.zipcodewilmington.assessment1.part1.BasicArrayUtils;
import com.zipcodewilmington.assessment1.part1.BasicStringUtils;

public class Palindrome {

    public Integer countPalindromes(String input){
        int palindroneCount = 0;
        // looping forward
        for(int i = 0; i< input.length(); i++) {
            // looping backwards
            for(int j = input.length(); i < j; j--) {
                // checking if the input is the same forwards and backwards and if it is add it to the counter
                if(input.substring(i, j).equals(BasicStringUtils.reverse(input.substring(i, j)))) {
                    palindroneCount++;
                }
            }
        }
        return palindroneCount;
    }
}
