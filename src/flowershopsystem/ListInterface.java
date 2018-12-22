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
    
    //Description: to get the element at given @param position
    //Precondition: position must not exceed the size of the list and the list
    //              must exist
    //Return Value: element with generic type at the parametererised position 
    public T get(int position);
    //Description: insert anElement to the end of the list
    //Precondition: the list must exist
    //Postcondition: anElement will be added to the end of the list
    public void insert(T anElement);
    //Description: insert anElement at the parameterised position of the list
    //Precondition: the position must not larger then the size of the list
    //Postcondition: anElement will be added into the list at the position 
    //               number of the list
    //return value: true if anElement added succesfully into the parameterised 
    //              position of the list
    public boolean insert(int position, T anElement);
    //Description: remove an element at the end of list
    //Precondition: the list must be exist and not empty
    //Postcondition: the element at the end of the list is removed
    //Return Value: element with generic type at the end of the list
    public T remove();
    //Description: remove an element at the any position of the list
    //Precondition: the parameterised position must not exceed the size of the 
    //              list
    //Postcondition: the element at the parametrised position is removed from
    //               the list
    //Return Value: the element at the parameterised position
    public T removeAt(int position);
    //Description: change the content of the element in the list at the 
    //             parameterised position
    //Precondition:the parameterised position cannot exceed the size of the list
    //Postcondition: the element at the paremeterised postion of the list is
    //               replaced with anElement.
    public void replace(T anElement, int position);
    //Description: to find the size of the list
    //Return Value: the size of the list
    public int size();
    //Description: to check if the list is empty
    //return value: true if the list has no element
    public boolean isEmpty();
    
    public boolean isFull();
}
