class MinStack {

    List<Integer> stk;
    List<Integer> minStk;
    int min;

    public MinStack() {
        this.stk = new ArrayList<>();
        this.minStk = new ArrayList<>();
        this.min = Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        stk.add(val);
        if (val <= min) {
            minStk.add(val);
            min = val;
        }
    }
    
    public void pop() {
        int val = stk.get(stk.size() - 1);
        stk.remove(stk.size() - 1);
        if (val == min) {
            minStk.remove(minStk.size() - 1);
            if (minStk.size() != 0) {
                min = minStk.get(minStk.size() - 1);
            } else {
                min = Integer.MAX_VALUE;
            }
        }
    }
    
    public int top() {
        return stk.get(stk.size() - 1);
    }
    
    public int getMin() {
        return min;
    }
}
