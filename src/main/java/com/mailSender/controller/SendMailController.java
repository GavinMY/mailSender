package com.mailSender.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mailSender.common.MailUtil;

@Controller
@RequestMapping("mail")
public class SendMailController {
	@Autowired  
    private MailUtil mailUtil; 
	@ResponseBody
	@RequestMapping("send")
	public String sendMail()
	{
		  mailUtil.send("601613302@qq.com", "This is a test single mail", "Hello Single!");  
		return "Success";
	}
	
}
