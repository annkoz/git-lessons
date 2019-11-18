package Homework4;

public class arrayWithoutRest {
    public static void main(String[] args) {
        int[] array = {1, 8, 3, 4, 2, 10, 7};
        arrayCreation(array);
    }

    public static void arrayCreation(int[] array) {

        System.out.println("Array is:");
        for (int index = 0; index <= array.length - 1; index++) {
            System.out.print(array[index] + " ");
        }

        System.out.println("\nEven numbers are:");
        for (int indexEven = 0; indexEven <= array.length - 1; indexEven++) {
            if (array[indexEven] % 2 == 0) {
                System.out.print(array[indexEven] + " ");
            }
        }
    }
}
