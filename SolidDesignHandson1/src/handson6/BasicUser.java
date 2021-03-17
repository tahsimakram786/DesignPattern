package handson6;

public class BasicUser implements IUser {
	private ChatMediator mediator;
	private String Name;

	@Override
	public void SendMessage() {
		mediator.SendMessage();
		
	}

	@Override
	public void ReceiveMessage() {
		// TODO Auto-generated method stub
		System.out.println("Hello "+Name+"!!!!! How r u doing today");
		
	}
	
	public BasicUser(String Name)
	{
		this.Name = Name;
	}
	


}
