public class Code3{
   public static void main(String[] args) {
      String formattedStr = String.format("My name is %s and i'm %d years old", "Shubham", 25);
      System.out.println(formattedStr);

      String name = "Shubham Sharma";
      System.out.println(name.substring(2,8));
      System.out.println(name.subSequence(2,8 )); // both are same in java. continous substring
   }
}