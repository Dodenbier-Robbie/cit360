/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.treads;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
/**
 *
 * @author rdodenbier
 */


public class ExecutorServiceExample {

    private static Future playerTwo;
    private static Future playerThree;

    public void ExecutorServiceExample() throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        Runnable threadOne = new MyThread("\nPlayerOne", 2);
        executor.execute(threadOne);
        for(int i = 0; i < 2; i++) {
            if(playerTwo == null) {
                playerTwo = executor.submit(new MyThread("PlayerTwo", 10));
            }else {
                playerTwo = executor.submit(new MyThread("PlayerTwo", 20));
            }

            if(playerThree == null) {
                playerThree = executor.submit(new MyThread("PlayerThree", 50));
            }else {
                playerThree = executor.submit(new MyThread("PlayerThree", 500));
            }    
            
            if(playerTwo.get() == null) {
                System.out.println("-------------------------------------------------------------");
                System.out.println(i + 1 + ") PlayerTwo terminated successfully");
            } else {
                playerTwo.cancel(true);
            }
            if(playerThree.get() == null) {
                System.out.println(i + 1 + ") PlayerThree terminated successfully");
                System.out.println("-------------------------------------------------------------");
            } else {
                playerThree.cancel(true);
            }
        }
      
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.SECONDS);
        System.out.println("All tasks are finished!");
    }
}
