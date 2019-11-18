package Homework1;

public class Calculator {

    public static void main(String[] args) {
        int operand1 = 50;
        int operand2 = 10;

        int sum = sum(operand1, operand2);
        System.out.println("Суммирование чисел с использованием метода sum(): " +sum);

        int minus = minus(operand1, operand2);
        System.out.println("Разница чисел с использованием метода minus(): " +minus);

        int divide = divide(operand1, operand2);
        System.out.println("Деление чисел с использованием метода divide() " +divide);

        int multiplication = multiplication(operand1,operand2);
        System.out.println("Умножение чисел с использованием метода multiplication() " + multiplication);
    }

    public static int  sum(int operand1, int operand2) {
        int result = operand1 + operand2;
        return result;
    }

    public static int minus(int operand1, int operand2) {
        int result = operand1 - operand2;
        return result;

    }

    public static int divide(int operand1, int operand2) {
        if(operand2 == 0) {
            System.out.println("Divide by zero is forbidden!");
            return 0;
        } else {
            return operand1/operand2;
        }
    }
    public static int multiplication(int operand1, int operand2) {
        int result = operand1 * operand2;
        return result;
    }

}
