package CoreJava;
import java.util.*;


public class FindPowers78 {
    static ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
    static void main() {
        int[] grr = {1,2,3};
        ArrayList<Integer> ans = new ArrayList<>();
        helper(0,grr,ans);

        for (ArrayList<Integer> ele : arr) {
            for (int j : ele) {
                System.out.print(j );
            }
            System.out.println();
        }

    }

    static void helper(int i,int[] nums,ArrayList<Integer> ans ){
        if(i==nums.length){
            arr.add(new ArrayList<>(ans));
            return;
        }
        helper(i+1,nums,ans);
        ans.add(nums[i]);
        helper(i+1,nums,ans);
        if(ans.size()>0){
            ans.remove(ans.size() - 1);
        }

        return;
    }

}
