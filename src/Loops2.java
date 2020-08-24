import javax.lang.model.SourceVersion;

public class Loops2 {
    public static void main(String[] args) {
        int[] numbers = {33, 2, 4, 432, 6, 63, 4, 56, 8, 8, 8, 8, 6, 76, 576, 8576, 4, 5678, 58, 5, 45, 456, 4, 1, 28, 28, 839, 326, 215, 278, 3};
        String str = "Bob,Carroll,Bill,Ted,Alice,Hal,Dave,Billy,Jake,Sam,Joseph,Phil,Garth,Mark,Craig,Cathy,Barb,Adele,Julie";
        String strStates = "Alabama,Alaska,Arizona,Arkansas,California,Colorado,Connecticut,Delaware,Florida,Georgia,Hawaii,Idaho,Illinois,Indiana,Iowa,Kansas,Kentucky,Louisiana,Maine,Maryland,Massachusetts,Michigan,Minnesota,Mississippi,Missouri,Montana,Nebraska,Nevada,New Hampshire,New Jersey,New Mexico,New York,North Carolina,North Dakota,Ohio,Oklahoma,Oregon,Pennsylvania,Rhode Island,South Carolina,South Dakota,Tennessee,Texas,Utah,Vermont,Virginia,Washington,West Virginia,Wisconsin,Wyoming";

        String[] names = str.split(",");
        String[] stateNames = strStates.split(",");

        //  how many 4s
        //  how many numbers evenly divisible by 7
        //  add up all numbers that are greater than 300
        //  count numbers less than 100
        //add the numbers between 30 and 99
        int count4s = 0;
        int divisible7 = 0;
        int over300Total = 0;
        int lessThan100 = 0;
        int totalBetween30And99 = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 4) {
                count4s++;
            }
            if (numbers[i] % 7 == 0) {
                divisible7++;
            }
            if (numbers[i] > 300) {
                over300Total = over300Total + numbers[i];
            }
            if (numbers[i] < 100) {
                lessThan100++;
            }
            if (numbers[i] > 30 && numbers[i] < 99) {
                totalBetween30And99 = totalBetween30And99 + numbers[i];
            }

        }
        System.out.printf("There are %d 4s%n", count4s);
        System.out.println("There are " + divisible7 + " numbers divisible by 7");
        System.out.println("The total of all the numbers greater than 300 is: " + over300Total);
        System.out.println("There are " + lessThan100 + " numbers less than 100");
        System.out.println("The total of the numbers between 30 and 99 is: " + totalBetween30And99);
        //  how many names are longer than 4
        //  how many names have 'a' as their second letter (Carroll, Hal,, Dave.......)
        //  have many names end with 'e'
        //  how many names contain an 'h'
        int longerThan4 = 0;
        int namesWithASecond = 0;
        int namesEndWithE = 0;
        int containsH = 0;
        for (var name : names) {
            if (name.startsWith("B")) {
                System.out.println("name with a 'B' = " + name);
            }
            if (name.length() > 4) {
                longerThan4++;
            }
            if (name.charAt(1) == 'a') {
                namesWithASecond++;
            }
            if (name.endsWith("e")) {
                namesEndWithE++;
            }
            if (name.contains("h")) {
                containsH++;
            }

        }
        System.out.println("There are " + longerThan4 + " names longer than 4 characters");
        System.out.println("There are " + namesWithASecond + " names with 'a' as the second letter");
        System.out.println("There are " + namesEndWithE + " names that end with 'e'");
        System.out.println("There are " + containsH + " names that contain 'h'");
        System.out.println();
        System.out.println();
        //  how many states start with 'New'
        //  how many states are longer than 8 characters
        //  what states contain 'ss'
        //  what is the shortest name for a state
        int statesStartWithNew = 0;
        int statesLongerThan8Characters = 0;
        int statesContainDoubleS = 0;
        String shortestName = stateNames[0];
        for (var stateName : stateNames) {
            if (stateName.startsWith("New")) {
                statesStartWithNew++;
            }
            if (stateName.length() > 8) {
                statesLongerThan8Characters++;
            }
            if (stateName.contains("ss")) {
                statesContainDoubleS++;
            }
            if (stateName.length() < shortestName.length()) {
                shortestName = stateName;
            }
        }
        System.out.println("There are " + statesStartWithNew + " states that start with \"new\"");
        System.out.println("There are " + statesLongerThan8Characters + " states longer than 8 characters");
        System.out.println("There are " + statesContainDoubleS + " states that contain \"ss\"");
        System.out.println("The shortest name for a state is \"" + shortestName + "\"");
    }
}