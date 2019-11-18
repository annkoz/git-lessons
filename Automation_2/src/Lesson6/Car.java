package Lesson6;

public class Car {
    public static void main(String[] args) {

        System.out.println("======= If construction =======");
        String someText = "111";

        if(someText.equals("222")) {
            System.out.println("True");
        } else if(someText.equals("XYZ1")) {
            System.out.println("False");
        } else {
            System.out.println("Incorrect string text present");
        }

        System.out.println("======= switch/case construction =======");
        switch (someText) {
            case "XYZ":
                System.out.println("True");
                break;
            case "XYZ1":
                System.out.println("False");
                break;
            default:
                System.out.println("Incorrect string text present");
        }

        System.out.println("====== const variables =======");
        printTwoNumbers(10,20);


    }
    public static void printTwoNumbers(final int a, final int b) {
        int a1 = a;
        int b1 = b;
        System.out.println("Var a:" + a + " Var b:" + b);
        System.out.println(a1);
        System.out.println(b1);
    }
}
