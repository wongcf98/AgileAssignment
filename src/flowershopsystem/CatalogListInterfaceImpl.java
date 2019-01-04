/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowershopsystem;

public class CatalogListInterfaceImpl<T> implements CatalogListInterface<T> {

    private Node first, last;

    public class Node {

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

    @Override
    public T get(int index) {
        Node temp = first;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    @Override
    public boolean insert(T item) {
        Node newNode = new Node(item);
        if (isEmpty()) {
            first = newNode;
        } else {
            last.next = newNode;
            newNode.previous = last;
        }
        last = newNode;
        return true;
    }

    @Override
    public boolean insert(int index, T item) {
        Node temp = first;
        Node newNode = new Node(item);
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        temp.previous.next = newNode;
        newNode.previous = temp.previous;
        newNode.next = temp;
        temp.previous = newNode;
        return true;
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
    public T removeAt(int index) {
        Node temp = null;
        if (index > 1 && index < size()) {
            temp = first;
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }
            temp.previous.next = temp.next;
            temp.next.previous = temp.previous;
        }
        return temp.data;
    }

    @Override
    public void replace(T item, int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

}
