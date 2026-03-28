package CoreJava;

import java.util.Arrays;

public class MaximumGap164 {
    public static int maximumGap(int[] nums) {
        if (nums == null || nums.length == 0 || nums.length == 1) return 0;
        Arrays.sort(nums);
        int maxGap = Integer.MIN_VALUE;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                maxGap = Math.max(maxGap, nums[i] - nums[i - 1]);
            }
        }
        return maxGap;
    }
    static void main() {
        int [] arr = {3,6,9,1};
        System.out.println(maximumGap(arr));
    }
}
