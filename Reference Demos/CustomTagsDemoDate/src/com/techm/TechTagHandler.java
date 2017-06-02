package com.techm;
    import java.util.Calendar;  
    import javax.servlet.jsp.JspException;  
    import javax.servlet.jsp.JspWriter;  
    import javax.servlet.jsp.tagext.TagSupport;  
    public class TechTagHandler extends TagSupport{  
      
    public int doStartTag() throws JspException {  
        JspWriter out=pageContext.getOut();  
        try{  
         out.print(Calendar.getInstance().getTime());  
        }catch(Exception e){System.out.println(e);}  
        return SKIP_BODY;  
    }  
    }  
/*    The doStartTag() Method
    Implementing the Tag interface implies defining a doStartTag() method. 
    A Tag Handler class can either do that or extend the TagSupport class 
    and override its doStartTag() method to begin the action.  */ 
