package Queue;

public class QueueMain {
    public static void main(String[] args) {
        circularQueue circularQueue=new circularQueue(5);
        circularQueue.enQueue(10);
        circularQueue.enQueue(20);
        circularQueue.enQueue(20);
        circularQueue.enQueue(20);
        circularQueue.enQueue(20);
        circularQueue.deQueue();
        circularQueue.deQueue();
        circularQueue.enQueue(20);
        circularQueue.enQueue(20);
        System.out.println(circularQueue.peek());
        circularQueue.deleteQueue();
    }
}
