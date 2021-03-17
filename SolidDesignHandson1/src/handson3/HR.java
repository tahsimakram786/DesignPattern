package handson3;

public class HR implements ILeaveRequestHandler{
	
	

	@Override
	public void handleRequest(LeaveRequest request) {
		int days = request.getDays();
		if(days <=10)
		{
			System.out.println("Approved");
		}
		else
		{
			System.out.println("Rejected");
		}
		
	}
}
