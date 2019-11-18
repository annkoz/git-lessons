package Homework5;

public class polindromArray {
    public static void main(String[] args) {
        int[] array = {1, 3, 3, 1};
        isPolindrom(array);
    }
    public static void isPolindrom(int[] array) {
        boolean isPalindrom = true;

        for(int index=0; index <= array.length-1; index++) {
              if (array[index] != array[array.length - 1 - index]) {
                  isPalindrom = false;
                  break;
              }
          }
          if(isPalindrom) {
              System.out.println("Polindrom!");
          } else {
              System.out.println("Not Polidrom!");
          }

      }
    }
