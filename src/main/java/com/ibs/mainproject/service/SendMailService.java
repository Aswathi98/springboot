package com.ibs.mainproject.service;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.Message.RecipientType;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class SendMailService {
    private static final Logger logger = LoggerFactory.getLogger(SendMailService.class);
	public void sendMail(String m_from,String m_to,String m_subject,String m_body){
		logger.info(" SendMailService sendMail is invoked");
		try {
            Session m_Session;
            Message m_simpleMessage;
            InternetAddress m_fromAddress;
            InternetAddress m_toAddress;
            Properties m_properties;

            m_properties     = new Properties();
            m_properties.put("mail.smtp.host", "192.168.29.2"); 
          //m_properties.put("mail.smtp.socketFactory.port", "465");
         // m_properties.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
            m_properties.put("mail.smtp.auth", "true");
            m_properties.put("mail.smtp.starttls.enable", "true");
            m_properties.put("mail.smtp.port", "25");
                                 
            m_properties.setProperty("mail.smtp.socketFactory.fallback", "false");
                    
             m_properties.put("mail.debug", "true");
            //m_properties.put("mail.store.protocol", "pop3");
            m_properties.put("mail.transport.protocol", "smtp");


            m_Session=Session.getDefaultInstance(m_properties,new Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication("from@test.com","from"); // username and the password
                }
            });

            m_simpleMessage  =   new MimeMessage(m_Session);
            m_fromAddress    =   new InternetAddress(m_from);
            m_toAddress      =   new InternetAddress(m_to);

            m_simpleMessage.setFrom(m_fromAddress);
            m_simpleMessage.setRecipient(RecipientType.TO, m_toAddress);
            m_simpleMessage.setSubject(m_subject);

            m_simpleMessage.setContent(m_body, "text/html");

            //m_simpleMessage.setContent(m_body,"text/plain");

            Transport.send(m_simpleMessage);
        } catch (MessagingException ex) {
            ex.printStackTrace();
        }
		
	}
}
