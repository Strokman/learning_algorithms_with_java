package com.examples;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 100, 2, 56, 4, 7, 10, 145, 2, 1, -100}; // sample array
        int iterations = bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(iterations);
    }

    public static int bubbleSort(int[] arr) {
        /*
        Method takes an array as argument and sorts it using bubble sort, optimized with flag.
        Array is sorted in place, so the method only returns iterations counter
         */
        boolean swapped = true;
        int iterationsCounter = 0;
        while (swapped) {
            // if no swaps were made in previous iteration the flag will become false,
            // which means that array is already sorted and cycle breaks
            swapped = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                    iterationsCounter++;
                }
            }
        }
        return iterationsCounter;
    }
}
