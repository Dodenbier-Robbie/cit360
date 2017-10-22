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
public class PlayerView {
    
    public void printPlayerInfo(String playerFirstName, String playerLastName, int playerScore, int playerId) {
        System.out.println("\nPlayer"
                + "\nID: " + playerId
                + "\nFirst Name: " + playerFirstName
                + "\nLast Name: " + playerLastName
                + "\nScore: " + playerScore);
    }
}