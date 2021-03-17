package handson3;

public class Supervisor implements ILeaveRequestHandler {

	public ILeaveRequestHandler nextHandler = new ProjectManager() ; 
	@Override
	public void handleRequest(LeaveRequest request) {
		int days = request.getDays();
		if(days <=3 && days >=1)
		{
			System.out.println("Approved");
		}
		else
		{
			System.out.println("Sent to project Manager for approvement");
			nextHandler.handleRequest(request);
		}
		
		
	}
}
