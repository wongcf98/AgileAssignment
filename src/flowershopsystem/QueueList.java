/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowershopsystem;

/**
 *
 * @author scollex
 */
public class QueueList<T> implements QueueInterface<T> {

    private Node lastNode;
    private int count = 0;

    public QueueList() {
        lastNode = null;
    }

    @Override
    public void enqueue(T newElement) {
        Node newNode = new Node(newElement);
        if (!IsEmpty()) {                 //if the list is not empty
            newNode.next = lastNode.next; //set the new node point to the first node
            lastNode.next = newNode; //set the previously last node point to the new node
        } else {
            newNode.next = newNode; //else set the new input node to point to itself
        }
        lastNode = newNode;//set the new entry node to be the last in line
        count++;
    }

    @Override
    public T dequeue() {
        T front = null;
        if (!IsEmpty()) {                   //if the list is not empty
            //set the return value to the the 
            //data inside the node pointed by the last node
            front = lastNode.next.data;   
            //if the last in line point to itself(only one node in the list)
            if (lastNode.next == lastNode) { 
                lastNode = null;  //clear the list
            } else {
                //let the last node to point to the node after the first node in line
                //to set the second node become the first in line
                lastNode.next = lastNode.next.next;
            }
        }
        count--;
        return front; 
    }

    @Override
    public T getFront() {
        T front = null;

        if (!IsEmpty()) {
            //return the generic type data stored in the node pointed by the lastnode
            front = lastNode.next.data;
        }

        return front;
    }

    @Override
    public boolean IsEmpty() {
        return lastNode == null;
    }

    @Override
    public boolean replace(int index, T newElement) {
        boolean successful = true;

        if (index <= count) {
            Node currentNode = lastNode.next;
            for (int i = 0; i < index - 1; i++) {
                currentNode = currentNode.next;
            }
            currentNode.data = newElement;
        } else {
            successful = false;
        }
        return successful;
    }

    @Override
    public T get(int index) {
        T object = null;
        //if the input index is larger than the size of the list
        if (index <= count && index != 0) {
            //make a temporaly node as the first node
            Node currentNode = lastNode.next;
            
            //loop the list * index times and set the 
            //temporaly node as the node in the position
            for (int i = 0; i < index - 1; i++) {
                currentNode = currentNode.next;
            }
            object = currentNode.data;
        }
        return object;
    }

    public void set(int index, T data){
        T object = null;
        //if the input index is larger than the size of the list
        if (index <= count && index != 0) {
            //make a temporaly node as the first node
            Node currentNode = lastNode.next;
            
            //loop the list * index times and set the 
            //temporaly node as the node in the position
            for (int i = 0; i < index - 1; i++) {
                currentNode = currentNode.next;
            }
            currentNode.data = data;
        }
    }
    
    private class Node {

        private T data;
        private Node next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }

        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }

    }

}
