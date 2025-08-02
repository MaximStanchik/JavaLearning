package org.Stanchik.dataStructures.Heap;

public class MaxHeap {
    private int[] heap;
    private int size;
    private int capacity;

    public MaxHeap(int capacity) {
        this.capacity = capacity;
        this.heap = new int[capacity];
        this.size = 0;
    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    private int leftChild(int index) {
        return 2 * index + 1;
    }

    private int rightChild(int index) {
        return 2 * index + 2;
    }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    private void placeHeapRoot(int i) {
        while (i > 0 && heap[parent(i)] < heap[i]) {
            swap(parent(i), i);
            i = parent(i);
        }
    }

    public void insert(int value) {
        if (size == capacity) {
            throw new ArrayIndexOutOfBoundsException();
        }
        heap[size] = value;
        size++;
        placeHeapRoot(size - 1);
    }

    private void placeHeapBottom(int i) {
        int largest = i;
        int left = leftChild(i);
        int right = rightChild(i);

        if (left < size && heap[left] > heap[largest]) {
            largest = left;
        }

        if (right < size && heap[right] > heap[largest]) {
            largest = right;
        }

        if (largest != i) {
            swap(i, largest);
            placeHeapBottom(largest);
        }
    }

    public int extractMax() {
        if (size == 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int max = heap[0];
        heap[0] = heap[size - 1];
        size--;
        placeHeapBottom(0);
        return max;
    }
}