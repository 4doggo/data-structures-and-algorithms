package tree;

//resource: https://www.geeksforgeeks.org/binary-search-tree-set-1-search-and-insertion/
//https://www.geeksforgeeks.org/search-a-node-in-binary-tree/


public class BinarySearchTree {

    Node root;

   public void add(int key){
       root = addRecursion(root,key);
   }

    public Node addRecursion(Node current, int key){

        if (current == null){
            return new Node(key);
        }

        if(key < current.value){
            current.leftChild = addRecursion(current.leftChild,key);
        }

        else if(key > current.value) {
        current.rightChild=addRecursion(current.rightChild,key);

        }
            return current;
    }

//O(h) the height
    public boolean containsRecursive(Node current, int key){

       if(current==null) {
           return false;
       }

        if(key == current.value){
            return true;
        }

        else if(key < current.value){
           return containsRecursive(current.leftChild,key);
        }

        else{
            return containsRecursive(current.rightChild,key);
        }

    }

    public boolean contains(int key){

       return containsRecursive(root, key);

    }

}
