public class Variables2 {
    public static void main(String[] args) {
        byte totalKids = 0;
                short moneyInWallet = 60;
        double incomeLastYear = 37_052.48;
        String lastName = "Hilton";
        char middleInitial ='E';
        String firstName = "Josh";
        boolean isTired = true;
        float changeInRoom = 5.67f;
        double moneyInBank = 68_435.87;
        double day1 = 1000.76, day2 = 1100.87, day3=1560.78, day4=900.38;
        double weekProfit =  (day1 + day2 + day3 + day4 );
        double financialBalance = (weekProfit + moneyInBank + moneyInWallet + changeInRoom);
                System.out.println("My name is " + firstName + " " + middleInitial + " " + lastName);
        int x = (int)(Math.random()*100);
System.out.println("My income last year was " + incomeLastYear + ". My income this week was " + weekProfit + ". I have $" + moneyInBank + "in my bank.");
System.out.println("My total financial balance is " + financialBalance);
System.out.println("I am feeling tired today  : " + isTired );
System.out.println("The random number of the day is " + x);



    }
}
