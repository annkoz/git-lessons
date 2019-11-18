package Homework4;

import java.util.Random;
import java.util.Scanner;

public class gameDoWhile {
    public static void main(String[] args) {
        guessNumber();
    }

    public static void guessNumber() {
        Random random = new Random();
        int Number = random.nextInt(5);

        Scanner scanner;

        do {
            System.out.println("Enter the number:");
            scanner = new Scanner(System.in);
         //   System.out.println(Number);
        }
            while (Number != scanner.nextInt());
            System.out.println("Winner");
        }
    }

