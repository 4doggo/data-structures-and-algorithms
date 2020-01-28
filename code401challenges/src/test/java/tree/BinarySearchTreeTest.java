package tree;

import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class BinarySearchTreeTest {

    BinarySearchTree binarySearchTree = new BinarySearchTree();

    @Before
    public void setUp() throws Exception {

        binarySearchTree.add(1);
        binarySearchTree.add(10);
        binarySearchTree.add(2);
        binarySearchTree.add(30);
        binarySearchTree.add(4);
        binarySearchTree.add(5);
        binarySearchTree.add(6);
        binarySearchTree.add(20);
        binarySearchTree.add(40);
        binarySearchTree.add(50);
        binarySearchTree.add(60);


    }

//    does contain value
    @Test
    public void testAdd() {
        System.out.println(binarySearchTree.root.value);
        System.out.println(binarySearchTree.root.rightChild.value);
        System.out.println(binarySearchTree.root.rightChild.rightChild.value);
        System.out.println(binarySearchTree.root.rightChild.rightChild.rightChild.value);
        assertTrue(binarySearchTree.contains(6));

    }

//    Doesnt contain value in tree
    @Test
    public void testAddFalse() {

        assertFalse(binarySearchTree.contains(1000));

    }


}