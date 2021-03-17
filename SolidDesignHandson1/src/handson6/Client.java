package handson6;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IChatMediator mediator = new ChatMediator();
		mediator.addUser(new BasicUser("hari"));
		mediator.addUser(new PremiumUser("BILKA"));
		IUser user = new BasicUser("Silka");
		mediator.SendMessage();	
	}

}
