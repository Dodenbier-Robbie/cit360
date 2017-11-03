/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.treads;

/**
 *
 * @author rdodenbier
 */
public class MyThread implements Runnable {
	
    private String myName;
    private int count;
    private final long timeSleep;

    MyThread(String name, int newcount, long newtimeSleep) {
        this.myName = name;
        this.count = newcount;
        this.timeSleep = newtimeSleep;
    }

    @Override
    public void run() {
            int sum = 0;
        for (int i = 1; i <= this.count; i++) {
            sum = sum + i;
        }
        System.out.println(myName + " thread has sum = " + sum + 
                    " and is going to sleep for " + timeSleep);
        try {
                    Thread.sleep(this.timeSleep);
            } catch (InterruptedException e) {
                    e.printStackTrace();
            }
    }

}
