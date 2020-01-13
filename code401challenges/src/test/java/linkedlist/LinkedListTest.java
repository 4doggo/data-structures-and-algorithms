package linkedlist;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

    @Test
    public void testLinkedList() {
        LinkedList myList = new LinkedList();

        assertNull("LinkedList instantiated",
                myList.head
        );
    }

    //    checking what happens when value added to empty linkedlist
    @Test
    public void testInsert() {
        LinkedList myList = new LinkedList();
        myList.insert(4);

        assertEquals("4 to be at the head",
                4,
                myList.head.value
        );
    }

    @Test
    public void testMultipleInsert() {
        LinkedList myList = new LinkedList();
        myList.insert(4);
        myList.insert(5);
        myList.insert(7);

        assertEquals("7 to be at the head",
                7,
                myList.head.value
        );
    }

//    test to see if head property is actually pointing to first node
    @Test
    public void testHeadProperty() {
        LinkedList myList = new LinkedList();
        myList.insert(4);
        myList.insert(5);
        myList.insert(7);

        assertEquals("7 to be at the head",
                7,
                myList.head.value
        );
    }

    //    testing to see if target value is inside the linked list
    @Test
    public void testInclude() {
        LinkedList myList = new LinkedList();
        myList.insert(4);
        myList.insert(5);
        myList.insert(7);
        int targetValue = 5;

        assertEquals("5 is in the linked list",
                true,
                myList.includes(targetValue)
        );
    }

    //    testing to see if target value is inside the linked list
    @Test
    public void testDoesntInclude() {
        LinkedList myList = new LinkedList();
        myList.insert(4);
        myList.insert(5);
        myList.insert(7);
        int targetValue = 8;

        assertEquals("8 is not in the linked list",
                false,
                myList.includes(targetValue)
        );
    }

    //    testing to see if string with all of the values in the linked list are returned
    @Test
    public void testReturnString() {
        LinkedList myList = new LinkedList();
        myList.insert(4);
        myList.insert(5);
        myList.insert(7);

        assertEquals("print out 754",
                "List: { 7 } -> { 5 } -> { 4 } ->  NULL",
                myList.toString()
        );
    }

}


