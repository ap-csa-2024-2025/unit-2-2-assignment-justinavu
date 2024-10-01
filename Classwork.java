import java.util.Scanner;

public class Classwork
{
  public static void main(String[] args)
  {
    rabbit();
    quote();
    shopping();
  }
  public static void shopping() {
    Scanner sc = new Scanner(System.in);
    System.out.println("What type of item are you buying?");
    String item = sc.nextLine();
    System.out.println("How many are you buying?");
    int num = sc.nextInt();
    System.out.println("How much does each one weigh?");
    double weight = sc.nextDouble();
    System.out.println(num + " " + item + " at " + weight + " each will weigh " + (num*weight) + " pounds total.");
  }
  public static void quote() {
    System.out.println("\"That brain of mine is something more than merely mortal; as time will show.\"\nAda Lovelace\nThe first computer program");
  }
  public static void rabbit() {
    System.out.println("(\\(\\");
    System.out.println("( - -)");
    System.out.println("((') (')");
  }
}
