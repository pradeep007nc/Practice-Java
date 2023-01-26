package ThreeStackInOneArray;

public class threeInOneStack {

    private int numberOfStacks = 3;
    private int stackCapacity;
    private int[] values;
    private int[] sizes;

    threeInOneStack(int stackSize){
         stackCapacity = stackSize;
         values = new int[stackSize * numberOfStacks];
         sizes = new int[numberOfStacks];
    }

    public boolean isFull(int stackNum){
        return (sizes[stackNum] == stackCapacity) ? true : false;
    }

    public boolean isEmpty(int stackNum){
        return (sizes[stackNum] == 0) ? true : false;
    }

    private int stackTop(int stackNum){
        int offSet = stackNum * stackCapacity;
        int size = sizes[stackNum];
        return offSet + size - 1;
    }

    public void push(int stackNum, int val){
        if (isFull(stackNum)) System.out.println("its full");
        sizes[stackNum]++;
        values[stackTop(stackNum)] = val;
    }

    public int pop(int stackNum){
        if (isEmpty(stackNum)) return -1;
        int topIndex = stackTop(stackNum);
        int value = values[topIndex];
        values[topIndex] = 0;
        sizes[stackNum]--;
        return value;
    }

    public int peek(int stackNum){
        return (isEmpty(stackNum)) ? -1 :values[stackTop(stackNum)];
    }
}
