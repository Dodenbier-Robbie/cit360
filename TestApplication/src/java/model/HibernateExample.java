/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.mysql.jdbc.Connection;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import model.Player;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author rdodenbier
 */
public class HibernateExample {

    private static SessionFactory factory;
    private static Transaction tx;
    private static Session session;
    
    public HibernateExample () {
        try {
            factory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) { 
            System.err.println("Failed to create sessionFactory object." + ex);
      }
    }

    public void addPlayer(String firstName, String lastName, String email, String phone, Date createDate) {
        session = factory.openSession();
        try {
            tx = session.beginTransaction();
            Player player = new Player(firstName, lastName, email, phone, createDate);
            session.save(player);
            tx.commit();
        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.flush();
            session.close();
        }
    }
    
    public ArrayList<Player> getListPlayers() {
        session = factory.openSession();
        ArrayList<Player> playerList = new ArrayList<Player>();
        try {
            tx = session.beginTransaction();
            List players = session.createQuery("FROM Player").list();
            
            for(Iterator iterator = players.iterator(); iterator.hasNext();){
                Player player = (Player) iterator.next();
                playerList.add(new Player(player.getPlayerId(), player.getPlayerFirstName(),
                    player.getPlayerLastName(), player.getPlayerEmail(), player.getPlayerPhone(),
                    player.getCreateDate()));
         }
            tx.commit();
        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.flush();
            session.close();
        }
        return playerList;
    }    
}
