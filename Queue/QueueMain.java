package Queue;

public class QueueMain {
    public static void main(String[] args) {
        circularQueue circularQueue=new circularQueue(3);
        circularQueue.enQueue(2);
        circularQueue.enQueue(3);
        circularQueue.enQueue(4);
        circularQueue.deQueue();
        circularQueue.enQueue(5);
    }
}
