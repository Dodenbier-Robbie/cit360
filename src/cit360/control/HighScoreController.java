/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.control;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

/**
 *
 * @author rdodenbier
 */
public class HighScoreController {
    
    public ArrayList<HighScore> getHighScores() {
        // create an ArrayList of high scores 
        ArrayList<HighScore> highScore = new ArrayList<>();

        // adding objects to the ArrayList
        highScore.add(new HighScore("Robbie", 400));
        highScore.add(new HighScore("Camden", 50));
        highScore.add(new HighScore("Peter", 100));
        highScore.add(new HighScore("Michelle", 300));
        highScore.add(new HighScore("Kenadie", 200));
        
        Collections.sort(highScore, new Comparator<HighScore>() {
            @Override
            public int compare(HighScore o1, HighScore o2) {
            return o2.getPlayerScore() - o1.getPlayerScore();
            }
        });
        
        return highScore;
    }

    public static class HighScore {

    public String playerName;
    public int playerScore;

    
    public HighScore(String playerName, int playerScore) {
        this.playerName = playerName;
        this.playerScore = playerScore;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public void setPlayerScore(int playerScore) {
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
        return (playerName + "\t\t\t" + playerScore);
    }
}}

