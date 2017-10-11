/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.view;

import cit360.control.CollectionsExample;
import cit360.control.HttpConnectionExample;
import java.util.Scanner;

/**
 *
 * @author rdodenbier
 */
class MainMenuView {
    
    private final String menu;
        
    public MainMenuView(){
        this.menu = ("\n"
            + "\n-----------------------------------------"
            + "\n |Main Menu                             |"
            + "\n-----------------------------------------"
            + "\n1 - Java Collections"
            + "\n2 - Hibernate"
            + "\n3 - URL and HTTP"
            + "\n4 - JSON"
            + "\n5 - JUnit"
            + "\n6 - Threading"
            + "\n7 - ACP"
            + "\n8 - MVC"
            + "\n9 - Servlet"   
            + "\nQ - Quit"
            + "\n-----------------------------------------");
    }
    
    void displayMenu() throws Exception {
        boolean done = false;
        do {
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q"))
                return; // exit the game
                
            done = this.doAction(menuOption);
            
        } while (!done);
    }

    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in);
        String choice = "";
        boolean valid = false;
        
        while (!valid) {
            System.out.println("\n" + this.menu); 
            
            choice = keyboard.nextLine();
            choice = choice.trim();
            
            if (choice.length() < 1) {
                System.out.println("\nInvalid value: value cannot be blank");
                continue;
            }
            
            break;
        }
        
        return choice;
    }
      
    private boolean doAction(String choice) throws Exception {
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "1":
                this.displayJavaCollections();
                break;  
            case "2":
                this.displayHibernation();
                break;
            case "3":
                this.displayURL();
                break;
            case "4":
                this.displayJSON();
                break;
            case "5":
                this.displayJUnit();
                break;                 
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }

        return false;
    } 
    
    private void displayJavaCollections() {
        CollectionsExample displayJavaCollection = new CollectionsExample();
        displayJavaCollection.collectionExampleDisplay();
    }

    private void displayHibernation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayURL() throws Exception {
        HttpConnectionExample displayUrl = new HttpConnectionExample();
        displayUrl.sendGet();
    }

    private void displayJSON() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayJUnit() {
        System.out.println("Handled using the Test Suite");
    }
}
