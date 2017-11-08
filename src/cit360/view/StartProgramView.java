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
        + "\n\nCurrent grading is as such:"
        + "\nJava Collections:\t\tBasic"
        + "\nHibernate:\t\t\tBasic"
        + "\nURL and HTTP:\t\t\tBasic"
        + "\nJSON:\t\t\t\tBasic"
        + "\nJUnit:\t\t\t\tBasic"
        + "\nThreading:\t\t\tBasic"
        + "\nACP:\t\t\t\tBasic"
        + "\nMVC:\t\t\t\tBasic"
        + "\nServlet:\t\t\tBasic"
        + "\nUse Case Diagrams:\t\tTurned in"
        + "\nUse Case Documents:\t\tTurned in"
        + "\nState Diagrams:\t\t\tTurned in"
        + "\nSequence Diagrams:\t\tTurned in"
        + "\nSystem Level Tests:\t\tTurned in"
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