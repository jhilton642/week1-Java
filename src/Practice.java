import com.sun.source.util.SourcePositions;

public class Practice {
    public static void main(String[] args) {
        int[] nums = {5, 17, 24, 5, 8, -3, 28};
        int min = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        int sum = 0;
        System.out.println("max= " + max);
        System.out.println("min= " + min);
        for (int item : nums) {
            sum += item;
        }
        System.out.println("Average = " + sum/nums.length);
    }
}