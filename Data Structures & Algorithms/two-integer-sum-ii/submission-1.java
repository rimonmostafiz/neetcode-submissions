class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                break;
            } else if (sum < target) {
                left++;
            } else if (sum > target) {
                right--;
            }
        }
        int[] result = {left+1, right+1};
        return result;
    }
}
