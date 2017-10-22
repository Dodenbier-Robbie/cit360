/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.model;

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
public class HibernateTest {

    private static SessionFactory factory;
    private static Transaction tx;
    
    public HibernateTest () {
        factory = new Configuration().configure().buildSessionFactory();
    }

    public void addPlayer(String firstName, String lastName, int score) {
        factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
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
        factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
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
        factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        try {
            String hql = "UPDATE Player set score = :score "  + 
                        "WHERE player_id = :playerId";
                Query query = session.createQuery(hql);
                query.setParameter("score", score);
                query.setParameter("playerId", playerId);
                int result = query.executeUpdate();
                
                Player player = (Player)session.get(Player.class, playerId);
                player.setPlayerScore(score);
                
                System.out.println("Updated Score:");
                System.out.print("ID: " + player.getPlayerId());
                System.out.print("\tFirst Name: " + player.getPlayerFirstName()); 
                System.out.print("\tLast Name: " + player.getPlayerLastName()); 
                System.out.println("\tScore: " + player.getPlayerScore());

                System.out.println("Rows affected: " + result);
        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.flush();
            session.close();
        }
    }
    
    public void deletePlayer (int playerId){
        factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        try {
            String hql = ("DELETE FROM Player "  + 
                        "WHERE player_id = :playerId");
            Query query = session.createQuery(hql);
            query.setParameter("playerId", playerId);
            
            int result = query.executeUpdate();
            System.out.println("Rows affected: " + result);
        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.flush();
            session.close();
        }
    }
}
