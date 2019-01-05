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
public class queueListTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        CustomizeLinkedList<String> list = new CustomizeLinkedList();
//
//        list.enqueue("a");
//        list.enqueue("b");
//        list.enqueue("c");
//        list.enqueue("d");
//        list.enqueue("e");
//        list.enqueueFront("A");
//        list.enqueueFront("B");
//        list.enqueueFront("C");
//        list.enqueueFront("D");
//        list.enqueueFront("E");
//
//        System.out.println("getIndex(): " + list.getIndex(3));
//        list.set(3, "CC");
//        System.out.println("set():  " + list.getIndex(3));
//        while (!list.isEmpty()) {
//            System.out.println(list.dequeue());
//        }

        CatalogListInterface<String> list1 = new CatalogListInterfaceImpl<>();
        
        list1.insert("AAA");
        list1.insert("BBB");
        list1.insert("CCC");
        
        System.out.println(list1.removeAt(3));
    }

}
