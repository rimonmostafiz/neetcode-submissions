class Solution {
    // public int countConsistentStrings(String allowed, String[] words) {
    //     Map<Character, Integer> allowedMap = new HashMap<>();
    //     for (char ch : allowed.toCharArray()) {
    //         allowedMap.merge(ch, 1, (oldVal, newVal) -> 1);
    //     }
    //     int result = 0;
    //     for (String s : words) {
    //         int cnt = 0;
    //         for (char ch : s.toCharArray()) {
    //             if (allowedMap.containsKey(ch)) cnt++;
    //             else break;
    //         }
    //         if (cnt == s.length()) result++;
    //     }
    //     return result;
    // }
    public int countConsistentStrings(String allowed, String[] words) {
        int[] allowedMap = new int[26];
        for (char ch : allowed.toCharArray()) {
            allowedMap[ch - 'a'] = 1;
        }
        int result = 0;
        for (String s : words) {
            int cnt = 0;
            for (char ch : s.toCharArray()) {
                if (allowedMap[ch - 'a'] == 1) cnt++;
                else break;
            }
            if (cnt == s.length()) result++;
        }
        return result;
    }
}