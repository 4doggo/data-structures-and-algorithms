package stacksandqueues;

import java.util.NoSuchElementException;

public class Queue {

    private Node front;
    private Node rear;

    public void enqueue(int value){
        Node newNode = new Node(value);
        if(front == null){
            front = newNode;
        } else {
            rear.next = newNode;
        }
        rear = newNode;
    }

//    removing node from the front
    public int dequeue(){
        Node temp = front;
        if(front == null){
            throw new NoSuchElementException("Cannot dequeue from empty queue!");
        }
        front = front.next;
        temp.next = null;
        return temp.value;
    }

//    return value of front node
    public int peek(){
        return front.value;
    }

//    return boolean when empty or not
    public boolean isEmpty(){
        return front == null;
    }

}
