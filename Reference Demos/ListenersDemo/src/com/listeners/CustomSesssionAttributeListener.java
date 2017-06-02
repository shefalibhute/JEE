package com.listeners;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * Application Lifecycle Listener implementation class CustomSesssionAttributeListener
 *
 */
//you can try for context and request attribute listener
public class CustomSesssionAttributeListener implements HttpSessionAttributeListener {

	/**
     * @see HttpSessionAttributeListener#attributeRemoved(HttpSessionBindingEvent)
     */
    public void attributeRemoved(HttpSessionBindingEvent arg0)  { 
       System.out.println("Customer details have been removed from session");
    }

	/**
     * @see HttpSessionAttributeListener#attributeAdded(HttpSessionBindingEvent)
     */
    public void attributeAdded(HttpSessionBindingEvent event)  { 
  
    	  System.out.println("Customer details has been added into session");
    	  System.out.println("Name:"+event.getName()+" & Value="+event.getValue());
    }

	/**
     * @see HttpSessionAttributeListener#attributeReplaced(HttpSessionBindingEvent)
     */
    public void attributeReplaced(HttpSessionBindingEvent event)  { 
    	 System.out.println("Customer details has been replaced into session");
    	  System.out.println("Name:"+event.getName()+" & New Value="+event.getValue());
    }
	
}
