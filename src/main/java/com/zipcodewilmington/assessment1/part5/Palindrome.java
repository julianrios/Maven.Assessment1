package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public Integer countPalindromes(String input){
        input = input + " ";
        String word = "";
        int count = 0;
        for(int i =0; i < input.length(); i++) {

            char ch = input.charAt(i);

            if(ch != ' '){
                word = word + ch;
            } else {
                if(checkPalin(word)) {
                    count++;
                }
                word = "";
            }
        }
        return count;
    }

    private boolean checkPalin(String word) {
        int n = word.length();
        word = word.toLowerCase();
        boolean isPalin = false;
        for (int i = 0; i <n; i++, n--) {
            if(word.charAt(i) != word.charAt(n-1)) {
                isPalin = false;
            } else {
                isPalin = true;
            }
        }
        return isPalin;
    }
}
