/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.model;

import cit360.control.HighScoreController;
import cit360.control.HighScoreController.HighScore;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author rdodenbier
 */
public class HighScoreModel implements Serializable {
    
    private HighScore playerName;
    private HighScore playerScore;
    private ArrayList<HighScoreController.HighScore> highScore;
    
    public HighScoreModel() {
    }

    public HighScore getPlayerName() {
        return playerName;
    }

    public void setPlayerName(HighScore playerName) {
        this.playerName = playerName;
    }

    public HighScore getPlayerScore() {
        return playerScore;
    }

    public void setPlayerScore(HighScore playerScore) {
        this.playerScore = playerScore;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.playerName);
        hash = 89 * hash + Objects.hashCode(this.playerScore);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final HighScore other = (HighScore) obj;
        if (!Objects.equals(this.playerName, other.playerName)) {
            return false;
        }
        if (!Objects.equals(this.playerScore, other.playerScore)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "HighScore{" + "playerName=" + playerName + ", playerScore=" + playerScore + '}';
    }
    
}
