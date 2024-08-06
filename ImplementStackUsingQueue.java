
import java.util.LinkedList;
import java.util.Queue;

class ImplementStackUsingQueue {
    private Queue<Integer> queue;

    public ImplementStackUsingQueue() {
        queue = new LinkedList<>();
    }

    public void push(int x) {
        queue.add(x);
        for (int i = 1; i < queue.size(); i++) {
            queue.add(queue.remove());
        }
    }

    public int pop() {
        return queue.remove();
    }

    public int top() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }

    public static void main(String[] args) {
        ImplementStackUsingQueue obj = new ImplementStackUsingQueue();
        obj.push(5);
        int param_2 = obj.pop();
        System.out.println("Pop: " + param_2);
        obj.push(3);
        int param_3 = obj.top();
        System.out.println("Top: " + param_3);
        boolean param_4 = obj.empty();
        System.out.println("Is Empty: " + param_4);
    }
}
