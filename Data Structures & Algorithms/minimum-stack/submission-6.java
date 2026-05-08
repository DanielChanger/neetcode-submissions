class MinStack {
    Stack<Pair> stack;

    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int val) {
        if (stack.isEmpty()) {
            stack.push(new Pair(val, val));
        } else {
            stack.push(new Pair(val, Math.min(stack.peek().currentMin(), val)));
        }
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek().val();
    }
    
    public int getMin() {
        return stack.peek().currentMin();
    }

    private record Pair(int val, int currentMin) {}
}
