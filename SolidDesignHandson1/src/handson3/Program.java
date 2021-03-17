package handson3;

public class Program {

	public static void main(String[] args)
	{
		LeaveRequest request = new LeaveRequest();
		request.setEmployee("Halk Phulka");
		request.setDays(5);
		ILeaveRequestHandler handler= new Supervisor();
		handler.handleRequest(request);
		int []a = {1,2,3,4,5,6};
		System.out.println(a);
		int j = a.length-1;
		System.out.println(j);
		for(int i=0;i<a.length-1/2;i++)
		{
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			j--;
		}
		
	}
}
