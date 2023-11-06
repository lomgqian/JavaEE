package service;
import java.util.ArrayList;

import pojo.Users;
public interface UsersService {
	boolean save(Users g);
	ArrayList<Users> getUsers();
	 boolean verify(Users user);
}
