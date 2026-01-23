public class leetcodeTwoSeven
{
    public static void main(String[] args)
    {
        int nums[]={0,1,2,2,3,0,4,2};
        int val = 2;
        Solution sol = new Solution();
        System.out.println(sol.removeElement(nums,val));
        for(int n : nums){
            System.out.print(n+ " ");
        }
    }
}

class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        int i = 0;
        int nums2[] = new int[nums.length];
        for(int k=0;k<nums.length;k++)
        {
            if(nums[k]==val){
                count++;
            }else{
                nums2[i]=nums[k];
                i++;
            }
        }
        for(int j=0;j<nums2.length;j++)
        {
            nums[j]=nums2[j];
        }

        
    return nums.length - count;
    }
}