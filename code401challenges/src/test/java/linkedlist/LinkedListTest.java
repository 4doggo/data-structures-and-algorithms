package linkedlist;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class LinkedListTest {

    @Test
    public void testLinkedList() {
        LinkedList<Number> myList = new LinkedList<Number>();

        assertNull("LinkedList instantiated",
                myList.head
        );
    }

    //    checking what happens when value added to empty linkedlist
    @Test
    public void testInsert() {
        LinkedList<Number> myList = new LinkedList<Number>();
        myList.insert(4);

        assertEquals("4 to be at the head",
                4,
                myList.head.value
        );
    }

    @Test
    public void testMultipleInsert() {
        LinkedList<Number> myList = new LinkedList<Number>();
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
        LinkedList<Number> myList = new LinkedList<Number>();
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
        LinkedList<Number> myList = new LinkedList<Number>();
        myList.insert(4);
        myList.insert(5);
        myList.insert(7);
        int targetValue = 5;

        assertTrue("5 is in the linked list", myList.includes(targetValue));
    }

    //    testing to see if target value is inside the linked list
    @Test
    public void testDoesntInclude() {
        LinkedList<Number> myList = new LinkedList<Number>();
        myList.insert(4);
        myList.insert(5);
        myList.insert(7);
        int targetValue = 8;

        assertFalse("8 is not in the linked list", myList.includes(targetValue));
    }

    //    testing to see if string with all of the values in the linked list are returned
    @Test
    public void testReturnString() {
        LinkedList<Number> myList = new LinkedList<Number>();
        myList.insert(4);
        myList.insert(5);
        myList.insert(7);

        assertEquals("print out 754",
                "List: { 7 } -> { 5 } -> { 4 } ->  NULL",
                myList.toString()
        );
    }

    //    testing to see if target is appended to the end of the LL
//    @Test
//    public void testAppend() {
//        LinkedList myList = new LinkedList();
//        myList.insert(4);
//        myList.insert(5);
//        myList.insert(7);
//
//        assertEquals(8, myList.append(8));
//    }


//    @Test
//    public void testkthFromEnd() {
//        List<Integer> myList = new LinkedList<Integer>(Arrays.asList(4,5,7));
////        myList.insert(4);
////        myList.insert(5);
////        myList.insert(7);
//        int k = 2;
//
//        assertEquals(5, ((LinkedList<Integer>) myList).findKthFromEnd(k));
//    }


    @Test
    public void testMergeList(){

        LinkedList a = new LinkedList();
        LinkedList b = new LinkedList();
        LinkedList c = new LinkedList();
        LinkedList test = new LinkedList();

        a.insert(1);
        a.insert(2);
        a.insert(3);

        b.insert(10);
        b.insert(10);
        b.insert(10);

        test.insert(3);
        test.insert(10);
        test.insert(2);
        test.insert(10);
        test.insert(1);
        test.insert(10);

        c.mergeLinkedList(a,b);
        System.out.println(c.head);

//        c.mergeLinkedList(a,b);
//        assertEquals("10, 1, 10, 2, 10, 3",
//                c.toString());
//
        assertEquals(test, c.mergeLinkedList(a,b));


    }


}


