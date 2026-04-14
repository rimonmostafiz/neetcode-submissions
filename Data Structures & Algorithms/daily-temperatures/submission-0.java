class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<int[]> stack = new Stack<>();
        int[] res = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            int val = temperatures[i];
            if (stack.isEmpty() || val <= stack.peek()[0]) {
                stack.push(new int[]{val, i});
            } else {
                while (!stack.isEmpty() && stack.peek()[0] < val) {
                    int[] pair = stack.pop();
                    res[pair[1]] = i - pair[1];
                }
                stack.push(new int[]{val, i});
            }
        }
        while (!stack.isEmpty()) {
            int pair[] = stack.pop();
            res[pair[1]] = 0;
        }

        return res;
    }
}
