package Step09_StacksQueue_30;

public class Queue {
    public static void main(String[] args) {
        QueueArray q = new QueueArray(10);
        q.print();
    }
    
}

//! TC=0(1) SC=0(N)
class QueueArray{
     private int Queue[];
     private int front;
     private int last;
     private int size;
     private int capacity;
    
    public QueueArray(int desiredSize){
        front=-1;
        last=-1;
        size=0;
        Queue = new int[desiredSize];
        capacity = desiredSize;
    }
    public void print(){
        System.out.println("queue has been implemented using arrays with capacity : " + size);
    }
    public void pop(){
        if(size==0){
            System.out.println("Queue Underflow");
            return;
        }
        if(size==1){
            front=-1;
            last=-1;
            size=0;
            return;
        }
        else{
            front = (front+1)%capacity;
            size--;
        }
    }
    public void push(int n){
        if(size==capacity){
            System.out.println("Queue Overflow");
            return;
        } 
        if(front==-1){
            front=0;
            last=0;
            Queue[last] = n;
            // return;
        }
        
        else{
            last = (last+1)%capacity; //modularity check
            Queue[last] = n;
        }
        size++;

    }
    public int size(){
        return size;
    }

    public int top(){
        if(size==0){
            System.out.println("Queue is Empty");
            return -1;
        }
        return Queue[front];
    }     
}