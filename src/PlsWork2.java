
import java.util.Scanner;
public class  PlsWork2 {
    public static void main (String [] args)  {
        try (Scanner scanner = new Scanner(System.in))  {
            System.out.println ("What is your name? : ");
            String name = scanner.next();
            System.out.println("what is your age?  :");
            int age = scanner.nextInt();
            System.out.println("What is the name of your hometown?  :");
            String hometown = scanner.next();
            System.out.println("My name is " + name + ". I am " + age + " years old. I am from " + hometown);
        }
        catch(Exception e ){
            System.out.println("Bad input");
            System.out.println("e = " + e);
        }
    }
}
