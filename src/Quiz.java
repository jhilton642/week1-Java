public class Quiz {
    public static void main(String[] args) {
String zipCode = "76259";
int iZipCode = Integer.parseInt(zipCode); //convert string to int
 //math.ceil raises to next integer
 //Math.floor lowers to next integer
        //++ adds one
        // -- subtracts 1
        //   && logical and (if both are true)   ||logical or (if one is true)
        //   ! is the negation operator ex:!= not true
       // int x = 1;
        //System.out.println("printing x++ " + x++); // x is printed as 1 and then 1 is added
        //System.out.println(++x); //one is added before it prints 57

        if (13 < 12) {
            System.out.println("eleven is less than 12");
        } else {
            System.out.println("nope, sorry buddy");
        }
        //ternary operator
         //(conditional expression) ? true: false;
        int age = 16;
        System.out.println("this person is " + ((age<21)? "not old" : " old") + "enough to purchase alcohol");
        int age2 = 64;
        System.out.println("this person is " + ((age2 <50)? "still young" : "over the hill"));
        Double rent = 482.58;
        Double bankAcount = 600.78;
        System.out.println("I " + ((bankAcount >=rent)? "have enough money" : "don't have enough money ") + "to pay rent");
    }
}
//functions: public, private, package, protected
//doesn't ned class info: static.
// if the function doesn't return anything: Void else: int string boolean
//next: funcName ex getStudent, updateStatus