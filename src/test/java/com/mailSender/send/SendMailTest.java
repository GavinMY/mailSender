package com.mailSender.send;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mailSender.common.MailUtil;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/mail/spring-mail.xml")
public class SendMailTest {
	//private static final Logger log = LoggerFactory.getLogger(SendMailTest.class);  
	@Autowired  
    private MailUtil mailUtil;  
      
    @Test  
    public void sendSingleTest(){  
      //  log.info("sendSingleTest");  
        mailUtil.send("1812973188@qq.com", "This is a test single mail", "Hello Single!");  
    }  
      
    @Test
    public void sendMassTest(){  
    //    log.info("sendMassTest");  
        List<String> recipients=new ArrayList<String>();  
        recipients.add("992574693@qq.com");  
        recipients.add("601613302@qq.com");  
        mailUtil.send(recipients, "This is a test mass mail", "Hello Mass!");  
    }  

}
