/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360;

/**
 *
 * @author rdodenbier
 */
public class Cit360 {

    /**
     * @param args the command line arguments
     */
       
    public static void main(String[] args) throws Exception {
        
        HttpConnectionExample http = new HttpConnectionExample();

	System.out.println("Testing 1 - Send Http GET request");
	http.sendGet();
        
    }    
}
