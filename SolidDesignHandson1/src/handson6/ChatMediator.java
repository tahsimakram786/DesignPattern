package handson6;

import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements IChatMediator {
	private List<IUser> usersList =  new ArrayList();
	
	@Override
	public void addUser(IUser user)
	{
		usersList.add(user);
	}
	
	@Override
	public void SendMessage()
	{
		for(IUser u: usersList)
		{
			u.ReceiveMessage();
		}
	}
}
