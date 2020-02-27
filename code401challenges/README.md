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


## Challenge 16 
#### FizzBuzzTree

### Challenge Description
#### Check tree
      determine whether or not the value of each node is divisible by 3, 5 or both. Create a new tree with the same structure as the original, but the values modified as follows:
      If the value is divisible by 3, replace the value with “Fizz”
      If the value is divisible by 5, replace the value with “Buzz”
      If the value is divisible by 3 and 5, replace the value with “FizzBuzz”
      If the value is not divisible by 3 or 5, simply turn the number into a String.
      Return the new tree.

### Approach & Efficiency

### Solution
![whiteboard](/code401challenges/assets/whiteboard16.JPG)


## Challenge 17
#### Breadth-first Traversal

### Challenge Description
#### traversing binary tree then storing value in list
     Write a breadth first traversal method which takes a Binary Tree as its unique input.
     Without utilizing any of the built-in methods available to your language, traverse the input tree using a Breadth-first approach, and return a list of the values in the tree in the order they were encountered.

### Approach & Efficiency

### Solution
![whiteboard](/code401challenges/assets/whiteboard16.JPG)

## Challenge 30
### Hash Table
##### 
    add: takes in both the key and value. This method should hash the key, and add the key and value pair to the table, handling collisions as needed.
    get: takes in the key and returns the value from the table.
    contains: takes in the key and returns a boolean, indicating if the key exists in the table already.
    hash: takes in an arbitrary key and returns an index in the collection.
    

## Challenge 31
#### Hashset

### Challenge Description
#### Find the first repeated word in a book.
     Write a function that accepts a lengthy string parameter.
     Without utilizing any of the built-in library methods available to your language, return the first word to occur more than once in that provided string.

### Approach & Efficiency

### Solution
![whiteboard](/code401challenges/assets/whiteboard30.JPG)

## Challenge 34.5
#### Find common values in 2 binary trees.

### Challenge Description
     Write a function called tree_intersection that takes two binary tree parameters.
     Without utilizing any of the built-in library methods available to your language, return a set of values found in both trees.
### Approach & Efficiency

### Solution
![whiteboard](/code401challenges/assets/whiteboard34.5JPG)

## Challenge 35
#### Graph

### Challenge Description
#### Implement a graph with 
    AddNode()
    Adds a new node to the graph
    Takes in the value of that node
    Returns the added node
    AddEdge()
    Adds a new edge between two nodes in the graph
    Include the ability to have a “weight”
    Takes in the two nodes to be connected by the edge
    Both nodes should already be in the Graph
    GetNodes()
    Returns all of the nodes in the graph as a collection (set, list, or similar)
    GetNeighbors()
    Returns a collection of nodes connected to the given node
    Takes in a given node
    Include the weight of the connection in the returned collection
    Size()
    Returns the total number of nodes in the graph
    
### Approach & Efficiency

### Solution

## Challenge 36
#### Breadth-first Traversal

### Challenge Description
#### Implement a breadth-first traversal on a graph.
    Extend your graph object with a breadth-first traversal method that accepts a starting node. Without utilizing any 
    of the built-in methods available to your language, return a collection of nodes in the order they were visited. 
    Display the collection.

### Approach & Efficiency
- implement a queue to store the values as you traverse 
- Check if the graph is null or not

### Solution
![whiteboard](/code401challenges/assets/whiteboard36.JPG)


## Challenge 38
#### Depth-first Traversal

### Challenge Description
#### Conduct a depth first preorder traversal on a graph
    Create a function that accepts an adjacency list as a graph, and conducts a depth first traversal. Without 
    utilizing any of the built-in methods available to your language, return a collection of nodes in their pre-order 
    depth-first traversal order.

### Solution
![whiteboard](/code401challenges/assets/whiteboard38.JPG)
