package annotation.service;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import annotation.dao.TestDao;
@Service("testService")
public class TestSeviceImpl implements TestService{
	@Resource(name="testDao")
	private TestDao testDao;
	@Override
	public void save() {
		testDao.save();
		System.out.println("testService save");
	}
}
