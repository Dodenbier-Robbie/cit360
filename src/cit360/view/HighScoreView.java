/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.view;

import cit360.control.HighScoreController;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author rdodenbier
 */
public class HighScoreView {

    private String menu;
    
    public HighScoreView() {
        this.menu = ("\n"
            + "\n-----------------------------------------"
            + "\n |High Score Menu                       |"
            + "\n-----------------------------------------"
            + "\n\nDo you want to see the high scores?   "
            + "\nY - Yes"
            + "\nN - No"   
            + "\n-----------------------------------------");                
    }
    
    public void displayMenu() throws Exception {
        boolean done = false;
        do {
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("N"))
                return;
            
            if (menuOption.toUpperCase().equals("Q"))
                return;
                
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
            case "Y":
                this.displayHighScore();
                break;                  
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }

        return false;
    }

    private void displayHighScore() throws Exception {
        HighScoreController displayHighScores = new HighScoreController();
        ArrayList<HighScoreController.HighScore> displayScores;
        displayScores = displayHighScores.getHighScores();
        
        System.out.println("\n"
            + "\n-----------------------------------------"
            + "\n |Current High Scores                   |"
            + "\n-----------------------------------------");
        
        for (int i = 0; i < displayScores.size(); i++){
            System.out.println(i+1 + ": " + displayScores.get(i));
        }
        
        displayMainMenu();
        
    }
    
    private void displayMainMenu() throws Exception {
        // Create MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.displayMenu();
    }
}
