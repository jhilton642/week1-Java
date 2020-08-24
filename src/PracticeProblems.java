import com.sun.source.util.SourcePositions;

public class PracticeProblems {
    public static void main(String[] args) {
        int[] nums = {5, 17, 24, 5, 8, -3, 28, 59, -10};
        int max = getMax(nums);
        int min = getMin(nums);
        int secondMin = getSecondMin(nums);
        int secondMax = getSecondMax(nums);
        System.out.println("The largest number is: " + max);
        System.out.println("The second largest number is: " + secondMax);
        System.out.println("The smallest number is: " + min);
        System.out.println("The second smallest number is: " + secondMin);
    }

    public static int getMin(int[] nums) {
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        return min;

    }

    public static int getMax(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;

    }

    public static int getSecondMin(int[] nums) {
        int secondMin = nums[0];
        int smallest = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < smallest) {
                secondMin = smallest;
                smallest = nums[i];
            } else if (nums[i] < secondMin) {
                    secondMin = nums[i];
                }
            }
            return secondMin;
    }
    public static int getSecondMax(int[] nums) {
        int secondMax = nums[0];
        int largest = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > largest) {
                secondMax = largest;
                largest = nums[i];
            } else if (nums[i] > secondMax) {
                secondMax = nums[i];
            }
        }
        return secondMax;
    }
} //end of code
