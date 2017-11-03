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
	
    private String threadName;
    private int count;
    private final long timeSleep;

    MyThread(String name, int newcount, long newtimeSleep) {
        this.threadName = name;
        this.count = newcount;
        this.timeSleep = newtimeSleep;
    }

    @Override
    public void run() {
            int laps = 0;
        for (int i = 0; i <= this.count; i++) {
            laps =+ i;
        }
        System.out.println(threadName + " thread ran " + laps + " laps");
        try {
                Thread.sleep(this.timeSleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }

}
