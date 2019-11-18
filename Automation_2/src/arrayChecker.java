import java.sql.SQLOutput;

public class arrayChecker {
    public static void main(String[] args) {
       printIndexByValue(40);

    }

    public static void printIndexByValue(int arrayItem) {
        int[] arrayNum = { 10, 20, 30, 40, 50 };
        for(int index = 0; index<=arrayNum.length-1; index++) {
            if(arrayNum[index]==arrayItem) {
                System.out.println("Number is found! Index is: " +index);
                break;
            } else {
                System.out.println("Number is not found!");
            }
        }
    }
}
