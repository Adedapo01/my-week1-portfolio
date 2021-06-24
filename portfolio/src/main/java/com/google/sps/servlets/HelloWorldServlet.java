package com.google.sps.servlets;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/** Handles requests sent to the /hello URL. Try running a server and navigating to /hello! */
@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {

  


  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
  
    String json = convertToJson();
 
    response.setContentType("application/json;");
	response.getWriter().println(json);
  }
    private String convertToJson() {
    String json = "{";
    json += "\"Quote1\": ";
    json += "\"" + "Live And Let Live" + "\"";
    json += ", ";
    json += "\"Quote2\": ";
    json += "\"" + "All Fingers Are Not Equal" + "\"";
    json += ", ";
    json += "\"Quote3\": ";
    json += "\"" + "Another Man's Food Is Another Man's Poison" + "\"";
    json += "}";
        
    return json;
  }


  
  
}
