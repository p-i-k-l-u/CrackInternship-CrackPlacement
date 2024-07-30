import java.util.Stack;

public class ImplementQueueUsingStacks {
    private final Stack<Integer> input;
    private final Stack<Integer> output;

    public ImplementQueueUsingStacks() {
        input = new Stack<>();
        output = new Stack<>();
    }

    public void push(int x) {
        input.push(x);
    }

    public int pop() {
        peek();
        return output.pop();
    }

    public int peek() {
        if (output.empty()) {
            while (!input.empty()) {
                output.push(input.pop());
            }
        }
        return output.peek();
    }

    public boolean empty() {
        return input.empty() && output.empty();
    }

    public static void main(String[] args) {
        ImplementQueueUsingStacks queue = new ImplementQueueUsingStacks();

        queue.push(1);
        queue.push(2);
        System.out.println(queue.peek()); // Output: 1
        System.out.println(queue.pop()); // Output: 1
        System.out.println(queue.empty()); // Output: false
    }
}
