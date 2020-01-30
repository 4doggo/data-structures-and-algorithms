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


    public int findMax(Node root){

        if(root == null){
            return 0;
        }

        if(root!=null){

            int current = node.value;
            int leftResult = findMax(root.leftChild);
            int rightResult = findMax(root.rightChild);

            if(leftResult > current){
                current = leftResult;
            }

            if(rightResult > current){
                current = rightResult;
            }

            return current;
        }
        return current;
    }


}
