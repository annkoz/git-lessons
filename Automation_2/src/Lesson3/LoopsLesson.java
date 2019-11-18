package Lesson3;

public class LoopsLesson {

    public static void main(String[] args) {
        String[] strings = {"xxxx", "yyyy", "zzzz"};
        int[] array = new int[10];


        for(int index=0;index<=strings.length-1;index++) {
            System.out.println("String index:" +strings[index]);
        }

        System.out.println("ZYX\"0\"");
        System.out.println("ZYX\\gdgd");

        for(String item:strings) {
            System.out.println("String index:" +item);
        }

        int counterForBreak = 3;
        while(true) {
            if(counterForBreak == 0) {
               break;
            } else {
                System.out.println("xxx");
                counterForBreak --;
            }
        }

        int loopBreakCount = 0;
        do {
            System.out.println("Do while loop");
            loopBreakCount++;
        }
            while (loopBreakCount == 1) ;








        }
    }
