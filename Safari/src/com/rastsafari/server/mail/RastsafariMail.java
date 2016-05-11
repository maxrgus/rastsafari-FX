package com.rastsafari.server.mail;

import java.io.UnsupportedEncodingException;
import java.time.LocalDate;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.rastsafari.server.model.Booking;
import com.rastsafari.server.model.Safari;

import javax.mail.PasswordAuthentication;

public class RastsafariMail {
	private String fromEmail = "rastsafari.gu@gmail.com";
	
	private final String username = "rastsafari.gu@gmail.com";
	private final String password = "rastsafari1";
	
	private Properties props = new Properties();
	private Session session;

	
	
	public RastsafariMail() {
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
		session = Session.getInstance(props,
				  new javax.mail.Authenticator() {
					@Override
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
	public void sendBookingConfirmation(Booking booking) {
		String locationName = booking.getSafari().getLocation().getLocationName();
		String description = booking.getSafari().getLocation().getDescription();
		String date = booking.getSafari().getDate();
		String customerName = booking.getCustomer().getFName() + " " + booking.getCustomer().getLName();
		LocalDate safariDate = LocalDate.parse(date);
		LocalDate lastPayDate = safariDate.minusDays(14);
		
		try {
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(fromEmail, "Småländska Fiskeförbundet"));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(booking.getCustomer().getEMail()));
			message.setSubject("Bokningsbekräftelse " + locationName + " " + description + " " + "den " + date);
			message.setContent(
					"<h1>Bokningsbekräftelse</h1>\n" +
					"<p>Hej " + customerName + "</p>\n" +
					"<p>Nedan hittar du din bokningsbekräftelse för bokat safari</p>\n" +
					"\n\n\n\n" +
					"<h2>" + locationName + " " + description + "</h1>\n" +
					"<h4>Datum: " + date + "</h4>\n" +
					"<h4>Starttid: " + booking.getSafari().getStartTime() + "</h4>\n" +
					"<h4>Sluttid: " + booking.getSafari().getEndTime() + "</h4>\n" +
					"\n\n\n\n\n" +
					"<p>Vi behöver ha din betalning senast 2 veckor innan safaristart, i ditt fall " + lastPayDate.toString() + "\n" +
					"Se bifogad faktura," +
					"\n\n\n\n\n" +
					"<h5>Mvh</h5>\n" +
					"<h5>Kansliet</h5>","text/html");
			Transport.send(message);
			System.out.println("Mail sent");
			
		} catch (MessagingException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}














