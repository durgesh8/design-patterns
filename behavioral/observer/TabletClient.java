package behavioral.observer;

public class TabletClient extends Observer {

	TabletClient(Subject subject){
		this.subject=subject;
		subject.attach(this);
	}

	public void addMessage(String message) {
		subject.setState(message+" - sent from tablet");
	}
	@Override
	void update() {
		System.out.println("Tablet stream: "+subject.getState());

	}

}
