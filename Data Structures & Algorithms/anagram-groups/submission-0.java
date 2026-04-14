class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String st : strs) {
            int[] freq = new int[26];

            for (int j = 0; j < st.length(); j++) {
                freq[st.charAt(j) - 'a']++;
            }

            String f = Arrays.toString(freq);

            if (map.containsKey(f)) {
                List<String> list = map.get(f);
                list.add(st);
                map.put(f, list);
            } else {
                List<String> list = new ArrayList<>();
                list.add(st);
                map.put(f, list);
            }
        }

        List<List<String>> results = new ArrayList<>();
        for (List<String> words : map.values()) {
            results.add(words);
        }
        return results;
    }
}
