package behavioral.chainOfResponsibilty;

public class CEO extends Handler{

	@Override
	public void handleRequest(Request request) {
		System.out.println("CEPs can approve anything");
		
	}

}
