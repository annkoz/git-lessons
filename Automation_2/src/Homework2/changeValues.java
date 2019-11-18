package Homework2;

import java.sql.SQLOutput;

public class changeValues {
    public static void main(String[] args) {
         int i = 10;
         int j  = 20;
        System.out.println("first number:" +i);
        System.out.println("second number:" +j);
         int k = i;
         i = j;
         j = k;
        System.out.println("first number UPD:" +i);
        System.out.println("second number UPD:" +j);
    }
}
