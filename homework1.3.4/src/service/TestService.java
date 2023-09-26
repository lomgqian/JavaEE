package service;
import dao.TestDao;

public class TestService {
	 TestDao testDao;
	public void setTestDao( TestDao testDao){
	this. testDao = testDao;
	}
	public void save() {
		testDao.save();	
		
	}
}
