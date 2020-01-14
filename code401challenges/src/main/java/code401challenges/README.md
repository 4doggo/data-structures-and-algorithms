### Challenge 1
#### Reversing the array without using builtin methods

- We went with using the forloop and the counter to go over the array

![Image description](/code401challenges/assets/ArrayReverse.jpg)

### Challenge 2 
#### Inserting a value into the middle of an array 

- I approached it using multiple if statements for odd and even length arrays with a for loop going over it. 

- Not the most efficient but it works and it runs 

- https://github.com/shingoed/data-structures-and-algorithms/blob/master/code401challenges/src/main/java/code401challenges/ArrayShift.java)

![whiteboard](/code401challenges/assets/whiteboard2.png)


### Challenge 3 
#### Doing a binary search on a sorted array 

- set variables left and right to navigate through sorted array
- used while loop to close in on the array

- https://github.com/shingoed/.java)data-structures-and-algorithms/blob/master/code401challenges/src/main/java/code401challenges/BinarySearch)

![whiteboard](/code401challenges/assets/whiteboard3.jpg)

### Challenge 4
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
        
        
### Challenge 5 
#### appending and inserting to Linked List


### Challenge Description
- .append(value) which adds a new node with the given value to the end of the list
- .insertBefore(value, newVal) which add a new node with the given newValue immediately before the first value node
- .insertAfter(value, newVal) which add a new node with the given newValue immediately after the first value node

### Approach & Efficiency
Traversing through linked list using next, run a while loop and use temp variables

### Solution
![whiteboard](/code401challenges/assets/whiteboard4.jpg)
