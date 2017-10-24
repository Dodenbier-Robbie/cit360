/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.model;

import com.mysql.jdbc.Connection;
import java.util.Iterator;
import java.util.List;
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

    public void addPlayer(String firstName, String lastName, int score) {
        session = factory.openSession();
        try {
            tx = session.beginTransaction();
            Player player = new Player(firstName, lastName, score);
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
    
    public void getListPlayers() {
        session = factory.openSession();
        try {
            tx = session.beginTransaction();
            List players = session.createQuery("FROM Player").list();
            
            for(Iterator iterator = players.iterator(); iterator.hasNext();){
                Player player = (Player) iterator.next(); 
                System.out.print("ID: " + player.getPlayerId());
                System.out.print("\tFirst Name: " + player.getPlayerFirstName()); 
                System.out.print("\tLast Name: " + player.getPlayerLastName()); 
                System.out.println("\tScore: " + player.getPlayerScore()); 
         }
            tx.commit();
        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.flush();
            session.close();
        }
    }
    
    public void updatePlayerScore(int playerId, int score) {
        session = factory.openSession();
        try {
                tx = session.beginTransaction();
                Player player = (Player)session.get(Player.class, playerId);
                player.setPlayerScore(score);
                session.update(player);
                tx.commit();
                
                System.out.println("Updated Score:");
                System.out.print("ID: " + player.getPlayerId());
                System.out.print("\tFirst Name: " + player.getPlayerFirstName()); 
                System.out.print("\tLast Name: " + player.getPlayerLastName()); 
                System.out.println("\tScore: " + player.getPlayerScore());
                
        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.flush();
            session.close();
        }
    }
    
    public void deletePlayer (int playerId){
        session = factory.openSession();
        try {
            tx = session.beginTransaction();
            Player player = (Player)session.get(Player.class, playerId);
            session.delete(player);
            tx.commit();
        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.flush();
            session.close();
        }
    }
}
