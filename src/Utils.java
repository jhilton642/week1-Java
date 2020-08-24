import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Scanner;

public class Utils {

    static Scanner sc = new Scanner((System.in));

    /**
     * 		getInput	-	Prompt the user to type something in the console window
     * @param prompt		String - The message telling the user what to enter
     * @return				String - The users response
     */
    public static String getInput(String prompt) {
        String response;					//	will hold the response from the user
        System.out.print(prompt);			//	hey user - give me some information
        response = sc.nextLine();			//	I will wait here until you type something
        return response;					//	much thanks I will return this to the calling method
    }

    /**
     * 	getNumber		-	Prompt the user to respond with a number
     * @param prompt		String - The message telling the user what to enter
     * @return				int - The users response converted to a number
     */
    public static int getNumber(String prompt) {
        int number = 0;							//	will hold the numeric response from the user
        String response;						//	the String user response that needs to be converted to a number
        do {									//	infinite do-while until the user enters a number
            response = getInput(prompt);		//	ask user for a response
            try {								//	protect the code from dieing if we don't get a number from the user
                number = Integer.parseInt(response);	//	convert to a number
                break;							//	Yay! The user gave us a valid number
            } catch (NumberFormatException e) {			//	bad news. We did not get a number
                System.out.println( response + " Is not a number");		//	warn the user and continue prompting
            }
        } while(true);							//	stay in the loop until we get a number from the user
        return number;							//	yes this could go after the parseInt, I like all methods to end at the bottom
    }

    /**
     * 	getNumber		-	Prompt the user to respond with a number
     * @param prompt		String - The message telling the user what to enter
     * @return				int - The users response converted to a number
     */
    public static double getDouble(String prompt) {
        double number = 0;							//	will hold the numeric response from the user
        String response;						//	the String user response that needs to be converted to a number
        do {									//	infinite do-while until the user enters a number
            response = getInput(prompt);		//	ask user for a response
            try {								//	protect the code from dieing if we don't get a number from the user
                number = Double.parseDouble(response);	//	convert to a number
                break;							//	Yay! The user gave us a valid number
            } catch (NumberFormatException e) {			//	bad news. We did not get a number
                System.out.println( response + " Is not a number");		//	warn the user and continue prompting
            }
        } while(true);							//	stay in the loop until we get a number from the user
        return number;							//	yes this could go after the parseDouble, I like all methods to end at the bottom
    }

    /**
     *
     * 	getNumber		-	Prompt the user to respond with a number less than or equal to max
     * @param prompt		String - The message telling the user what to enter
     * @param max			int - max number the user can enter
     * @return				int - The users response converted to a number
     */
    public static int getNumber(String prompt, int max) {
        int number = 0;							//	will hold the numeric response from the user
        do {									//	infinite do-while until the user enters a number
            number = getNumber(prompt);			//	ask user for a response
        } while (number < 0 || number > max);	//	stay at it until the user enters a proper number
        return number;							//	yay, we have our number
    }

    /**
     * 	getIntArray
     * 		Create an integer array with 10-30 elements and fill it with random numbers between 0 and 100
     *
     * @return	an int array of random numbers
     */
    public static int[] getIntArray() {
        int size = (int) (Math.random() * 20) + 10;
        int[] randomNumbers = new int[size];
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = (int) (Math.random() * 100);
        }
        return randomNumbers;
    }

    /**
     * 	getStrArray
     * 		Create a String array with 10-30 elements and fill it with random Strings between A-Z, a-z, 0-9
     *
     * @return	an int array of random numbers
     */
    public static String[] getStrArray() {
        int size = (int) (Math.random() * 20) + 10;
        String[] randomStrings = new String[size];
        for (int i = 0; i < randomStrings.length; i++) {
            randomStrings[i] = getRandomString();
        }
        return randomStrings;
    }

    /**
     * 	getRandomString
     * 			Create a random sized string between 1 and 20 characters long
     */
    public static String getRandomString() {
        String src = "abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String str = "";

        int size = (int) (Math.random() * 20) + 1;
        for (int i = 0; i < size; i++) {
            str += src.charAt((int)(Math.random() * 62));
        }

        return str;
    }

    public static void main(String[] args) {
        int max, number;
        do {
            max = getNumber("Enter Maximum number: ");						//	ask user for a maximum number
            number = getNumber("Enter a number <= to " + max + ": ", max);	//	test code to see if we can only enter numbers < max
            //	yay, here is the users response
            System.out.println("User entered: " + number + " which is less than " + max);
        }	while (number != 0);
    }

    public static String readFile(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }
}