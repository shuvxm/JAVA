package QueuePrograms;
/*
 * FIFO
 */

public class Queue {

    private int front = 0;
    private int rear = -1;
    private int size = 0;
    private int capacity = 4;
    private int[] arr = new int[capacity];

    public void enqueue(int data) {
        if (isFull()) {
            throw new RuntimeException("Queue Overflow: Cannot enqueue " + data);
        }
        rear = (rear + 1) % capacity;
        arr[rear] = data;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue Underflow: Cannot dequeue from empty queue");
        }
        int data = arr[front];
        front = (front + 1) % capacity;
        size--;
        return data;
    }

    public int peek(){
        if (isEmpty()) {
            throw new RuntimeException("Queue Underflow: Queue is empty");
        }

        return arr[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void show() {
        System.out.print("Queue: ");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % capacity;
            System.out.print(arr[index] + " ");
        }
        System.out.println();
    }
}
