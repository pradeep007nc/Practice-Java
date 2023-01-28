package stackops;

public class main {
    public static void main(String[] args) {
        stack stack = new stack();
        stack.push(-2);
        stack.push(0);
        stack.push(-3);
        System.out.println(stack.getMin()); // return -3
        stack.pop();
        System.out.println(stack.top());    // return 0
        System.out.println(stack.getMin()); // return -2
    }
}
