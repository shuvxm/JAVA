package QueuePrograms;

public class Main {
    public static void main(String[] args) {
        Queue q = new Queue();
        // q.dequeue();  
        q.enqueue(10);
        q.enqueue(20);
        System.out.println(q.dequeue()); // 10
        q.enqueue(30);
        System.out.println(q.dequeue()); // 20
        System.out.println(q.dequeue()); // 30

        q.enqueue(250);
        System.out.println("peak of queue : "+ q.peek());
        // Uncomment to test underflow
        // System.out.println(q.dequeue());

        // Uncomment to test full queue
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);
        q.enqueue(70);
        q.enqueue(80); // Should throw overflow
    
    }
}
