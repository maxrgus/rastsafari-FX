package com.rastsafari.mail;

import java.io.UnsupportedEncodingException;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.PasswordAuthentication;

import com.rastsafari.model.Booking;
import com.rastsafari.model.Safari;

public class RastsafariMail {
	private String fromEmail = "rastsafari.gu@gmail.com";
	
	private final String username = "max.r.gus@gmail.com";
	private final String password = "hyulp008";
	
	private Properties props = new Properties();
	private Session session;

	
	
	public RastsafariMail() {
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
		session = Session.getInstance(props,
				  new javax.mail.Authenticator() {
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication(username, password);
					}
				  });
	}
	public void sendGuideBriefing(Safari safari) {
		String locationName = safari.getLocation().getLocationName();
		String description = safari.getLocation().getDescription();
		String date = safari.getDate();
		String participants = "";
		
		for (Booking b : safari.getBookedCustomers()) {
			participants += "<tr>\n" +
							"<td>" + b.getCustomer().getFName() + " " + b.getCustomer().getLName() + "</td>\n" +
							"<td>" + b.getCustomer().getEMail() + "</td>\n" +
							"<td>" + b.getCustomer().getAllNumber() + "</td>\n" +
							"</tr>\n";
		}
		try {
			Message message = new MimeMessage(session);
			
			message.setFrom(new InternetAddress(fromEmail, "Småländska Fiskeförbundet"));
			message.setRecipients(Message.RecipientType.TO,
		              InternetAddress.parse(safari.getGuide().getEmail()));
			message.setSubject("Uppdragsbeskrivning för " + locationName +
							   " den " + date);
			message.setContent(
					"<h1>" + locationName + " " + description + "</h1>\n" +
					"<h4>Datum: " + date + "</h4>\n" +
					"<h4>Starttid: " + safari.getStartTime() + "</h4>\n" +
					"<h4>Sluttid: " + safari.getEndTime() + "</h4>\n" +
					"<h4>Antal deltagare: " + Integer.toString(safari.getTakenSlots()) + "</h4>\n" +
					"<h4>Deltagare</h4>\n" +
					"<table>\n" +
					"<tr>\n" +
					"<th>Namn</th>\n" +
					"<th>Epost</th>\n" +
					"<th>Telefonnummer</th>\n" +
					"</tr>\n" +
					participants +
					"</table>" +
					"<h5>Mvh</h5>\n" +
					"<h5>Kansliet</h5>","text/html");
			Transport.send(message);
			System.out.println("Mail sent");
			
		} 
		catch (MessagingException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}
