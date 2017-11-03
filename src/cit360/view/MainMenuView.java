/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.view;

import cit360.control.CollectionsExample;
import cit360.control.HttpConnectionExample;
import cit360.control.JSONExample;
import cit360.treads.MyThread;
import cit360.control.PlayerController;
import cit360.model.HibernateExample;
import cit360.model.Player;
import cit360.treads.ExecutorServiceTest;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

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
            case "6":
                this.displayThreading();
                break;
            case "7":
                this.displayAPC();
                break;
            case "8":
                this.displayMVC();
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
        HibernateExample hibernate = new HibernateExample();
        System.out.println("*** Adding Player to database ***");
        hibernate.addPlayer("Robbie", "Dodenbier", 500);
        hibernate.addPlayer("Michelle", "Dodenbier", 300);
        hibernate.addPlayer("Camden", "Dodenbier", 100);
        hibernate.addPlayer("Kenandie", "Dodenbier", 50);
        
        System.out.println("\n*** Returned Players from database ***");
        hibernate.getListPlayers();
        
        System.out.println("\n*** Update Player score in database ***");
        hibernate.updatePlayerScore(2, 5000);
        
        System.out.println("\n*** Player deleted from database ***");
        hibernate.deletePlayer(2);
        hibernate.getListPlayers();    
                
    }

    private void displayURL() throws Exception {
        String url = "https://dodenbier-robbie.github.io/cit360/HttpConnection.html";
        String url2 = "http://www.android.com";
        
        HttpConnectionExample displayUrl = new HttpConnectionExample();
        displayUrl.sendGet(url);
        displayUrl.sendGet(url2);
    }

    private void displayJSON() throws IOException {
        JSONExample displayJSON = new JSONExample();
        displayJSON.JSONencodeExample();
        displayJSON.JSONdecodeExample();
    }

    private void displayJUnit() {
        System.out.println("Handled using the Test Suite");
    }

    private void displayThreading() throws InterruptedException, ExecutionException {
        ExecutorServiceTest execTest = new ExecutorServiceTest();
        execTest.ExecutorServiceTest();
    }

    private void displayAPC() throws IOException {
        MathCalculatorView mathCalculator = new MathCalculatorView();
        mathCalculator.doMathInput();
        
    }

    private void displayMVC() throws Exception {
        Player model = new Player();
        PlayerView view = new PlayerView();
        PlayerController controller = new PlayerController(model, view);
        
        controller.setPlayerId(1);
        controller.setPlayerFirstName("Robbie");
        controller.setPlayerLastName("Dodenbier");
        controller.setPlayerScore(500);
        controller.updateView();
        
        controller.setPlayerId(2);
        controller.setPlayerFirstName("Michelle");
        controller.setPlayerLastName("Dodenbier");
        controller.setPlayerScore(300);
        controller.updateView();
        
        controller.setPlayerId(3);
        controller.setPlayerFirstName("Camden");
        controller.setPlayerLastName("Dodenbier");
        controller.setPlayerScore(100);
        controller.updateView();
    }
}
