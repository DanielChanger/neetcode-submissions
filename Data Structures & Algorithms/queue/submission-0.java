class Deque {
    private Node head;
    private Node tail;

    public Deque() {}

    public boolean isEmpty() {
        return head == null;
    }

    public void append(int value) {
        Node newTail = new Node(value);
        if (isEmpty()) {
            assignFirstNode(newTail);
            return;
        }
        tail.connect(newTail);
        tail = newTail;
    }

    public void appendleft(int value) {
        Node newHead = new Node(value);
        if (isEmpty()) {
            assignFirstNode(newHead);
            return;
        }
        newHead.connect(head);
        head = newHead;
    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        if (tail == head) {
            int val = head.val;
            head = null;
            tail = null;
            return val;
        }
        var nodeToPop = tail;
        tail = tail.prev;
        nodeToPop.disconnect();
        return nodeToPop.val;
    }

    public int popleft() {
        if (isEmpty()) {
            return -1;
        }
        if (tail == head) {
            int val = head.val;
            head = null;
            tail = null;
            return val;
        }
        var nodeToPop = head;
        head = head.next;
        nodeToPop.disconnect();
        return nodeToPop.val;
    }

    private void assignFirstNode(Node node) {
        head = node;
        tail = node;
    }

    class Node {
        Node prev;
        Node next;
        int val;

        Node(int val) {
            this.val = val;
        }

        void connect(Node node) {
            this.next = node;
            node.prev = this;
        }

        void disconnect() {
            if (next != null) {
                next.prev = null;
            }
            if (prev != null) {
                prev.next = null;
            }
            next = null;
            prev = null;
        }
    }
}
