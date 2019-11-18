package Lesson5;

public class wordsCount {
    public static void main(String[] args) {
        int wordsCount = getWordsCount();
        System.out.println("Count of words is:" + wordsCount);
    }

    public static int getWordsCount() {

        int count = 0;
        String[] sentences = {"Аня любит,джаву!",
                "Женя сделал.домашку!",
                "Денис мучает студентов!"
        };

        for (String item : sentences) {
            String[] wordsArray = item.split(",");
            count += wordsArray.length; //Count = count + wordsArray.length
        }
        return count;
    }
}

      /*      char[] char
            for (int index = 0; index < chars.length; index++) {
                System.out.println("Char is: " +chars[index]);
        }

       */


