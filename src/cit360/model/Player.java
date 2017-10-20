/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.model;

/**
 *
 * @author rdodenbier
 */
public class Player {
    
    private String playerName;
    private int playerScore;
    private int playerId;

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
    
    public String getPlayerName() {
        return playerName;
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
