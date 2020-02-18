//package tree;
//
//import org.junit.Before;
//import org.junit.Test;
//
//import static org.junit.Assert.*;
//
//public class TreeTest {
//
//    Tree tree;
//    Node root;
//
//    @Before
//    public void setUp() throws Exception {
//
//        tree = new Tree();
//
//            Node childTwo = new Node(5, new Node(2), null);
//            Node childOne = new Node(3, new Node(9), new Node(12));
//            Node rootNode = new Node(1, childOne, childTwo);
//            root = rootNode;
//        }
//    }
//
//    @Test
//    public void preOrder() {
//
//    }
//
//    @Test
//    public void inOrder() {
//    }
//
//    @Test
//    public void postOrder() {
//    }
//
//
//    @Test
//    public void testFindMax(){
//
//    assertEquals(12,tree.findMax(tree.root));
//
//    }
//
//}