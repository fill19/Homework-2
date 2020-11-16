package com.cursor.java;

import java.util.Arrays;
import java.util.Collections;


public class Test {
    public static void main(String[] args) {

        //First Task

        Integer[] num = {2, 3, 1, 7, 11};
        Arrays.sort(num);
        System.out.println("Reverse order of massive: ");
        printingOfArray(num);

        //Second Task
        Integer[] diam = {12, 53, -17, 5, -53};
        System.out.println("The sum of positive values:");
        System.out.println(theSum(diam));

        //Third Task
        Integer[] chag = {2, 4, 7, 16};
        System.out.println("The avarage of values: ");
        theAverage(chag);


        //Forth Task
        Integer[] dex = {3, 2, 3, 1, 4, 2, 8, 3};
        System.out.println("Duplicating values: ");
        duplicatedValues(dex);
    }


    private static void printingOfArray(Integer[] num) {
        for (int i = 0; i < num.length; i++) {
            Arrays.sort(num, Collections.reverseOrder());
            System.out.println(num[i]);
        }
    }


    private static void theAverage(Integer[] chug) {
        int totalChug = 0;
        for (int i = 0; i < chug.length; i++) {
            totalChug = totalChug + chug[i];
        }
        int avarage = totalChug / chug.length;
        System.out.println(avarage);
    }

    private static int theSum(Integer[] diam) {
        int sum = 0;
        for (int i = 0; i < diam.length; i++) {
            if (diam[i] > 0)
                sum = sum + diam[i];
        }

        return sum;
    }

    private static void duplicatedValues(Integer[] dex) {
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














