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
    /*  
     Description: get the element from the list
     Preconditions: the index must contain data
        Return: return the elemtent of the index
     */
    public void insert(T item);
/*  
     Description: add item with generic type into the list
     Preconditions: the item must be generic types 
     Postcondition: item is added into the list    
     */
    public void insert(int index, T item);
/*  
     Description: add item with generic type into the list
     Preconditions: the item must be generic types 
     Postcondition: item is added into the specific index of the list    
     */
    public T remove();
 /*  
     Description: get and remove an object with generic type from the list
     Preconditions: The list must exist and not empty 
     Postcondition: the object of the list is removed 
     Return value: An object of generic type of the list
     */
    public T removeAt(int index);
 /*  
     Description: get and remove an object with generic type from the list
     Preconditions: The list must exist and not empty 
     Postcondition: the object with specific index in the list is removed 
     Return value: An object of generic type of the list
     */
    public void replace(T item, int index);
   /*  
     Description: change the object at the specific position on the list
     Preconditions: the item must be generic type and the list must exist
     Postcondition: the object at the index positions is 
     replaced with  item
     return value: true if the the item successfully replace the 
     element at the index position
     */
    public int size();
/*  
     Description: to check the size of the list
     Preconditions: the list must be exist
     Return value: a value of the size of the list
     */
    public boolean isEmpty();
/*  
     Description: to check if the list has no object into
     Preconditions: the list must exist
     return value: true if the list has no element  
     */
    public boolean isFull();
}
