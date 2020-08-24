public class BanchingStatements {
    public static void main(String[] args) {
        //iterate through the array of numbers to find a particular number
        //when you find the number stop searching
        int[] nums = {17,54,97,81,64,55,18,52,29,53};
        int numToFind = 97;
        boolean foundNumber = false;
        for(int i = 0; i<nums.length; i ++){
            System.out.println("looking at number" + nums[i]);
            if (numToFind == nums[i]) {
                foundNumber = true;
                System.out.println("found");
                break;
            }
        }
        if (foundNumber) {
            System.out.println("The number " + numToFind + " is in the array");
        } else {
            System.out.println("the number " + numToFind + " is not in the array");
        }
    }
}
//continue continues to the next item in the loop