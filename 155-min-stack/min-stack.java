class Node {
    int val;
    int min;

    public Node(int v, int m) {
        this.val = v;
        this.min = m;
    }
}

class MinStack {
    Stack<Node> stack;

    public MinStack() {
        stack = new Stack<Node>();
    }

    public void push(int val) {

        // First element
        if (stack.isEmpty()) {
            stack.push(new Node(val, val));
            return;
        }

        Node nodeTop = stack.peek();
        int minTop = nodeTop.min;

        if (val < minTop) {
            stack.push(new Node(val, val));
        } else {
            stack.push(new Node(val, minTop));
        }
    }

    public void pop() {
        if (stack.isEmpty()) {
            return;
        }

        stack.pop();
    }

    public int top() {
        if (stack.isEmpty()) {
            return -1;
        }

        Node nodeTop = stack.peek();
        return nodeTop.val;
    }

    public int getMin() {
        if (stack.isEmpty()) {
            return -1;
        }

        Node nodeTop = stack.peek();
        return nodeTop.min;
    }
}

/* class MinStack {
    Stack<int[]> stack;
    public MinStack() {
        stack = new Stack<>();
    }
    public void push(int val) {
        int currentMin;
        if (stack.isEmpty()) {
            currentMin = val;
        } else {
            currentMin = Math.min(val, stack.peek()[1]);
        }
        stack.push(new int[]{val, currentMin});
    }
    public void pop() {
        stack.pop();
    }
    public int top() {
        return stack.peek()[0]; 
    }
    public int getMin() {
        return stack.peek()[1]; 
    }
}
*/

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */