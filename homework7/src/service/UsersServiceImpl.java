package service;
import java.util.ArrayList;
import org.springframework.stereotype.Service;

import pojo.Users;
@Service
public class UsersServiceImpl implements UsersService{
	private static ArrayList<Users> users = new ArrayList<Users>();
	@Override
	public boolean save(Users g) {
		users.add(g);
		return true;
	}
	@Override
	public ArrayList<Users> getUsers() {
		return users;
	}
	 @Override  
	    public boolean verify(Users user) {  
	        for (Users existingUser : users) {  
	            if (existingUser.getUname().equals(user.getUname()) && existingUser.getUpwd().equals(user.getUpwd())) {  
	                return true;  
	            }  
	        }  
	        return false;  
	    }  
}
