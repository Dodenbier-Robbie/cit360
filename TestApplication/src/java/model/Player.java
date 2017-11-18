/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author rdodenbier
 */
public class Player {
    
    private String playerFirstName;
    private String playerLastName;
    private String playerEmail;
    private String playerPhone;
    private Date createDate;
    private int playerId;
    
    public Player() {
    }
    
    public Player(String playerFirstName, String playerLastName, String playerEmail, String playerPhone, Date createDate) {
        this.playerFirstName = playerFirstName;
        this.playerLastName = playerLastName;
        this.playerEmail = playerEmail;
        this.playerPhone = playerPhone;
        this.createDate = createDate;
    }
    
    public Player(int playerId, String playerFirstName, String playerLastName, String playerEmail, String playerPhone, Date createDate) {
        this.playerId = playerId;
        this.playerFirstName = playerFirstName;
        this.playerLastName = playerLastName;
        this.playerEmail = playerEmail;
        this.playerPhone = playerPhone;
        this.createDate = createDate;
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

    public String getPlayerEmail() {
        return playerEmail;
    }

    public void setPlayerEmail(String playerEmail) {
        this.playerEmail = playerEmail;
    }
    
    public String getPlayerPhone() {
    return playerPhone;
    }

    public void setPlayerPhone(String playerPhone) {
        this.playerPhone = playerPhone;
    }
    
    public Date getCreateDate() {
    return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }    
    
    public int getPlayerId() {
        return playerId;
    }
    
    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }
}