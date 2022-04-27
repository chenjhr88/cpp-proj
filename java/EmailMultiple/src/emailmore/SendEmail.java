package emailmore;

import java.util.*; 
import java.io.*;
import javax.mail.internet.*;
import javax.activation.*; 
import javax.mail.Session; 
import javax.mail.Transport; 
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
  
public class SendEmail { 
  
   public static void main(String [] args) throws FileNotFoundException, IOException, NullPointerException { 
	   
		// TURN OFF LESS SECURE APP ACCESS BEFORE RUNNING PROGRAM
	   	final String fromEmail = "chenjhr8899@gmail.com"; //requires valid gmail id
		final String password = "ikad0gyd"; // correct password for gmail id
	   
		Catalog myCatalog = new Catalog();
		myCatalog.inputSchools();
	   
		System.out.println("TLSEmail Start");
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com"); //SMTP Host
		props.put("mail.smtp.port", "587"); //TLS Port
		props.put("mail.smtp.auth", "true"); //enable authentication
		props.put("mail.smtp.starttls.enable", "true"); //enable STARTTLS
		
		//create Authenticator object to pass in Session.getInstance argument
		Authenticator auth = new Authenticator() {
			//override the getPasswordAuthentication method
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(fromEmail, password);
			}
		};
		
		Session session = Session.getInstance(props, auth);
		
		for(int i = 0; i < myCatalog.getSchoolList().size(); i++) {
			String toEmail = myCatalog.getSchoolList().get(i).getEmail(); // can be any email id 
			String str = "Dear " + myCatalog.getSchoolList().get(i).getName() + ",\n\n"
					+ " \n\n"
					+ "Micah Chen";
			EmailUtil.sendEmail(session, toEmail, "Hello", str);
			
	   } 
	   System.out.println("done");
   }
} 
