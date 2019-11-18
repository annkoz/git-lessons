package Lesson4;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class game {
    public static void main(String[] args) {

        guessNumber();
    }

    public static void guessNumber() {
        Random ramdom = new Random();
        int ComputerNumber = ramdom.nextInt(10);


        while(true) {
            System.out.println("Enter the number: ");
            Scanner scanner = new Scanner(System.in);

            if (ComputerNumber == scanner.nextInt()) {
                System.out.println("Lucky!");
                break;
            } else {
                System.out.println("Please try again!");
            }
        }
    }
}
