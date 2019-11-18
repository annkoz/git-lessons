package Homework3;

public class InvertedArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        invertArrayFor(array);
        invertArrayWhile(array);

    }

        public static void invertArrayFor(int[] array) {
            System.out.println("Inverted array is (FOR loop):  ");

            for (int index = array.length - 1; index >= 0; index--) {
                System.out.print(array[index] + " ");
            }
        }

        public static void invertArrayWhile(int[] array) {
            System.out.println("\nInverted array is (WHILE loop):  ");

            int index = array.length-1;
                while(true) {
                    if(index<0) {
                        break;
                    } else {
                        System.out.print(array[index] + " ");
                        index --;
                    }
                }
        }

}
