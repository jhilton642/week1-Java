
public class Notes {
    public static void main(String[] args) {
        String longStr = "This November is the election and it looks like it is going to be an interesting one";
        String shortStr = longStr.substring(0,13);
        System.out.println(shortStr);
        System.out.println("My String is " + longStr.length() + " characters long.");
        int x = 10;
        int remainder = x % 3;
        System.out.println("The remainder is " + remainder + ".");
        double amt = Utils.getDouble("Enter Loan Amt: ");
        double rate = Utils.getDouble("Enter Rate: ");
        int    periods = Utils.getNumber("Number of months: ");
        String loanAmt = computePayment(amt, rate,periods);
        System.out.println("Monthly loan payment: " + loanAmt);
    }
    public static String computePayment (double loanAmt, double rate, int numPeriods) { // if there is a return value the first thing you should do is create a variable that wi;ll hold your answer

        double futureValue = 0;
        double interest = rate / 100.0;
        double partial1 = Math.pow ( (1 + interest), -numPeriods);
        double denominator = (1 - partial1) / interest;
        double answer = (-loanAmt / denominator) - ( (futureValue * partial1) / denominator);
        answer = Math.abs(answer);
        return String.format("Your monthly payment will be roughly $%.2f", answer); //return has to be the last thing in the code
    }       //  end of computePayment

    }

