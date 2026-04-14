class Solution {
    public boolean isValid(String s) {
        List<Character> list = new ArrayList<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                list.add(ch);
            } else {
                if (list.size() == 0) return false;
                char lastEl = list.get(list.size() - 1);
                list.remove(list.size() - 1);
                if (check(ch, lastEl)) continue;
                else return false;
            }
        }
        return list.size() == 0;
    }

    boolean check(char el, char lastEl) {
        if (el == ')' && lastEl == '(') return true;
        if (el == '}' && lastEl == '{') return true;
        if (el == ']' && lastEl == '[') return true;
        return false;
    }
}
