package handson3;

public interface ILeaveRequestHandler {
	public ILeaveRequestHandler nextHandler = null ; 
	public void handleRequest(LeaveRequest request);
}
