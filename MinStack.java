import java.util.Stack;

public class MinStack {
    int minEle;
    Stack<Integer> s = new Stack<>();

    int getMin() {
        if (s.isEmpty()) {
            return -1;
        }
        return minEle;
    }

    int pop() {
        if (s.isEmpty()) {
            return -1;
        }

        int t = s.pop();
        if (t >= minEle) {
            return t;
        } else {
            int res = minEle;
            minEle = 2 * minEle - t;
            return res;
        }
    }

    public int top() {
        if (s.isEmpty()) {
            return -1;
        } else {
            int top = s.peek();
            if (s.peek() >= minEle) {
                return top;
            } else {
                return minEle;
            }
        }
    }

    void push(int val) {
        if (s.isEmpty()) {
            s.push(val);
            minEle = val;
        } else {
            if (val >= minEle) {
                s.push(val);
            } else {
                s.push(2 * val - minEle);
                minEle = val;
            }
        }
    }

    public static void main(String[] args) {
        MinStack ms = new MinStack();
        ms.push(3);
        ms.push(5);
        System.out.println("Current minimum: " + ms.getMin());
        ms.push(2);
        ms.push(1);
        System.out.println("Current minimum: " + ms.getMin());
        System.out.println("Top element: " + ms.top());
        System.out.println("Popped element: " + ms.pop());
        System.out.println("Current minimum: " + ms.getMin());
    }
}
