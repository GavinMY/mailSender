package com.mailSender.common;
	import java.util.List;

import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;  
	 
	public class MailUtil {  
	    private MailSender mailSender;  
	    private SimpleMailMessage simpleMailMessage;  
	      
	   
	    public void setMailSender(MailSender mailSender) {  
	        this.mailSender = mailSender;  
	    }  
	      
	    
	    public void setSimpleMailMessage(SimpleMailMessage simpleMailMessage) {  
	        this.simpleMailMessage = simpleMailMessage;  
	    }  
	
	    public void send(String recipient,String subject,String content){  
	        simpleMailMessage.setTo(recipient);  
	        simpleMailMessage.setSubject(subject);  
	        simpleMailMessage.setText(content);  
	        mailSender.send(simpleMailMessage);  
	    }  
	      

	    public void send(List<String> recipients,String subject,String content){  
	        simpleMailMessage.setTo(recipients.toArray(new String[recipients.size()]));  
	        simpleMailMessage.setSubject(subject);  
	        simpleMailMessage.setText(content);  
	        mailSender.send(simpleMailMessage);  
	    }  
	}  