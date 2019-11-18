package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class arrayConsoleWriter {
    public static void main(String[] args) {
       // writeArrayFromConsole();
        writeArrayWithRandom();

    }

    public static void writeArrayWithRandom() {
        int[] array = new int[10];
        Random random = new Random();
        for(int i=0; i<=array.length-1;i++) {
            array[i] = random.nextInt(10);
        }

            for(int arrayIndex=0; arrayIndex<=array.length-1; arrayIndex++) {
                System.out.println(array[arrayIndex]);

            }
        }

    public static void writeArrayFromConsole() {
        int[] array = new int[10];
        System.out.println("Enter first number: ");
        Scanner scanner = new Scanner(System.in); //for data entering using keyboard
        int index = 0;

        while(scanner.hasNext() && index <= array.length-1 ) {
            array[index] = scanner.nextInt();
            index++;
        }
       for(int arrayIndex=0; arrayIndex<=array.length-1; arrayIndex++) {
           System.out.println(array[arrayIndex]);

       }
    }
}
