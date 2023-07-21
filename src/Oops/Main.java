package Oops;

public class Main {
  public static void main(String[] args) {
	  MessageSender emailSender =new EmailSender();
	  Client emaiClient =new Client(emailSender);
	   String email= emaiClient.sendMessage("this email send by MessageSender Interfaece");
	    
	     MessageSender smsSender =new SMSsender();
	     Client smsClient =new Client(smsSender);
	     String sms=smsClient.sendMessage("this sms send by MessageSender Interfaece");
	     
	   System.out.println(email);
	   System.out.println(sms);
}
}
