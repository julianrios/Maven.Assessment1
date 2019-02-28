package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int flagHeight, int jumpHeight) {
//        int numberOnejumps = k%j;
//        int numberOfMultiplejumps = (k-numberOnejumps)/j;
//        return numberOnejumps + numberOfMultiplejumps;
        int jumps = flagHeight / jumpHeight;
        int steps = flagHeight % jumpHeight;
        return jumps + steps;
    }
}
