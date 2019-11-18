
package Lesson6;


public class Person {

    //інкапсуляція
    private String name; //назив поле класа
    private String lastname;
    private int age;

   public Person(String name, String lastname, int age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
   }

   public Person() {

   }

   public void setName(String name) {
       this.name = name;
   }

   public void setLastname(String lastname) {
       this.lastname = lastname;
   }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

   public Person(String name, String lastname) {
       this.name = name;
       this.lastname = lastname;
   }

   public void printPersonInfo() {
       System.out.println("Name:" + name + " Lastname:" + lastname + " Age:" + age);
   }

   @Override
   public boolean equals(Object other) {
       Person otherPerson = (Person)other; //створили нову персону з якою будем порівнювати

       if(this!= otherPerson) {
            return false;
        }   else if(!this.name.equals(otherPerson.name)) {
            return false;
        }   else if(!this.lastname.equals(otherPerson.lastname)) {
            return false;
        }   else if(this.age != otherPerson.age) {
            return false;
        }   else {
            return true;
        }
   }

    @Override
    public String toString() {

       StringBuilder stringBuilder = new StringBuilder();
       stringBuilder.append("Person: ")
               .append("Age: ")
               .append(age)
               .append(" ")
               .append("Name: ")
               .append(name)
               .append(" ")
               .append("LastName: ")
               .append(lastname);
       return stringBuilder.toString();

     /*   return "Person: "
                + "Age = " + age  // 'Age' - конкатинация строки age
                + "Name = " + name
                + "LastName = " + lastname;

      */
    }
}


