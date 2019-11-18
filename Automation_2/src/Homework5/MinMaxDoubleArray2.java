package Homework5;

public class MinMaxDoubleArray2 {
    public static void main(String[] args) {
        int[][] doubleArray = {
                {10, 4, 2, 6}, {3, 123, 2, 1}, {7, 9, 276, 411}, {0, 9, 3, 7}
        };
        minElement(doubleArray);
        maxElenent(doubleArray);
    }
    public static void minElement(int[][] doubleArray) {
        System.out.println("Array is:");
        for(int row=0; row < doubleArray.length; row++) {
            for(int column = 0; column < doubleArray.length; column++) {
                System.out.print(doubleArray[row][column] + "     ");
            }
            System.out.println("\n");
        }

        int min = doubleArray[0][0];
        for(int row=0; row < doubleArray.length; row++) {
            for(int column = 0; column < doubleArray.length; column++) {
                if(doubleArray[row][column] < min) {
                    min = doubleArray[row][column];
                }
            }
        }
        System.out.println("Min element is:" +min);
    }

    public static void maxElenent(int[][] doubleArray) {

        int max = doubleArray[0][0];
        for(int row = 0; row < doubleArray.length; row++) {
            for(int column = 0; column < doubleArray.length; column++) {
                if(doubleArray[row][column] > max) {
                    max = doubleArray[row][column];
                }
            }
        }
        System.out.println("Max element is:" +max);
    }
}
