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
import java.util.concurrent.atomic.AtomicInteger;
/**
 *
 * @author rdodenbier
 */

public class ExecutorServiceExample {

    private static Future playerTwo;
    private static Future playerThree;
    
    AtomicCounter counter = new AtomicCounter();

    public void ExecutorServiceExample() throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        Runnable threadOne = new MyThread("\nRunner One", 5);
        executor.execute(threadOne);
        for(int i = 0; i < 10; i++) {
            if(playerTwo == null) {
                playerTwo = executor.submit(new MyThread("Runner Two", 10));
            }else {
                playerTwo = executor.submit(new MyThread("Runner Two", i*15));
            }

            if(playerThree == null) {
                playerThree = executor.submit(new MyThread("Runner Three", 20));
            }else {
                playerThree = executor.submit(new MyThread("Runner Three", i*20));
            }    
            
            if(playerTwo.get() == null) {
                System.out.println("-------------------------------------------------------------");
                System.out.println(i + 1 + ") ThreadTwo terminated successfully");
            } else {
                playerTwo.cancel(true);
            }
            if(playerThree.get() == null) {
                System.out.println(i + 1 + ") ThreadThree terminated successfully");
                System.out.println("-------------------------------------------------------------");
            } else {
                playerThree.cancel(true);
            }
        }      
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.SECONDS);
        System.out.println("All tasks are finished!");
        System.out.println("A total of " + counter.getValue() + " threads ran successfull!!!");
    }
}
