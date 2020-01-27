package tree;

public class Tree {

    private Node root;

    public void preOrder(){

        recursionPreOrder(root);
    }

    public void recursionPreOrder(Node current){

        if(current == null){
           return;
        }

        System.out.println(current);
        recursionPreOrder(current.leftChild);
        recursionPreOrder(current.rightChild);

    }


    public void inOrder(){

        recursionInOrder(root);

    }

    public void recursionInOrder(Node current){

        if(current==null){
            return;
        }

        recursionPreOrder(current.leftChild);
        System.out.println(current);
        recursionPreOrder(current.rightChild);

    }

    public void postOrder(){

        recursionPostOrder(root);
    }

    public void recursionPostOrder(Node current){

        if (current == null){
            return;
        }

        recursionPreOrder(current.leftChild);
        recursionPreOrder(current.rightChild);
        System.out.println(current);

    }



}
