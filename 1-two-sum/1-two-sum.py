class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        d = {};
        for i in range(len(nums)):
            n = nums[i]
            if d.get(target-n, None) is not None:
                return [i, d.get(target-n)]
            else:
                d[n] = i