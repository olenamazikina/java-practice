package day44_encapsulation_constructor;

public class WhatsAppMessage {
	public static void main(String[] args) {
		WhatsApp wapp= new WhatsApp("703-333-4321","Good for you!");
		System.out.println(wapp);
		
		WhatsApp wapp2= new WhatsApp("703-355-4321");
		System.out.println(wapp2);
	}

}
