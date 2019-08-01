package behavioral.chainOfResponsibilty;

public class Request {

	private RequestType type;
	private double amount;
	public Request(RequestType type, double amount) {
		super();
		this.type = type;
		this.amount = amount;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public RequestType getType() {
		return type;
	}
}
