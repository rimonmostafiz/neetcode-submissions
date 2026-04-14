class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String el : tokens) {
            if (el.equals("+") || el.equals("-") || el.equals("*") || el.equals("/")) {
                int b = stack.pop();
                int a = stack.pop();

                switch(el) {
                    case "+":
                    stack.push(a + b);
                    break;
                    case "-":
                    stack.push(a - b);
                    break;
                    case "*":
                    stack.push(a * b);
                    break;
                    case "/":
                    stack.push(a / b);
                    break;
                }

            } else {
                stack.push(Integer.parseInt(el));
            }
        }

        return stack.pop();
    }
}
