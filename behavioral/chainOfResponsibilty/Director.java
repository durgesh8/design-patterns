package behavioral.chainOfResponsibilty;

public class Director extends Handler{
	

	@Override
	public void handleRequest(Request request) {
          if(request.getType()==RequestType.CONFERENCE) {
        	  System.out.println("Director can approve Conference");
          }
          else
        	  successor.handleRequest(request);
	}

}
