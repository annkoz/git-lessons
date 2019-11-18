
package Lesson6;

public class personInfo {
    public static void main(String[] args) {

        Person sveta = new Person("Sveta", "Volkova", 21);
        sveta.printPersonInfo();


        Person veronika = new Person("Veronika", "Volkova", 21);
        veronika.printPersonInfo();

        Person Roman = new Person("Roman", "Popov");
        Roman.printPersonInfo();

        Person denys = new Person();
        denys.setAge(21);
        denys.setName("Denys");
        denys.setLastname("Shcherbina");

        Person denys_1 = new Person();
        denys.setAge(21);
        denys.setName("Denys");
        denys.setLastname("Shcherbina");

        System.out.println("Result of comparison is: " + denys_1.equals(denys));

     //   System.out.println(denys.getName() + " " + denys.getAge() + " " + denys.getLastname());
     //   System.out.println("ToString() => " +denys.toString());

    }

}

