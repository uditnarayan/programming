class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        for (int x : nums) totalSum += x;
        
        int leftSum = 0;
        for(int i = 0; i < nums.length; i++) {
            if(leftSum == totalSum - nums[i]) {
                return i;
            } else {
                leftSum += nums[i];
                totalSum -= nums[i];
            }
        }
        return -1;
    }
}