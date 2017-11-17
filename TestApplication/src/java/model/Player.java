/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author rdodenbier
 */
public class Player {
    
    private String playerFirstName;
    private String playerLastName;
    private int playerScore;
    private int playerId;
    
    public Player() {
    }
    
    public Player(String playerFirstName, String playerLastName, int playerScore  ) {
        this.playerFirstName = playerFirstName;
        this.playerLastName = playerLastName;
        this.playerScore = playerScore;
    }

    public void setPlayerFirstName(String playerFirstName) {
        this.playerFirstName = playerFirstName;
    }
    
    public String getPlayerFirstName() {
        return playerFirstName;
    }
    
    public void setPlayerLastName(String playerLastName) {
        this.playerLastName = playerLastName;
    }
    
    public String getPlayerLastName() {
        return playerLastName;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public void setPlayerScore(int playerScore) {
        this.playerScore = playerScore;
    }
    
    public int getPlayerId() {
        return playerId;
    }
    
    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }
}