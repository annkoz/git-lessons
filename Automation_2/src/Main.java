public class Main {

    public static void main(String[] args) { //arg[0] - C://1.txt args[1] - C://2.txt arg[2] - C://3.txt

        System.out.println("=========== Сумма чисел =============");
        int operand1 = 10; //создали переменную типа int с именем operand1 и проинициальзировали числом 10
        int operand2 = 20; //создали переменную типа int с именем operand2 и проинициальзировали числом 20
        int sumResult = operand1 + operand2; //создали переменную типа int с именем sumResult и присвоили ей сумму двух переменных

        System.out.print("Сумма чисел " + sumResult); //выводит в одну строку

        System.out.println("Сумма чисел " + sumResult); //выводит с переносом строк

        System.out.println("========== Разница чисел =========");
        int minusOperand1 = 30;
        int minusOperand2 = 10;
        int minusResult = minusOperand1 - minusOperand2;
        System.out.println("Разница чисел: " + minusResult);

        System.out.println("============== Умножение чисел ==============");
        operand1 = 50;
        operand2 = 2;
        int result = operand1 * operand2;
        System.out.println("Умножение чисел: " + result);

        System.out.println("========= Деление чисел ===========");
        int operand3 = 25;
        int operand4 = 5;
        int divideResult = operand3/operand4;
        System.out.println("Деление чисел: " + divideResult);

        System.out.println("=========== Суммирование чисел с использованием метода =============");
        int sum = sum(operand1, operand2);
        System.out.println("Суммирование чисел с использованием метода sum(): " +sum);
        int minus = minus(operand1, operand2);
        System.out.println("Разница чисел с использованием метода minus(): " +minus);
        int divide = divide(10, 20);
        System.out.println("Деление чисел с использованием метода divide() " +divide);
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
}
