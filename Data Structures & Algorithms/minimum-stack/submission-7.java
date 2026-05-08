class MinStack {
    Deque<Pair> stack;

    public MinStack() {
        stack = new ArrayDeque<>();
    }
    
    public void push(int val) {
        if (stack.isEmpty()) {
            stack.addFirst(new Pair(val, val));
        } else {
            stack.addFirst(new Pair(val, Math.min(stack.peekFirst().currentMin(), val)));
        }
    }
    
    public void pop() {
        stack.removeFirst();
    }
    
    public int top() {
        return stack.peekFirst().val();
    }
    
    public int getMin() {
        return stack.peekFirst().currentMin();
    }

    private record Pair(int val, int currentMin) {}
}