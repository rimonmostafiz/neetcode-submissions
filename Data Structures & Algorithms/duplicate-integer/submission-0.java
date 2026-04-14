class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int item : nums) {
            int count = countMap.getOrDefault(item, 0);
            if (count == 1) return true;
            else {
                countMap.put(item, count  + 1);
            }
        };
        return false;
    }
}
