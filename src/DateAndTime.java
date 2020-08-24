import java.time.LocalDateTime;
import java.time.Month;

public class DateAndTime {
public static void main(String[]args) {
    int hour = getHour();
    System.out.println("The current hour is " + hour);
    int minute = getMinute();
    System.out.println("The current minute is " + minute);
    int day = getDay();
    System.out.println("The current day is " + day);
    Month month = getMonth();
    System.out.println("The current month is " + month);
    int year = getYear();
    System.out.println("The current year is " + year);

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
    public static int getDay() {
        int dayOfTheMonth;

        LocalDateTime now = LocalDateTime.now();
        dayOfTheMonth = now.getDayOfMonth();

        return dayOfTheMonth;
    }
    public static Month getMonth() {
        Month monthOfTheYear;

        LocalDateTime now = LocalDateTime.now();
        monthOfTheYear = now.getMonth();

        return monthOfTheYear;
    }
    public static int getYear() {
        int theYear;

        LocalDateTime now = LocalDateTime.now();
        theYear = now.getYear();

        return theYear;
    }
        }

