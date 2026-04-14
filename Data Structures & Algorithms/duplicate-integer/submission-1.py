class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        unique_list = list(set(nums))
        return len(unique_list) != len(nums)
         