package CoreJava;

public class MaxAvg643 {
    static void main() {
        int[] arr = {1,12,-5,-6,50,3 };
        System.out.println(findMaxAverage(arr,4));
    }
    public static double findMaxAverage(int[] nums, int k) {
        int windowStart = 0;
        double sum = 0;
        double maxAvg = Integer.MIN_VALUE;
        for(int windowEnd = 0; windowEnd <nums.length; windowEnd++){
            sum += nums[windowEnd];
            if(windowEnd >= k-1){
                if(sum/k > maxAvg){
                    maxAvg = sum/k;
                }
                sum -= nums[windowStart];
                windowStart++;
            }

        }
        return maxAvg;
    }
}
