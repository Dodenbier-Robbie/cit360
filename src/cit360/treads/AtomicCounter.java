package cit360.treads;

import java.util.concurrent.atomic.AtomicInteger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rdodenbier
 */
public class AtomicCounter {
    private final AtomicInteger counter = new AtomicInteger();
    
    public int nextValue() {
        return counter.incrementAndGet();
    }
    
    public int getValue() {
        return counter.get();
    }
}