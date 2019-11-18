package Lesson9;

import java.util.Scanner;

public class Menu {

    public boolean isKeyInputValid(int key) {
        int[] menyKeys = {1, 2, 3, 4, 5, 6, 0};

        for (int index = 0; index <= menyKeys.length - 1; index++)
            if (menyKeys[index] == key) {
                return true;
            }
        return false;
    }


        public void printConsoleMenu() {
            System.out.println("Please choose your operation:");
            String[] menu = {
                    "1. SUM (a, b)",
                    "2. MINUS (a, b)",
                    "3. DIVIDE(a, b)",
                    "4. MULT(a, b)",
                    "5. MS",
                    "6. M+",
                    "7. M-",
                    "0. Exit"

            };
            for (String menuItem : menu) { //рахувати поки не закінчиться масив меню
                System.out.println(menuItem);
            }
        }
    }
