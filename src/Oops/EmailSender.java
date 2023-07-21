package Oops;

public class EmailSender implements MessageSender {

	@Override
	public String  sendMessage(String messg) {
		return "sending email :" +messg;

	}
	

}
