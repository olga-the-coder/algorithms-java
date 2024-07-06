package org.example;

public class LinearSearchExample {
    public static int getIndexOfNumber(int[] searchLandscape, int target) {
        for (int i = 0; i < searchLandscape.length; i++) {
            int currentElement = searchLandscape[i];
            if (currentElement == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] searchLandscape = {1, 2, 3, 4, 5, 6, 45, 51};
        int indexOfTargetElement = getIndexOfNumber(searchLandscape, 51);
        System.out.println("Index of target element is " + indexOfTargetElement);
    }
}