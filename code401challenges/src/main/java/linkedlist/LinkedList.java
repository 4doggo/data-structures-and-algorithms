package linkedlist;

//reference:
// https://stackoverflow.com/questions/38961553/create-new-node-for-singly-linked-list-in-java |
// https://www.cs.cmu.edu/~adamchik/15-121/lectures/Linked%20Lists/linked%20lists.html
// https://stackoverflow.com/questions/19283083/printing-out-a-linked-list-using-tostring


import java.util.List;

public class LinkedList<I extends Number> {

    Node head;

    public LinkedList() {
        this.head = null;
    }


    public void insert(int value) {

        Node temporary = new Node(value, this.head);

        this.head = temporary;

    }


    public boolean includes(int target) {
        Node current = head;

        while (current != null) {
            if (current.value == target) {
                return true;
            }

            current = current.next;
        }

        return false;
    }

    public String toString() {
        String result = "";
        Node current = head;

        while (current != null) {
            result += "{ " + current.value + " }" + " -> ";
            current = current.next;
        }

        return "List: " + result + " NULL";

    }

    public void append(int target) {

        Node current = head;

        while (current != null) {
            if (current.value == target) {

                target = current.value;

            }

        }

    }

    //first find the size of LL
    public int size() {
        Node current = this.head;
        if (current == null) {
           return current.value;
        } else {
            int size = 0;
            while (current != null) {
                size++;
                current = current.next;
            }
            return size;
        }
    }


    //actual method to return the int at kth from end
    public int findKthFromEnd(int k) {

        Node current = head;
        int sizeOfLinkedList = this.size();
        int counter = 1;
        int j = sizeOfLinkedList - k;

        while (current != null) {
            if (counter == j) {
                return current.value;
            } else {
                counter++;
                current = current.next;
            }
        }
        return current.value;
    }

//method to merge two LL
    public static LinkedList mergeLinkedList(LinkedList a, LinkedList b){

        LinkedList c = new LinkedList();
        Node currentA = a.head;
        Node currentB = b.head;

 while(currentA != null && currentB != null){

     c.insert(currentA.value);
     c.insert(currentB.value);

     currentA = currentA.next;
     currentB = currentB.next;

 }
        return c;
    }

}


