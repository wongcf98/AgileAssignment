/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowershopsystem;

/**
 *
 * @author Yaw Zhi Jun
 */
public interface CatalogListInterface<T> {

    public T get(int index);

    public boolean insert(T item);

    public boolean insert(int index, T item);

    public T remove();

    public T removeAt(int index);

    public void replace(T item, int index);

    public int size();

    public boolean isEmpty();

    public boolean isFull();
}
