package Homework3;

public class findSum {
    public static void main(String[] args) {
        int[] array = {1, 4, 6};
        findSum(array);
    }

    public static void findSum(int[] array) {
        System.out.println("Array is: ");
        for(int index=0;index<=array.length-1;index++) {
            System.out.print(array[index] + " ");
        }

        int sum = 0;
        for(int index=0;index<=array.length-1;index++) {
            sum = sum + array[index];
        }
        System.out.println("\nSUM is:" +sum);
    }
}
