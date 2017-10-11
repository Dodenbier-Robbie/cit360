/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360;

import cit360.control.HttpConnectionExample;
import cit360.view.StartProgramView;

/**
 *
 * @author rdodenbier
 */
public class Cit360 {

    /**
     * @param args the command line arguments
     */
       
    public static void main(String[] args) throws Exception {
        
        StartProgramView startProgramView = new StartProgramView ();
        startProgramView.displayBanner();
        
    }    
}
