package com.demo.servlets;

import javax.servlet.ServletRequestEvent;
import javax.servlet.annotation.WebListener;
import javax.servlet.ServletRequestListener;
@WebListener
public class RequestListener implements ServletRequestListener {
	
 
    public RequestListener() {
       
    }
public void requestDestroyed(ServletRequestEvent sre) {
	System.out.println("Request Destroyed...");
}
public void requestInitialized(ServletRequestEvent sre) {
	System.out.println("Request initialized...");
}
	
}
