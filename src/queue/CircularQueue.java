package queue;

public class CircularQueue {
    int begin;
    int top;
    int[] arr;
    int sizeOfArray;
    int sizeOfQueue;

    public CircularQueue(int sizeOfArray){
        arr = new int[sizeOfArray];
        this.sizeOfArray = sizeOfArray;
        top = begin = -1;
    }//end of the method

    /**
     * To Check the Queue is empty or not
     * @return
     */
    public boolean isEmpty(){
        return top == -1 && begin == -1;
    }//end of the method

    /**
     * To check the Queue is full or not
     * @return
     */
    public boolean isFull(){
        return top+1 == begin || (begin == 0 && top == sizeOfArray-1);
    }// end of the method

    /**
     * Insert the value in the Queue
     * @param data
     */

    public void enQueue(int data) {
        if (isFull()) {
            System.out.println("Queue is Full.");
        } else {
            if (begin == -1) {
                arr[begin + 1] = data;
                begin++;
                top++;
                sizeOfQueue++;
                System.out.println(arr[begin]+" is Inserted.");
            } else {
                top = (top + 1) % sizeOfArray;
                arr[top] = data;
                sizeOfQueue++;
                System.out.println(arr[top]+" is Inserted.");
            }
        }
    }// end of the method

    /**
     * Delete the value in Queue
     */

    public void deQueue(){
            if(isEmpty()){
                System.out.println("Queue is Empty...");
            }
            else {
                System.out.println(arr[begin] + " is deleted.");
                begin = (begin + 1) % sizeOfArray;
                sizeOfQueue--;
            }
    }// end of the method

    /**
     * Display the Element of the Queue.
     */

    public void display(){
        int temp = begin;
        System.out.println("Queue Elements: ");
        while (temp != top){
            System.out.println(arr[temp]);
            temp = (temp+1)%sizeOfArray;
        }
        System.out.println(arr[temp]);
        System.out.println("Size Of Queue: "+sizeOfQueue);
        System.out.println();
    }// end of the method

    /**
     * return top value in array.
     * @return
     */
    public int peek(){
        return arr[top];
    }

}



