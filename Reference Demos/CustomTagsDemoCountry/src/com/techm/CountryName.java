package com.techm;
import javax.servlet.jsp.JspException;  
import javax.servlet.jsp.JspWriter;  
import javax.servlet.jsp.tagext.TagSupport;    
public class CountryName extends TagSupport{  
private String country;    
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public int doStartTag() throws JspException {  
    JspWriter out=pageContext.getOut();  
    try{  
        out.print(country);  
    }catch(Exception e){e.printStackTrace();}       
    return SKIP_BODY;  
}  
}  