package Homework5;

public class fillArrayFromMiddle {
    public static void main(String[] args) {
    int[] array = new int[10];
    fillArray(array);
    }

    public static void fillArray(int[] array) {
        System.out.print("Array is:");
        int mid = array.length/2;


        for(int index = mid; index >= 0; index--) {
            array[index] = index + 1;
        }

        for(int index = mid; index < array.length; index++) {
          array[index] = mid--;

      }
        System.out.println();
        for(int index = 0; index < array.length; index++) {
            System.out.print(array[index] + " ");
        }

    }



}
