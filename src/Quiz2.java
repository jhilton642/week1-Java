
public class Quiz2 {
    public static void main(String[] args) {
String retire = sayHelloTo("Joshua Hilton", 2000, "Texas");
System.out.println(retire);
String test1 = mergeStrings(100,"-this is test 1");
System.out.println(test1);
String test2 = mergeStrings(123,666);
System.out.println(test2);
String test3 = mergeStrings(999,1111,"This is the last test");
System.out.println(test3);
    }
    public static String sayHelloTo(String name, int birthYear, String state){
        String ans;
        ans = "Hello " + name + ". " + "I see you will be 66 in " + (birthYear+66) + ". I hope you enjoy retirement in " + state + ".";
        return ans;
    }

    public static String mergeStrings(int number, String test) {
        String ans = number + test;
        return ans;
    }
    public static String mergeStrings(int number1, int number2) {
        String ans = number1 + "--" + number2;
        return ans;
    }
    public static String mergeStrings(int number1, int number2, String test) {
        String ans = number1 + "-" + number2 +"-" + test;
        return ans;
    }

}
