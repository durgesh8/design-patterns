package behavioral.observer;

public class ObserverDemo {
public static void main(String[] args) {
	Subject sub=new MessageStream();
	PhoneClient phoneClient=new PhoneClient(sub);
	TabletClient tabletClient=new TabletClient(sub);
	phoneClient.addMessage("new message");
	
	tabletClient.addMessage("one more message");
}
}
