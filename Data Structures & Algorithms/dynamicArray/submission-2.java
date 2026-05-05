class DynamicArray {
    int[] arr;
    int size;
    int capacity;

    public DynamicArray(int capacity) {
        this.capacity = capacity > 0 ? capacity : 1;
        this.size = 0;
        this.arr = new int[this.capacity];
    }

    public int get(int i) {
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException();
        }
        return arr[i];
    }

    public void set(int i, int n) {
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException();
        }
        arr[i] = n;
    }

    public void pushback(int n) {
        if (size == capacity) {
            resize();
        }
        arr[size++] = n;
    }

    public int popback() {
        if (size == 0) {
            throw new RuntimeException("Array is empty");
        }
        return arr[--size];
    }

    private void resize() {
        capacity = capacity == 0 ? 1 : capacity * 2;
        int[] newArr = new int[capacity];

        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }
}