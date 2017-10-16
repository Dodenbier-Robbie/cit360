/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.view;

/**
 *
 * @author rdodenbier
 */
public class StartProgramView {
            
    public void displayBanner() throws Exception {
        System.out.println(    
        "\n*************************************************"
        + "\n                                               *"
        + "\nWelcome to CIT 360!!!!!!"
        + "\n\nThis is your chance to review my code and"
        + "\nsee if it works!"
        + "\n\nCurrent grading is a such:"
        + "\nJava Collections:\t\tTurned In"
        + "\nHibernate:\t\t\tNot yet started"
        + "\nURL and HTTP:\t\t\tReady to turn in"
        + "\nJSON:\t\t\t\tNot yet started"
        + "\nJUnit:\t\t\t\tBasic"
        + "\nThreading:\t\t\tNot yet started"
        + "\nACP:\t\t\t\tNot yet started"
        + "\nMVC:\t\t\t\tNot yet started"
        + "\nServlet:\t\t\tNot yet started"
        + "\n************************************************"
        );
        
        displayNextView();
    }
    
    private void displayNextView() throws Exception {
        // Create MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.displayMenu();
    }
}