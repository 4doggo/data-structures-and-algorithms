//package tree;
//
//public class FizzBuzzTree {
//
//        Node root;
//
//        public static Tree<String> fizzbuzz(Tree<Integer> input){
//                Tree<String> answer = new Tree<>();
//                answer.root = fizzBuzzHelper(input.root);
//                return answer;
//        }
//
//        private static Node<String> fizzBuzzHelper(Node<Integer> node){
//               if (node == null){
//                       return null;
//               } else {
//
//                       Node<String> answer = new Node<>();
//                       if (node.value % 15 == 0){
//                               answer.value ="fizzbuzz";
//                       } else if (node.value % 5 == 0){
//                               answer.value ="buzz";
//                       }
//                       else if (node.value % 3 == 0){
//                               answer.value ="fizz";
//                       }
//                       else {
//                               answer.value = node.value.toString();
//                       }
//
//                       answer.leftChild=fizzBuzzHelper(node.leftChild);
//                       answer.rightChild=fizzBuzzHelper(node.rightChild);
//               }
//
//
//        }
//
//        }
