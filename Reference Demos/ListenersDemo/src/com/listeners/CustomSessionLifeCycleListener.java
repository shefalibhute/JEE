package com.listeners;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class CustomSessionLifeCycleListener
 *
 */
//you can try for context and request life cycle listener
public class CustomSessionLifeCycleListener implements HttpSessionListener {

    public void sessionCreated(HttpSessionEvent arg0)  { 
         System.out.println("Welcome user.. New session has been created for you..");
    }

    public void sessionDestroyed(HttpSessionEvent arg0)  { 
    	  System.out.println("Thank you user.. Please visit us again..");
    }
	
}
