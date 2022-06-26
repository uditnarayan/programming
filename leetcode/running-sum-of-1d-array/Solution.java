public class Solution {
    public int[] runningSum(int[] nums) {
        int[] sums = new int[nums.length];
        if (nums == null || nums.length == 0) {
            return sums;
        }    
        
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            sums[i] = sum;
        }
        return sums;
    }
}