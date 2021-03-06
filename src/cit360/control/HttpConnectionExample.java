/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.control;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author rdodenbier
 */
public class HttpConnectionExample {
    
    private final String USER_AGENT = "Mozilla/5.0";
    private String url;
    
    // HTTP GET request
    public void sendGet(String url) throws IOException {

	this.url = url;

	URL obj = new URL(url);
	HttpURLConnection con = (HttpURLConnection) obj.openConnection();

	// optional default is GET
	con.setRequestMethod("GET");

	//add request header
	con.setRequestProperty("User-Agent", USER_AGENT);

	int responseCode = con.getResponseCode();
        System.out.println("\n****** Sending GET request ******");
	System.out.println("\nSending 'GET' request to URL : " + url);
	System.out.println("Response Code : " + responseCode);

        if(responseCode == con.HTTP_OK) {
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
            }
            in.close();

            //print result
            System.out.println(response.toString());
        } else {
            con.disconnect();
            System.out.println("GET request failed. Your connection has been reset!!");
        }
    }
}