package org.example;

public class BinarySearch {
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] == target) {
                return mid; //Element found
            } else if (array[mid] < target) {
                left = mid + 1; //Search in the right half
            } else {
                right = mid - 1; //Search in the left half
            }
        }
        return -1; //Element not found
    }


    public static void main(String[] args) {
        int[] arrayNumbers = {1, 8, 10, 13, 16, 19, 40, 47, 10};
        int index = binarySearch(arrayNumbers, 19);
        System.out.println(index);
    }
}