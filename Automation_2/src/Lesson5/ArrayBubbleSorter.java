public class ArrayBubbleSorter {

    public static void main(String[] args) {
        int[] unsortedArray = {0, -1, -3, 5, 2, 10};
        int[] sorted = bubbleSort(unsortedArray);
        doubleArrays();
    }

    public static void doubleArrays() {
        int[] arr = {10, 130, 40, 50, 60};
        int[][] doubleArray = new int[10][10];
        int[][] arrayToWrite = {
                {10, 3, 6, 7}, {2, 5, 6, 8},
                {5, 9, 6, 20}, {90, 80, 100, 1}
        };

        for (int row = 0; row < arrayToWrite.length; row++) {
            for(int col = 0; col < arrayToWrite.length; col++) {
                System.out.print(arrayToWrite[row][col] + " ");
            }
            System.out.print("\n");
        }
    }

    public static int[] bubbleSort(int[] unsortedArray) {
        for(int i = 0; i < unsortedArray.length; i++) {
            for(int j = i + 1; j < unsortedArray.length; j++) {
                if(unsortedArray[i] > unsortedArray[j]) {
                    int temp = unsortedArray[i];
                    unsortedArray[i] = unsortedArray[j];
                    unsortedArray[j] = temp;
                }
            }
        }
        return unsortedArray;
    }

}
