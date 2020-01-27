package tree;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {

    BinarySearchTree binarySearchTree = new BinarySearchTree();

    @Before
    public void setUp() throws Exception {

        binarySearchTree.add(1);
        binarySearchTree.add(2);
        binarySearchTree.add(3);
        binarySearchTree.add(4);
        binarySearchTree.add(5);
        binarySearchTree.add(6);

    }

//    does contain value
    @Test
    public void testAdd() {

        assertTrue(binarySearchTree.contains(6));

    }

//    Doesnt contain value in tree
    @Test
    public void testAddFalse() {

        assertFalse(binarySearchTree.contains(10));

    }


}