package Homework1;

public class Polidrom {

    public static void main(String[] args) {
        String polidromToCheck = "Anna";

        char[] polidromToCheckStringChars = polidromToCheck.toCharArray();
        for (int index = 0; index < polidromToCheck.length(); index++) {
            System.out.println("Char is: " +polidromToCheckStringChars [index]);
        }
    }
}

