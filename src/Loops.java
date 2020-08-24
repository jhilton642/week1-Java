
public class Loops {
    public static void main(String[] args) {
          //for (int i = 100; i > 0; i--)
       //    System.out.println(i);
        //   for (int i = 5; i > 0; i--)
        //    System.out.println(i);
        //   for (int i = 120; i < 130; i++)
        //    System.out.println(i);
       //  for (int i = 0; i > -10; i--)
       //   System.out.println(i);
       //    for (int i = 10; i > 5; i--)
       //      System.out.println(i);
      //     for (int i = 15; i < 20; i++)
      //        System.out.println(i);
    //     for (int i = 11; i > 0; i--)
        //      System.out.println(i);
       //   for (int i = 16; i >= 0; i--)
       //      System.out.println(i);
       //  for (int i = 36; i < 50; i++)
       //   System.out.println(i);
       //  for (int i = 59; i < 69; i++)
      //        System.out.println(i);
        int[] nums = {6, 12, 16, 12};
        float sum = 0;
        for (int item : nums) {
            System.out.println(item);
            sum +=item;


        }
        System.out.println(sum);
        System.out.println(sum/nums.length);
        String[]  words = {"Hello world", "My name is Josh", "I am leaning coding, slowly, but surely"};
        for (String item : words){
            System.out.println(item);
        }
    }
}
