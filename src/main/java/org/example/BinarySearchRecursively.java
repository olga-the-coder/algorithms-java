package org.example;

public class BinarySearchRecursively {
    public static int runBinarySearchRecursively(int[] sortedArray, int target, int low, int high) {
        int middle = low + ((high - low) / 2);

        if (high < low) {
            return -1;
        }

        if (target == sortedArray[middle]) {
            return middle;
        } else if (target < sortedArray[middle]) {
            return runBinarySearchRecursively(sortedArray, target, low, middle -1);
        } else {
            return runBinarySearchRecursively(sortedArray, target, middle + 1, high);
        }

    }

    public static void main(String[] args) {
        int[] arrayNumbers = {1, 8, 10, 13, 16, 19, 40, 47, 10};
        int index = runBinarySearchRecursively(arrayNumbers, 19, 1, 8);
        System.out.println(index);
    }
}
