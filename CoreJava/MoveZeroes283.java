package CoreJava;

public class MoveZeroes283 {
    static void main() {
        int[]nums = {0,1,0,3,12};
        int noOfZero=0;
        int n = nums.length;
        for(int ele : nums){
            if(ele==0) noOfZero++;
        }

        for (int i = 0; i <= noOfZero; i++) {
            for (int j = 0; j < n-1-i; j++) {
                if(nums[j]==0){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        for(int ele : nums){
            System.out.print(ele+" ");
        }
    }
}
