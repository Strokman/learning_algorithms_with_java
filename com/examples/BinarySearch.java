package com.examples;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 25, 56, 67, 84, 100, 204, 256, 308, 414};
        int start = 0;
        int stop = arr.length - 1;
        int toFind = 500; // which number should be found
        int result = binarySearch(arr, start, stop, toFind);
        System.out.println(result);
    }

    public static int binarySearch(int[] arr, int start, int stop, int toFind) {
        /*
        Function takes an array as first argument, start and stop indexes (between of which
        search should be done, and number (integer) which should be found. Returns index
        of found integer or -1 if number is not in array. Array should be sorted.
        */
        if (start > stop) {
            return -1;
        } else {
            int pivot = (stop + start) / 2; // variable to split the array in two - middle index
            if (toFind == arr[pivot]) {
                return pivot; // if number to find equals of middle element of array - return middle index
            } else if (toFind > arr[pivot]) {
                // if not - check if number is greater or less then middle element
                // call the method recursively
                return binarySearch(arr, pivot + 1, stop, toFind);
            } else {
                return binarySearch(arr, start, pivot - 1, toFind);
            }
        }
    }
}
