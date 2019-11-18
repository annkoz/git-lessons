public class StringConventer {
    public static void main(String[] args) {
        String s1 = "My name is ";
        String s2 = "Anna";
        String fullText = s1 + s2; //конкатенция строк через знак +
        System.out.println(fullText);

        String fullName = "My name is [%s]"; //конкатенция строк через String.format()
        String formattedName = String.format(fullName, "Anna");
        System.out.println(formattedName);

        char[] chars = formattedName.toCharArray();
  for (int index = 0; index < chars.length; index++) {
             System.out.println("Char is: " +chars[index]);
        }
    }
}
