public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        CircularQueue<Integer> queue= new CircularQueue<>(5);

        queue.enqueue(7);
        queue.enqueue(2);
        queue.enqueue(4);
        queue.enqueue(6);

        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Dequeue: " + queue.dequeue());

        queue.enqueue(5);
        queue.enqueue(6);

        System.out.println("Peek: " + queue.print());
    }
}