package Homework4;

public class MultiplicationTable {
    public static void main(String[] args) {
        multiTable();

    }

    public static void multiTable() {

        for (int i = 3; i <= 3; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(j + "     ");
                System.out.println(i * j + "    ");
            }
            System.out.println("      ");
        }
    }
}
