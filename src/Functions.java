
import java.time.LocalDateTime;

public class Functions {
    public static void main(String[] args) {
        String name = sayHello("Hello", "Gary James");
        System.out.println(name);
        name = sayHello("Hola", "Gulnar");
        System.out.println(name);
        String NGT = helloNameAndTime("Hello", "Josh Hilton");
        System.out.println(NGT);
    }

    public static int add2(int x, int y) {
        int ans;
        ans = x + y;
        return ans;
    }

    public static String sayHello(String x, String y) {
        String ans;
        ans = x + " " + y;
        return ans;

    }
    public static String helloNameAndTime(String greeting, String name){
        String ans;
        ans = greeting + " " + name + " the current time is " + getHour() + ":" + getMinute();
        return ans;
    }
    public static int getHour() {
        int hourOfTheDay;

        LocalDateTime now = LocalDateTime.now();
        hourOfTheDay = now.getHour();

        return hourOfTheDay;
    }
    public static int getMinute() {
        int minuteOfTheDay;

        LocalDateTime now = LocalDateTime.now();
        minuteOfTheDay = now.getMinute();

        return minuteOfTheDay;
    }
}
