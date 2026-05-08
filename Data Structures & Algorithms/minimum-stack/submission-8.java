class MinStack {
    Deque<Pair> stack;

    public MinStack() {
        stack = new ArrayDeque<>();
    }
    
    public void push(int val) {
        int min = stack.isEmpty() ? val : Math.min(stack.peekFirst().currentMin(), val);
        stack.addFirst(new Pair(val, min));
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