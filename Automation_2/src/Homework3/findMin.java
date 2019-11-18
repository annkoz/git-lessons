package Homework3;

public class findMin {
    public static void main(String[] args) {
        int[] arr = {7, 8, 1};
        showArray(arr);
    }

    public static void showArray(int[] arr) {
        System.out.println("Array is: ");
        for (int index = 0; index <= arr.length - 1; index++) {
            System.out.print(arr[index] + " ");
        }

        int min = arr[0];
        for (int index = 0; index <= arr.length - 1; index++) {

            if (arr[index] < min) {
            min = arr[index];
            }
        }
       System.out.println("\nMinimal number is:" + min);
    }
}
