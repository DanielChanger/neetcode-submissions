class MinStack {

    private static final int DEFAULT_SIZE = 10;
    private static final int SIZE_MULTIPLIER = 10;

    private int[] stack;
    private int[] minValIndexTracker;
    private int topIndex;
    private int topMinValIndex;
    
    public MinStack() {
        stack = new int[DEFAULT_SIZE];
        minValIndexTracker = new int[DEFAULT_SIZE];
        topIndex = -1;
        topMinValIndex = -1;
    }
    
    public void push(int val) {
    
        checkCapacity();
        stack[++topIndex] = val;
        if (topMinValIndex == -1 || val <= stack[minValIndexTracker[topMinValIndex]]) {
            minValIndexTracker[++topMinValIndex] = topIndex;
        } 
    }
    
    public void pop() {
        int val = stack[topIndex];
        if (stack[minValIndexTracker[topMinValIndex]] == val) {
            minValIndexTracker[topMinValIndex--] = -1;
        }
        stack[topIndex--] = -1;
    }
    
    public int top() {
        return stack[topIndex];
    }
    
    public int getMin() {
        return stack[minValIndexTracker[topMinValIndex]];
    }

    private void checkCapacity() {
        if (topIndex == stack.length - 1) {
            resize();
        }
    }

    private void resize() {
        var newStack = new int[stack.length * SIZE_MULTIPLIER];
        for (int i = 0; i < stack.length; i++) {
            newStack[i] = stack[i];
        }
        stack = newStack;

        newStack = new int[minValIndexTracker.length * SIZE_MULTIPLIER];
        for (int i = 0; i < minValIndexTracker.length; i++) {
            newStack[i] = minValIndexTracker[i];
        }
        minValIndexTracker = newStack;
    }
}
