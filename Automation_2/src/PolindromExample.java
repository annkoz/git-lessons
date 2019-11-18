public class PolindromExample {

    public static void main(String[] args) {
        String verifyPolindrome = "man";
        char[] stringChars = verifyPolindrome.toCharArray();
        int stringCharsLen = stringChars.length;
        int arrayItem = 30;
        boolean isPalindrom = true;
        for(int index = 0; index <= stringCharsLen - 1; index++) {
            if (stringChars[index] != stringChars[stringCharsLen - 1 - index]) {
             isPalindrom = false;
             break;         //or return (only for void);
            }
        }
if(isPalindrom) {
    System.out.println("Polindrome!");
} else {
    System.out.println("Not Polidrome!");
}

//Foreach loop
        int[] arrayNum = {10,20,30,40,50};
        for (int item: arrayNum) {
        System.out.println("Item is:" +item);
}
    }
    }

