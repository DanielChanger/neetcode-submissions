class LinkedList {
    private Node head;
    private Node tail;

    public LinkedList() {
        tail = head;
    }

    public int get(int index) {
        Node current = head;
        for (int i = 0; i < index && current != null; i++) {
            current = current.next;
        }
        if (current == null || index < 0) {
            return -1;
        }
        return current.val;
    }

    public void insertHead(int val) {
        Node node = new Node(val, head);
        node.next = head;
        head = node;
        if (head.next == null) {
            tail = head;
        }
    }

    public void insertTail(int val) {
        Node newTail = new Node(val);
        if (tail == null) {
            tail = newTail;
            head = tail;
        } else {
            tail.next = newTail;
            tail = tail.next;
        }
    }

    public boolean remove(int index) {
        Node current = head;
        Node prev = null;
        for (int i = 0; i < index && current != null; i++) {
            prev = current;
            current = current.next;
        }
        if (current == null || index < 0) {
            return false;
        }
        if (index == 0) {
            head = head.next;
            return true;
        }
        prev.next = current.next;
        if (current == tail) { 
            tail = prev;
        }
        return true;
    }

    public List<Integer> getValues() {
        List<Integer> list = new ArrayList<Integer>();
        Node current = head;
        while (current != null) {
            list.addLast(current.val);
            current = current.next;
        }
        return list;
    }

    private class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }

        Node(int val, Node next) {
            this(val);
            this.next = next;
        }
    }
}
