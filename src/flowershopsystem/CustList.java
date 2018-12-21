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
public class CustList<T> implements ListInterface<T> {

    private Node first, last;

    @Override
    public T get(int position) {
        Node temp = first;
        for (int i = 0; i < position; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    @Override
    public void insert(T anElement) {
        Node newNode = new Node(anElement);
        if (isEmpty()) {
            first = newNode;
        } else {
            last.next = newNode;
            newNode.previous = last;
        }
        last = newNode;
    }

    @Override
    public void insert(int position, T anElement) {
        Node temp = first;
        Node newNode = new Node(anElement);
        for (int i = 0; i < position; i++) {
            temp = temp.next;
        }
        temp.previous.next = newNode;
        newNode.previous = temp.previous;
        newNode.next = temp;
        temp.previous = newNode;
    }

    @Override
    public T remove() {
        Node temp = null;
        if (!isEmpty()) {
            temp = last;
            if (first == last) {
                first = null;
            }
            last = last.previous;
        }
        return temp.data;
    }

    @Override
    public T removeAt(int position) {
        Node temp = null;
        if (position > 1 && position < size()) {
            temp = first;
            for (int i = 1; i < position; i++) {
                temp = temp.next;
            }
            temp.previous.next = temp.next;
            temp.next.previous = temp.previous;
        }
        return temp.data;
    }

    @Override
    public void replace(T anElement, int position) {
        Node temp = first;
        for (int i = 1; i < position; i++) {
            temp = temp.next;
        }
        temp.data = anElement;
    }

    @Override
    public int size() {
        Node temp = first;
        int size = 0;
        if (first != null) {
            size++;
            while (temp != last) {
                temp = temp.next;
                size++;
            }
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        return first == null || last == null;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    private class Node {

        private T data;
        private Node next, previous;

        public Node(T data) {
            this.data = data;
        }

        public Node(T data, Node next, Node previous) {
            this.data = data;
            this.next = next;
            this.previous = previous;
        }

    }
}
