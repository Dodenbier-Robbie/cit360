/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Enumeration;
import java.util.GregorianCalendar;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Robbie Dodenbier
 */
public class ServletExample extends HttpServlet {
    public void init() throws ServletException {
        
    }
    
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Set response content type
        response.setContentType("text/html");
        
        // Generate HTML file
        PrintWriter out = response.getWriter();
        String title = "CTI 360 Servlet Example";
        String doctype = "<!DOCTYPE HTML>";
        String cssStyles = "table {\n" + "border-collapse: collapse;\n" + "}\n" + "table, th, td {\n" + "border: 1px solid black;\n" +
            "}\n" + "th, td {\n" + "padding: 10px;\n" + "text-align: left;\n" + "}\n" + ".currentDate {\n" + "font-size: 12px;\n" + "}";
        
        // Get current time and date
        Calendar calendar = new GregorianCalendar();
        String am_pm;
        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int year = calendar.get(Calendar.YEAR);
        
        if(calendar.get(Calendar.AM_PM) == 0)
            am_pm = "AM";
        else
            am_pm = "PM";
        
        String currentDateTime = month + "/" + day + "/" + year + " (" + hour + ":" + minute + ":" + second + " " + am_pm + " )";
              
        if(response.getStatus() == 200) {            
            out.write(doctype + 
                    "\n<html>\n"
                  + "<head>\n"
                  + "<title>" + title + "</title>\n"
                  + "</head>\n"
                  + "<style>" + cssStyles + "</style>\n"
                  + "<body>\n"
                  + "<h1>Output Values</h1>"
                  + "<p>Here is the output, returned by the server, of what you entered into the form</p>"
                  + "<table border=\"1\">\n"
                  + "<tr>\n"
                  + "<th>First Name</th>"
                  + "<th>Last Name</th>"
                  + "<th>Email</th>"
                  + "<th>Phone Number</th>"
                  + "<th>Favorite Color</th>"
                  + "<tr>\n"
                  + "<tr>\n"
                  + "<td>" + request.getParameter("firstName") + "</td>\n"
                  + "<td>" + request.getParameter("lastName") + "</td>\n"
                  + "<td>" + request.getParameter("email") + "</td>\n"
                  + "<td>" + request.getParameter("phoneNumber") + "</td>\n"
                  + "<td>" + request.getParameter("colors") + "</td>\n"
                  + "</tr>\n"
                  + "</table>\n"
                  + "<p class=\"currentDate\"><em>Received by server: " + currentDateTime + "</em></p>\n"
                  + "</body>\n"
                  + "</html>"
            );
        }else {
            // Set error code and reason.
            response.sendError(400, "No request was received!" );
        }
    }
    
    public void destroy() {
        
    }
}
