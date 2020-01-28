package tree;

public class Node {

    int key;
    int value;
    Node leftChild;
    Node rightChild;

    public Node(int key, Node leftChild, Node rightChild){

        this.key = key;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }


    public Node(int key) {

        this.value = key;
        this.leftChild = null;
        this.rightChild = null;
    }
}
