package Homework3;

public class findMax {
    public static void main(String[] args) {
        int[] array = {1, 4, 2};
        findMax(array);

    }

    public static void findMax(int[] array) {
        System.out.println("Array is: ");
        for (int index = 0; index <= array.length - 1; index++) {
            System.out.print(array[index] + " ");
        }

        int max = array[0];
        for(int index = 0; index <= array.length - 1; index++) {
            if (array[index] > max) {
                max = array[index];
            }
        }
        System.out.println("\nMAX number is: " +max);
    }
}
