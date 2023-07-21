package Oops;

public class SMSsender implements MessageSender {

	@Override
	public String sendMessage(String messg) {
		
		return "sending sms : " +messg;
	}

}
