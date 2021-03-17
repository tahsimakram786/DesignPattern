package handson3;

public class ProjectManager implements ILeaveRequestHandler {
	
	public ILeaveRequestHandler nextHandler = new HR() ; 
	

	@Override
	public void handleRequest(LeaveRequest request) {
		int days = request.getDays();
		if(days <=5 && days >=3)
		{
			System.out.println("Approved");
		}
		else
		{
			System.out.println("Sent to Hr for approvement");
			nextHandler.handleRequest(request);
		}
	}
}
