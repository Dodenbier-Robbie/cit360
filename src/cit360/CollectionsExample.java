/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/**
 *
 * @author rdodenbier
 */
public class CollectionsExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ArrayList Example
        ArrayList<String> listofcountries = new ArrayList<String>();
        listofcountries.add("Netherlands");
        listofcountries.add("France");
        listofcountries.add("Germany");
        listofcountries.add("United States of America");
        listofcountries.add("Spain");
        listofcountries.add("Venezula");
        listofcountries.add("Brazil");
        
        //Display Current ArrayList
                System.out.println("Origial Array List:");
        for(String counter: listofcountries) {
                System.out.println(counter);
        }
        
        listofcountries.remove("Venezula");
        listofcountries.remove(3);
        
        //Display Removed ArrayList
                System.out.println("\nCurrent Array List:");
        for(String counter: listofcountries) {
                System.out.println(counter);
        }
        
        //Display Unsorted List
                System.out.println("\nBefore Sorting:");
        for(String counter: listofcountries) {
                System.out.println(counter);
        }
        
        //Sort statement
        Collections.sort(listofcountries);
        
        //Display Sorted List
                System.out.println("\nAfter Sorting:");
        for(String counter: listofcountries) {
                System.out.println(counter);
        }
        
        //LinkedList Example
        LinkedList<String> linkedlist = new LinkedList<String>();
        linkedlist.add("Item1");
        linkedlist.add("Item10");
        linkedlist.add("Item13");
        linkedlist.add("Item4");
        linkedlist.add("Item7");
        
        //Display LinkedList items
                System.out.println("\nOrignial LinkedList:");
        for(String counter: linkedlist) {
                System.out.println(counter);
        }
        
        //Add First and Last
        linkedlist.addFirst("First Item");
        linkedlist.addLast("Last Item");
        
        //Display LinkedList items
                System.out.println("\nFirst/Last Item LinkedList:");
        for(String counter: linkedlist) {
                System.out.println(counter);
        }
        
        //Get and Set values in the list
        String firstItem = linkedlist.get(0);
                System.out.println("\nFirst element is: " + firstItem);
        linkedlist.set(0, "Changed First Item");
        firstItem = linkedlist.get(0);
                System.out.println("First element is: " + firstItem);
        
        //Remove first and last items in a list
        linkedlist.removeFirst();
        linkedlist.removeLast();
                System.out.println("\nRemove First/Last LinkedList:");
        for(String counter: linkedlist) {
                System.out.println(counter);
        }
        
        //Add/remove from a position in the list
        linkedlist.add(0, "Additional Item");
        linkedlist.remove(2);
                System.out.println("\nFinal LinkedList:");
        for(String counter: linkedlist) {
                System.out.println(counter);
        }
        
        //Queue example
        Queue<String> peopleQueue = new LinkedList<String>();
        
        //Add people to queue
        peopleQueue.add("Robbie");
        peopleQueue.add("Michelle");
        peopleQueue.add("Camden");
        peopleQueue.add("Kenadie");
        
        //Display queue
                System.out.println("\nQueue LinkedList:");
        for(String counter: peopleQueue) {
                System.out.println(counter);
        }
        
        //Remove people from the queue
        System.out.println("\nRemoved element: " + peopleQueue.poll());
        
        //Return first element in the queue
        System.out.println("\nHead element: " + peopleQueue.peek());
        
        //HashMap Example
        HashMap<Integer, String> peopleMap = new HashMap<Integer, String>();
        
        //Add people and map key
        peopleMap.put(39, "Robbie");
        peopleMap.put(37, "Michelle");
        peopleMap.put(12, "Camden");
        peopleMap.put(4, "Kenadie");
        
        //display map contents using iterator
        Set set = peopleMap.entrySet();
        Iterator iterator = set.iterator();
        System.out.println("\nKey & Value output:");
        while (iterator.hasNext()) {
            Map.Entry mapEntry = (Map.Entry)iterator.next();
            System.out.println("Key is: " + mapEntry.getKey() + " & value is: " + mapEntry.getValue());           
        }
    }   
}
