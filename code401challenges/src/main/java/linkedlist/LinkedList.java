package linkedlist;

//reference:
// https://stackoverflow.com/questions/38961553/create-new-node-for-singly-linked-list-in-java |
// https://www.cs.cmu.edu/~adamchik/15-121/lectures/Linked%20Lists/linked%20lists.html
// https://stackoverflow.com/questions/19283083/printing-out-a-linked-list-using-tostring


public class LinkedList {

    Node head;

    public LinkedList(){
        this.head = null;
    }


    public void insert(int value) {

        Node temporary = new Node(value, this.head);

        this.head = temporary;

    }


    public boolean includes(int target){
        Node current = head;

        while(current != null){
            if(current.value == target){
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

    public void append (int target){

        Node current = head;

        while( current != null){
            if(current.value == target){

            }

        }

    }

    public void findKthFromEnd(int k){


        if (head == null){


        }


    }


}
