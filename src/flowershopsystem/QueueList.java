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
public class QueueList<T extends Comparable<T>> implements QueueInterface<T> {

    private Node lastNode;
    private int count = 0;

    public QueueList() {
        lastNode = null;
    }

    @Override
    public void enqueue(T newElement) {
//        Node newNode = new Node(newElement);
//        Node tempNode = null;
//        Node currNode = null;
//        if (!IsEmpty() && count > 1) {                 //if the list is not empty
//            tempNode = lastNode.next;     //tempNode will be the first node
//            //loop to find the first element if the queue to be biger than the newElement
//            while (newElement.compareTo(tempNode.data) > 0) {
//                currNode = tempNode; //currNode will be the node before the element
//                tempNode = tempNode.next; //tempNode will cycle to the next node
//            }
//            currNode.next = newNode;
//            newNode.next = tempNode;
//        } else if (!IsEmpty() && count == 1) {
//            tempNode = lastNode;
//            newNode.next = lastNode;
//            lastNode.next = newNode;
//            if (newElement.compareTo(tempNode.data) > 0) {
//                lastNode = newNode;
//            }
//
//        } else {
//            lastNode = newNode;
//            lastNode.next = lastNode;
//        }
        enqueue(newElement, lastNode);
        count++;
    }

    public Node enqueue(T newElement, Node currNode) {
        if (count == 0) {
            Node newNode = new Node(newElement);
            newNode.next = newNode;
            lastNode = newNode;
            return currNode;
        }

        Node temp = currNode;
        if (count != 1) {
            currNode = currNode.next;
        }

        if (newElement.compareTo(currNode.data) < 0) {
            temp.next = new Node(newElement);
            temp.next.next = currNode;
            return currNode;
        }
        if (currNode == lastNode) {
            Node newNode = new Node(newElement);
            newNode.next = lastNode.next;
            lastNode.next = newNode;
            lastNode = newNode;
            return lastNode;
        }
        enqueue(newElement, currNode);

        return temp;
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
    public T get(int position) {
        T object = null;
        if (position == 0) {
            return getFront();
        }
        //if the input position is larger than the size of the list
        if (position <= count) {
            //make a temporaly node as the first node
            Node currentNode = lastNode.next;
            //loop the list * position times and set the 
            //temporaly node as the node in the position
            for (int i = 0; i <= position - 1; i++) {
                currentNode = currentNode.next;
            }
            object = currentNode.data;
        }
        return object;
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
