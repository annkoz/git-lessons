package Homework5;

public class SumOfElements {
    public static void main(String[] args) {
        int[][] array =   {
                {10, 4, 2, 6}, {3, 123, 2, 1}, {7, 9, 276, 411}, {0, 9, 3, 7}
        };
      SumOfElements(array);
    }
    public static void SumOfElements(int[][] array) {

        System.out.println("Array is:");
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array.length; column++) {
                System.out.print(array[row][column] + "    ");
            }
            System.out.println("\n");
        }

        System.out.println("First row has the following elements:");
        int sum = 0;
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array.length; column++) {
                sum = sum + array[row][column];

            }
            System.out.println("Sum of row number " +row + " = " +sum);
            sum = 0;
        }

    }
}
