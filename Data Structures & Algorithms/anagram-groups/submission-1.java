class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String st : strs) {
            int[] freq = new int[26];
            for (int j = 0; j < st.length(); j++) {
                freq[st.charAt(j) - 'a']++;
            }
            String key = Arrays.toString(freq);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(st);
        }

        return new ArrayList<>(map.values());
    }
}
