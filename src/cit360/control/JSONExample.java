/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.control;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;



/**
 *
 * @author rdodenbier
 */
public class JSONExample {
    
    public void JSONencodeExample() {
        JSONObject obj = new JSONObject();
        
        obj.put("name", "foo");
        obj.put("num", new Integer(100));
        obj.put("blance", new Double(100.21));
        obj.put("is_vip", new Boolean(true));
        
        System.out.println(obj);
        
        JSONdecodeExample();
    }
    
    public void JSONdecodeExample() {
        JSONParser parser = new JSONParser();

        try {

            Object obj = parser.parse(new FileReader("/Users/rdodenbier/Documents/GitHub/cit360/dodenbier-robbie.github.io/cit261/scripts/disney.json"));

            JSONArray array = (JSONArray)obj;
            
            for(int i=0; i < array.size(); i++) {
                JSONObject jsonobject = (JSONObject) array.get(i);
                
                String ride = (String) jsonobject.get("ride");
                System.out.println("\nRide: " + ride);
                
                String firstOpen = (String) jsonobject.get("firstOpen");
                System.out.println("First Opened: " + firstOpen);
                
                String heightRestriction = (String) jsonobject.get("heightRestriction");
                System.out.println("Height Restriction: " + heightRestriction);
                
                String picURL = (String) jsonobject.get("picURL");
                System.out.println("Pic URL: " + picURL);
                
                JSONArray location = (JSONArray) jsonobject.get("location");
                Iterator<String> iterator = location.iterator();
                System.out.println("Locations:");
                while (iterator.hasNext()) {
                    System.out.println("  " + iterator.next());
                }
            }
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
