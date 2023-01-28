package stackops;

import java.util.Stack;

class stack {

    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public stack() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int val) {
        stack1.push(val);
        int val1 = Math.min(val, stack2.isEmpty() ? val : stack2.peek());
        stack2.push(val1);
    }

    public void pop() {
        stack1.pop();
        stack2.pop();
    }

    public int top() {
        return stack1.peek();
    }

    public int getMin() {
        return stack2.peek();
    }
}
