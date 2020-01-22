package stacksandqueues;

import stacksandqueues.Node;

import java.util.NoSuchElementException;

public class Stack {

    private Node top;

    public void push(int value){

        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;

    }

    //    removing node from the top
    public int pop(){
        Node temp = top;
        if(top == null){
            throw new NoSuchElementException("Cannot pop top is null");
        }
        top = top.next;
        temp.next = null;
        return temp.value;
    }

    //    return value of top node
    public int peek(){
        return top.value;
    }

    //    return boolean when empty or not
    public boolean isEmpty(){
        return top == null;
    }

}


