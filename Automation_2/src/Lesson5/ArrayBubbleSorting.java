 package Lesson5;

import java.util.Arrays;

public class ArrayBubbleSorting {
    public static void main(String[] args) {

        int[] unsortedArray = {0, -1, -3, 5, 2, 10};
        int[] sorted = bubbleSort(unsortedArray);

        int[] arr = {0, -1, -3, 5, 2, 10};
        int[][] doubleArray = new int[10][10];
        int[][] arrayToWrite = {
                {10, 3, 6, 7}, {2, 5, 6, 8},
                {5, 9, 6, 20}, {90, 80, 100, 1}
        };

        for (int row = 0; row < arrayToWrite.length; row++) {
            for (int column = 0; column < arrayToWrite.length; column++) {
                System.out.print(arrayToWrite[column][row] + " ");
            }
            System.out.print("\n");
        }


        for (int j = 0; j <= sorted.length - 1; j++) {
            System.out.print(sorted[j] + "  ");

            System.out.println(Arrays.toString(sorted));
        }
    }

        public static int[] bubbleSort ( int[] unsortedArray){
            for (int i = 0; i < unsortedArray.length; i++) {
                for (int j = i + 1; j < unsortedArray.length; j++) {
                    if (unsortedArray[i] > unsortedArray[j]) {
                        int tem = unsortedArray[i];
                        unsortedArray[i] = unsortedArray[j];
                        unsortedArray[j] = tem;
                    }
                }
            }
            return unsortedArray;
        }


}
