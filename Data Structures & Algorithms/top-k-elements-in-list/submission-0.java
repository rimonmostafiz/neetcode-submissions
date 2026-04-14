class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> fMap = new HashMap<>();
        Arrays.stream(nums).forEach(num -> fMap.merge(num, 1, (oldValue, newValue) -> oldValue + 1));
        ArrayList<ArrayList<Integer>> listOfList = new ArrayList<>();
        for(int i = 0; i <= nums.length; i++) {
            listOfList.add(new ArrayList<Integer>());
        }
        fMap.forEach((key, value) -> {
            listOfList.get(value).add(key);
        });
        int[] res = new int[k];
        int cnt = 0;
        for (int i = nums.length; i >= 0 && cnt != k; i--) {
            // System.out.println(i);
            for (int n : listOfList.get(i)) {
                res[cnt++] = n;
                if (cnt == k) break;
            }
        }
        return res;
    }
}
