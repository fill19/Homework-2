package com.cursor.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;


public class Reverse {
    public static void main(String[] args) {

        //First Task
        Comparator<Integer> reverseOrderComparator = Collections.reverseOrder();
        Integer[] num = {2, 3, 1, 7, 11};
        Arrays.sort(num, (Comparator<Integer>) (Object) reverseOrderComparator);
        System.out.println("Reverse order of massive: ");
        printingOfArray(num);

        //Second Task
         int[] daim = {12, 53, -17, 5, -53};
        System.out.println("The sum of positive values:");
        System.out.println(theSum(daim));

        //Third Task
        int[] chag = {2, 4, 7, 16};
        System.out.println("The avarage of values: ");
        theAvarage(chag);


        //Forth Task
        int[] dex = {3, 2, 3, 1, 4, 2, 8, 3};
        System.out.println("Duplicating values: ");
        duplicatedValues(dex);
    }


    private static void printingOfArray(Integer[] num) {
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }


    private static void theAvarage(int[] chag) {
        int totalChag = 0;
        for (int i = 0; i < chag.length; i++) {
            totalChag = totalChag + chag[i];
        }
        int avarage = totalChag / chag.length;
        System.out.println(avarage);
    }

    private static int theSum(int[] daim) {
        int  sum = 0;
        for (int i = 0; i < daim.length; i++) {
            if (daim[i] > 0)
                sum = sum + daim[i];
        }

        return sum;
    }

    private static void duplicatedValues(int[] dex) {
        for (int i = 0; i < dex.length; i++) {
            for (int b = 0; b < dex.length; b++) {
                if (b == i)
                    continue;

                if (dex[b] == dex[i]) {
                    dex[b] = 0;
                    
                }

            }

        }
        System.out.println(Arrays.toString(dex));
    }

}













