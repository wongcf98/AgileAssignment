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
public interface QueueInterface<T> {

    /*  
     Description: add anElement with generic type into the list
     Preconditions: the anElement must be generic types 
     Postcondition: anElement is added into the rear of the list    
     */
    public void enqueue(T anElement);

    /*  
     Description: get and remove an object with generic type from the list
     Preconditions: The list must exist and not empty 
     Postcondition: the object at the front of the list is removed 
     Return value: An object of generic type at the front of the list
     */
    public T dequeue();

    /*  
     Description: get an object of generic type from the list 
     at the index position
     Preconditions: The list must exist and not empty 
     Postcondition: Object of generic type at index position of the list is 
     returned  
     Return value: Object of generic type at index position of the list
     */
    public T get(int index);
    
    public void set(int index, T newElement);
    /*  
     Description: change the object at the specific position on the list
     Preconditions: the newElement must be generic type and the list must exist
     Postcondition: the object at the index positions is 
     replaced with  newElement
     return value: true if the the newElement successfully replace the 
     element at the index position
     */

    public boolean replace(int index, T newElement);
    /*  
     Description: get the object of generic type at the front of the list
     Preconditions: the list must not be empty or null
     return value: an object of generic type is returned frim the position    
     */

    public T getFront();
    /*  
     Description: to check if the list has no object into
     Preconditions: the list must exist
     return value: true if the list has no element  
     */

    public boolean IsEmpty();
    /*  
     Description: display a string showing the object stored in the list
     Preconditions: the list must have elements and be exist
     Return value: a string indicating the elements in the list
     */

    public String toString();
}
