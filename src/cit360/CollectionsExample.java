/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

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
        
        listofcountries.remove(5);
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
    }   
}
