public class Solution {
    public int maxSubArray(int[] nums) {
        int currentSubArraySum = nums[0];
        int maxSubArraySum = nums[0];
        for(int i = 1; i < nums.length; i++) {
            int n = nums[i];
            currentSubArraySum = Math.max(n, currentSubArraySum + n);
            maxSubArraySum = Math.max(maxSubArraySum, currentSubArraySum);
        }
        return maxSubArraySum;
    }
}
