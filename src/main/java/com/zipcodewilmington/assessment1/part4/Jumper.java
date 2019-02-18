package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {
        int totalJumps = -1;

//        if(k % j == k) {
//            totalJumps = j;
//        }
        if(k % j ==0) {
            totalJumps = k;
        } else if(!(k % j ==0)) {
            totalJumps = j;
        }
        return totalJumps;
    }
}
