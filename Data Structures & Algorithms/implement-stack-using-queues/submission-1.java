
class MyStack {
    private Queue<Integer> queue;

    public MyStack() {
        queue = new ArrayDeque<>();
    }

    public void push(int x) {
        queue.offer(x);
    }

    public int pop() {
        Queue<Integer> buffer = new ArrayDeque<>();
        while (queue.size() > 1) {
            buffer.offer(queue.poll());
        }
        int val = queue.poll();
        while (!buffer.isEmpty()) {
            queue.offer(buffer.poll());
        }
        return val;
    }

    public int top() {
        Queue<Integer> buffer = new ArrayDeque<>();
        while (queue.size() > 1) {
            buffer.offer(queue.poll());
        }
        int val = queue.poll();
        buffer.offer(val);
        while (!buffer.isEmpty()) {
            queue.offer(buffer.poll());
        }
        return val;
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */