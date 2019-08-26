package controller;

import java.io.IOException;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmailServelet
 */
@WebServlet("/email")
public class EmailServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmailServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String to=request.getParameter("to");
		String from="alexbetterthanaditya@gmail.com";
		String password="alexrules";
		String smtp="smtp.gmail.com";
		Properties prop = new Properties();
		
		prop.put("mail.smtp.host", smtp);
		prop.put("mail.smtp.port", "587");
		prop.put("mail.smtp.auth", "true");
		prop.put("mail.smtp.starttls.enable", "true");
		
		
		Session session = Session.getInstance(prop,new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				// TODO Auto-generated method stub
				return new PasswordAuthentication(from,password);
			}
		});
		MimeMessage message= new MimeMessage(session);
		
		try {
			message.setFrom("alexbetterthanaditya@gmail.com");
			InternetAddress ia[]= new InternetAddress[1];
			ia[0]=new InternetAddress("reply-for-us@us.com");
			
			message.setReplyTo(ia);
			message.setRecipients(Message.RecipientType.TO, 
					InternetAddress.parse(to));
			
			message.setSubject("TEST SUBJECT");
			
			message.setText(request.getParameter("mail-body"));
			
			Transport.send(message);
			System.out.println("Message Sent Successfully!");
			
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
