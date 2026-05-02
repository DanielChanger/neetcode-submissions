class DynamicArray {
    private static int CAPACITY_MULTIPLIER = 2;
    private int arr[];
    private int capacity;
    private int size;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
    }

    public int get(int i) {
        return arr[i];
    }

    public void set(int i, int n) {
        arr[i] = n;
    }

    public void pushback(int n) {
        checkCapacity();
        arr[size++] = n;
    }

    public int popback() {
        return arr[--size];
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }

    private void checkCapacity() {
        if (size == capacity) {
            resize();
        }
    }

    private void resize() {
        capacity *= CAPACITY_MULTIPLIER;
        int[] newArr = new int[capacity];
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }
}
