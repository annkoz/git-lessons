package Homework3;

public class WhileArray {
    public static void main(String[] args) {
        int[] array = {1,2,3};
        int index = 0;

        System.out.print("Array with using While loop: ");

        while(true) {
            if(index>array.length-1) {
                break;
            } else {
                System.out.print(array[index]);
                index ++;
            }
        }

    }
}
