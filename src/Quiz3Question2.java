import java.util.Scanner;
public class Quiz3Question2 {
    public static void main(String[] args) {
        try {
            Scanner getDay = new Scanner(System.in);
            System.out.println("Name a day of the week");
            String dayOfWeek = getDay.nextLine();
            int number;
            number = dayToNum(dayOfWeek);
            System.out.println(dayOfWeek + " is day " + number);
        }
        catch (Exception e){
            System.out.println("Bad input");
        }
    }
    public static int dayToNum(String dayOfWeek) {
        int numberDay = 0;
            switch (dayOfWeek) {
                case "Monday":
                case "Mon":
                case "monday":
                case "mon":
                    numberDay = 1;
                    break;
            }
            switch (dayOfWeek) {
                case "Tuesday":
                case "Tues":
                case "tuesday":
                case "tues":
                    numberDay = 2;
                    break;
            }
            switch (dayOfWeek) {
                case "Wednesday":
                case "Wed":
                case "wednesday":
                case "wed":
                    numberDay = 3;
                    break;
            }
            switch (dayOfWeek) {
                case "Thursday":
                case "Thurs":
                case "thursday":
                case "thur":
                    numberDay = 4;
                    break;
            }
            switch (dayOfWeek) {
                case "Friday":
                case "Fri":
                case "friday":
                case "fri":
                    numberDay = 5;
                    break;
            }
            switch (dayOfWeek) {
                case "Saturday":
                case "Sat":
                case "saturday":
                case "sat":
                    numberDay = 6;
                    break;
            }
            switch (dayOfWeek) {
                case "Sunday":
                case "Sun":
                case "sunday":
                case "sun":
                    numberDay = 0;
                    break;
            }
            return numberDay;
        }
    }



