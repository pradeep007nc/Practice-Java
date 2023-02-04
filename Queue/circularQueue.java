package Queue;

public class circularQueue {
    int bottom;
    int top;
    int[] arr;
    int size;
    circularQueue(int size){
        this.arr = new int[size];
        this.size = size;
        this.top = -1;
        this.bottom = -1;
        System.out.printf("Circular queue created with %d size\n",size);
    }

    public boolean isEmpty(){
        if (top == -1){
            return true;
        }
        return false;
    }

    public boolean isFull(){
        if (top+1 == bottom){
             return true;
        }if (bottom == 0 && top+1 == size) {
             return true;
        }
        return false;
    }

    //enque
    public void enQueue(int val) {
        if (isFull()) {
           System.out.print("queue is full");
        }else if(isEmpty()){
            bottom = 0;
            top++;
            arr[top] = val;
            System.out.println("inserted successfully");
        }else{
            if (top+1 == size){
                top = 0;
            }else {
                top++;
            }
            arr[top] = val;
            System.out.println("inserted successfully");
        }
    }

    public int deQueue(){
        if (isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }else{
            int result = arr[bottom];
            if(top == bottom){
                top = bottom = -1;
            } else if (bottom+1 == size) {
                bottom = 0;
            }else {
                bottom++;
            }
            return result;
        }
    }

    public int peek(){
        if (isEmpty()){
            return -1;
        }else {
            return arr[bottom];
        }
    }



    public void deleteQueue(){
        arr = null;
    }
}
