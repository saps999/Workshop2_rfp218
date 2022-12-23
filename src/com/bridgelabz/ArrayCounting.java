package com.bridgelabz;

import java.util.Arrays;
import java.util.Random;

public class ArrayCounting {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(10, 99);
        }
        System.out.println(Arrays.toString(array));
        int evenSize = 0, oddSize = 0;
        int addEven=0, addOdd=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                addEven+=array[i];
                evenSize++;
            } else {
                addOdd+=array[i];
                oddSize++;
            }
        }
        System.out.println("Number of Even Elements are present is : " + evenSize);
        System.out.println("Addition of all Even numbers is: "+addEven);
        System.out.println("Number of Odd Elements are present is : " + oddSize);
        System.out.println("Addition of all Odd numbers is: "+addOdd);


    }
}
