package handson6;

public class PremiumUser implements IUser{
	private ChatMediator mediator;
	private String Name;

	@Override
	public void SendMessage() {
		mediator.SendMessage();
		
	}

	@Override
	public void ReceiveMessage() {
		// TODO Auto-generated method stub
		System.out.println("Hello"+Name+"!!!!! Lets Have a Party today");
		
	}
	
	public PremiumUser(String Name)
	{
		this.Name = Name;
	}
	
}
