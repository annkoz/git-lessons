package Lesson6;

public class Main {

    public static void main(String[] args) {
        B class_1 = new A(); //because we have extends
     //   A class_2 = new B(); - от чайлда не может исходить папа
        class_1.printName();
    }
}
