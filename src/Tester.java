public class Tester {
    public static void main(String[] args) {
        Person me = new Person();
        me.setFirstName("Josh");
        me.isGender(false);
        me.setHeight(68);
System.out.println("me = " + me);
Person roomMate1 = new Person(65,false,"Luke","Johnson",null,160);
System.out.println("roommate 1 = " + roomMate1);
    }
}
