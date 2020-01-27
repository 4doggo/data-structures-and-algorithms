## Challenge 1
#### Reversing the array without using builtin methods

- We went with using the forloop and the counter to go over the array

![Image description](/code401challenges/assets/ArrayReverse.jpg)

## Challenge 2 
#### Inserting a value into the middle of an array 

- I approached it using multiple if statements for odd and even length arrays with a for loop going over it. 

- Not the most efficient but it works and it runs 

- https://github.com/shingoed/data-structures-and-algorithms/blob/master/code401challenges/src/main/java/code401challenges/ArrayShift.java)

![whiteboard](/code401challenges/assets/whiteboard2.png)


## Challenge 3 
#### Doing a binary search on a sorted array 

- set variables left and right to navigate through sorted array
- used while loop to close in on the array

- https://github.com/shingoed/.java)data-structures-and-algorithms/blob/master/code401challenges/src/main/java/code401challenges/BinarySearch)

![whiteboard](/code401challenges/assets/whiteboard3.jpg)

## Challenge 4
#### Singly Linked List
<!-- Short summary or background information -->

#### Challenge
Instantiating a linked list, inserting a value into the list, checking for target value in the linked list and returning all the values in a linkedlist as a string  

#### Approach & Efficiency
I took the approach of creating a constructor for the node that holds a value and a next. Created methods for each one and used a while loop to iterate over the linkedlist. 

#### API

#### linkedList()
    instantiates an empty linked list 

#### insert() 
    takes any value as an argument and adds a new node with that value to the head of the list with an O(1) Time performance.
    
#### includes()
      takes any value as an argument and returns a boolean result depending on whether that value exists as a Node’s value somewhere within the list.
      
#### toString()
        takes in no arguments and returns a string representing all the values in the Linked List, formatted as:"{ a } -> { b } -> { c } -> NULL"
        
        
## Challenge 6 
#### appending and inserting to Linked List


### Challenge Description
#### 
    .append(value) which adds a new node with the given value to the end of the list
####
     .insertBefore(value, newVal) which add a new node with the given newValue immediately before the first value node
####
    .insertAfter(value, newVal) which add a new node with the given newValue immediately after the first value node

### Approach & Efficiency
Traversing through linked list using next, run a while loop and use temp variables

### Solution
![whiteboard](/code401challenges/assets/whiteboard4.JPG)


## Challenge 7 
#### Finding the kth value from the end of LL


### Challenge Description
#### ll.kthFromEnd(k) 
     a method for the Linked List class which takes a number, k, as a parameter. Return the node’s value that is k from the end of the linked list. 

### Approach & Efficiency
Traversing through linked list using next, run a while loop and use counter. Use for loop to iterate the appropriate amount of times. 

### Solution
![whiteboard](/code401challenges/assets/whiteboard5.JPG)

## Challenge 8 
#### Merging two LL


### Challenge Description
#### ll.merge()
      takes two linked lists as arguments. Zip the two linked lists together into one so that the nodes alternate between the two lists and return a reference to the head of the zipped list. Try and keep additional space down to O(1). 

### Approach & Efficiency
Create new LL, add linked list alternately by using add() and then breaking the list each time so that the
pointer forgets the next node and repeat the process until either of the list hits the tail. 

### Solution
![whiteboard](/code401challenges/assets/whiteboard6-1.jpg)
![whiteboard](/code401challenges/assets/whiteboard6-2.jpg)

## Challenge 10
### Stacks and Queues 
#### Stacks methods
##### 
    .push() which takes any value as an argument and adds a new node with that value to the top of the stack with an O(1) Time performance.
    .pop()  does not take any argument, removes the node from the top of the stack, and returns the node’s value.
    .peek() does not take an argument and returns the value of the node located on top of the stack, without removing it from the stack.
    .isEmpty() does not take an argument, and returns a boolean indicating whether or not the stack is empty.
    
#### Queue methods
##### 
    .enqueue() which takes any value as an argument and adds a new node with that value to the back of the queue with an O(1) Time performance.
    .dequeue() does not take any argument, removes the node from the front of the queue, and returns the node’s value.
    .peek() does not take an argument and returns the value of the node located in the front of the queue, without removing it from the queue.
    .isEmpty() does not take an argument, and returns a boolean indicating whether or not the queue is empty.
     
     
## Challenge 11 
#### 


### Challenge Description
#### Implement a Queue using two Stacks.
    - enqueue(value) which inserts value into the PseudoQueue, using a first-in, first-out approach.
    - dequeue() which extracts a value from the PseudoQueue, using a first-in, first-out approach.


### Approach & Efficiency

### Solution


## Challenge 12 
#### First-in, First out Animal Shelter.

### Challenge Description
#### Implement a Stack 
      - Create a class called AnimalShelter which holds only dogs and cats. The shelter operates using a first-in, first-out approach.
      Implement the following methods:
      - enqueue(animal): adds animal to the shelter. animal can be either a dog or a cat object.
      - dequeue(pref): returns either a dog or a cat. If pref is not "dog" or "cat" then return null.

### Approach & Efficiency


### Solution
![whiteboard](/code401challenges/assets/whiteboard12.JPG)


## Challenge 13 
#### Multi-bracket Validation.

### Challenge Description
#### public static boolean multiBracketValidation(String input)
    - Your function should take a string as its only argument, and should return a boolean representing whether or not the brackets in the string are balanced. There are 3 types of brackets:
     
     Round Brackets : ()
     Square Brackets : []
     Curly Brackets : {}

### Approach & Efficiency


### Solution
![whiteboard](/code401challenges/assets/whiteboard13.JPG)


# Trees

## Challenge
### Binary Search Tree & Tree 
####Traversal method of tree
- preOrder 
- inOrder
- postOrder

###Binary Search Tree
####
- add: accepts a value, and adds a new node with that value in the correct location in the binary search tree.
- contains: accepts a value, and returns a boolean indicating whether or not the value is in the tree at least once.

## Approach & Efficiency
Recursion is the approach that was made to solve both traversals and adding/containing
