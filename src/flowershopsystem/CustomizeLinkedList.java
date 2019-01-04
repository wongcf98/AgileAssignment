/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowershopsystem;

/**
 *
 * @author LIANG
 */
public class CustomizeLinkedList<T> implements CustomizeListInterface<T> {

    private Node lastNode;
    private Node frontNode;
    private int count = 0;

    public CustomizeLinkedList() {
        lastNode = null;
    }

    public void enqueue(T newEntry) {
        Node newNode = new Node(newEntry);

        if (isEmpty()) {
            newNode.next = newNode;
            frontNode = newNode;
        } else {
            newNode.next = lastNode.next;
            lastNode.next = newNode;
        }
        count++;
        lastNode = newNode;
    }

    @Override
    public void enqueueFront(T newEntry) {
        Node newNode = new Node(newEntry);

        if (isEmpty()) {
            newNode.next = newNode;
            lastNode = newNode;
        } else {
            newNode.next = frontNode;
            lastNode.next = newNode;
        }
        count++;
        frontNode = newNode;
    }

    @Override
    public T dequeue() {
        T front = null;

        if (!isEmpty()) {
            front = lastNode.next.data;

            if (lastNode.next == lastNode) {
                lastNode = null;
            } else {
                lastNode.next = lastNode.next.next;
            }
            count--;
        }

        return front;

    }

    @Override
    public T getIndex(int index) {

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

    @Override
    public void set(int index, T data) {
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

    public T getFront() {
        T front = null;

        if (!isEmpty()) {
            front = lastNode.next.data;
        }

        return front;
    }

    public boolean isEmpty() {
        return lastNode == null;
    }

    public void clear() {
        lastNode = null;
    }

    public Integer size() {
        return count;
    }

    public class Node {

        private T data;
        private Node next;

        private Node(T data) {
            this.data = data;
            this.next = null;
        }

        private Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
