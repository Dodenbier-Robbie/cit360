/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.control;

import cit360.model.Player;
import cit360.view.PlayerView;

/**
 *
 * @author rdodenbier
 */
public class PlayerController {
    
    private Player model;
    private PlayerView view;
    
    public PlayerController(Player model, PlayerView view ) {
     this.model = model;
     this.view = view;
    }
    
    public void setPlayerFirstName(String firstName) {
        model.setPlayerFirstName(firstName);
    }
    
    public String getPlayerFirstName() {
        return model.getPlayerFirstName();
    }
    
    public void setPlayerLastName(String lastName) {
        model.setPlayerFirstName(lastName);
    }
    
    public String getPlayerLastName() {
        return model.getPlayerLastName();
    }
    
    public void setPlayerScore(int score) {
        model.setPlayerScore(score);
    }
    
    public int getPlayerScore() {
        return model.getPlayerScore();
    }
    
    public void setPlayerId(int id) {
        model.setPlayerId(id);
    }
    
    public int getPlayerId() {
        return model.getPlayerId();
    }
    
    public void updateView() {
        view.printPlayerInfo(model.getPlayerFirstName(), model.getPlayerLastName(), model.getPlayerScore(), model.getPlayerId());
    }
    
}

