package Homework2;

public class arrayFilling {
    public static void main(String[] args) {
        int[] emptyArray = new int[3];
        fillArray(emptyArray,10);
        showArray(emptyArray);
    }

        public static void fillArray(int[] emptyArray,int numberArray) {
       //     emptyArray[0] = numberArray;
        //    emptyArray[1] = numberArray;
         //   emptyArray[2] = numberArray;

            for(int index = 0; index<=emptyArray.length-1;index++) {
                emptyArray[index] = numberArray;
            }
    }

          public static void showArray(int[] emptyArray) {
        for(int index=0;index<=emptyArray.length-1;index++)
        System.out.println(emptyArray[index]);
    }

        }


