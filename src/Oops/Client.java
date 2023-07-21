package Oops;



public class Client {
	
	
	
	private MessageSender messageSender;
	public Client(MessageSender messageSender) {
		this.messageSender=messageSender;
		
		
	}
	public String sendMessage(String messg) {
		return messageSender.sendMessage(messg);
		
	}

}
