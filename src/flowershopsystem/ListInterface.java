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
public interface ListInterface<T> {
    
    public T get(int position);
    
    public void insert(T anElement);
    
    public void insert(int position, T anElement);
    
    public T remove();
    
    public T removeAt(int position);
    
    public void replace(T anElement, int position);
    
    public int size();
    
    public boolean isEmpty();
    
    public boolean isFull();
}
