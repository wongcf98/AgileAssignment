/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowershopsystem;

import java.util.Iterator;

/**
 *
 * @author LIANG
 */
public interface CustomizeListInterface<T> {

    public void enqueue(T newEntry);

    public void enqueueFront(T newEntry);

    public T dequeue();

    public T getIndex(int index);

    public T getFront();

    public void set(int index, T data);
    
    public boolean isEmpty();

    public Integer size();

}
