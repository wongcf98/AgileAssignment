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
    //Description : Add and remove the new element in the list
    //Pre-condition : The list must not empty and exist
    //Post-Condition : The existing object is removed
    //Return value : new element added in the list 

    public void enqueueFront(T newEntry);
    //Description : Add and remove the new element in the list
    //Pre-condition : The list must not empty and exist
    //Post-Condition : The front object is removed
    //Return value : new element added in the front list 

    public T dequeue();
    //Description : Remove the element in the list
    //Pre-condition : The list must not empty and exist
    //Post-Condition : The existing object is removed 

    public T getIndex(int index);
    //Description : Obtain the specific object in the list
    //Pre-condition : The list must not empty and exist
    //Post-Condition : The object of the index position will replaced b a new Element.
    //Return value : True if replace successfully at the index position
   
    public T getFront();
    //Description : To get and check the value at the front of the list
    //Pre-condition : The list must not empty and exist
    //Return value : true if no value at the front of the list 
    
    public boolean isEmpty();
    //Description : Use to check the object by display the string stored in the list 
    //Pre-condition : The list must not empty and exist
    //Return value : String will indicate the elements in the list
   
    public Integer size();
     //Description : To check the size that stored in the list
    //Pre-condition : The list must not empty and exist
    //Return value : true if size available 
    
}
