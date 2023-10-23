import javax.xml.soap.Node;

public class CircularQueue<T> {
    private Node<T> front;
    private Node<T> rear;
    private int size;
    private int capacity;
    private static class Node<T>{
        T data;
        Node<T> next;
        public Node(T data){
            this.data=data;
            this.next=null;
        }
    }

    public CircularQueue(int capacity) {
        this.capacity=capacity;
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    public boolean isEmpty(){
        return size==0;
    }
    public void enqueue(T data){

        Node<T> newNode= new Node<>(data);
        if (isEmpty()){
            front=newNode;
        } else {
            rear.next=newNode;
        }
        rear=newNode;
        rear.next=front;
        size++;
    }
    public T dequeue(){
        if (isEmpty()){
            return null;
        }

        T data=front.data;
        if (size==1){
            front=null; rear=null;
        } else {
            front=front.next;
            rear.next=front;
        }
        size--;
        return data;
    }

    public T print() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot peek.");
            return null;
        }
        return front.data;
    }
}
