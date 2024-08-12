package Advance_java_Queue;
class queue1 {
    int[] queue = new int[20];
    int sizeOfArray;
    int front;
    int rear;

    public void enqueue(int data)
    {
        queue[rear]= data;
        rear = rear+1;
        sizeOfArray = sizeOfArray + 1;
    }
    public void printTheArray(){
        System.out.print("Element  : ");
        for (int i=0; i< sizeOfArray; i++){
            System.out.println(queue[i]+" ");
        }
    }
}
public class advanced_java_queue {
    public static void main(String[] args) {
        queue1 qu1 = new queue1();
        qu1.enqueue(2);
        qu1.enqueue(5);
        qu1.enqueue(1);
        qu1.enqueue(4);
        qu1.enqueue(6);
        qu1.enqueue(7);
        qu1.enqueue(8);
        qu1.enqueue(9);
        qu1.enqueue(10);
        qu1.enqueue(12);
        qu1.enqueue(15);
        qu1.printTheArray();
    }
}
