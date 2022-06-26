class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        sum = 0;
        sums = [];
        for num in nums:
            sum += num
            sums.append(sum)
        return sums