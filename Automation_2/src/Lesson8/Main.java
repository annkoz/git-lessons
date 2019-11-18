package Lesson8;

public class Main {
    public static void main(String[] args) {

   //    Box heavyBox = new HeavyBox(10,10);
   //   heavyBox.printBoxProperties();

      LightBox lightBox = new LightBox();
      lightBox.printProperties();

      HeavyBox heavyBox = new HeavyBox(10,10);
      heavyBox.printProperties();

      heavyBox.printOpeProperty();
    }
}
