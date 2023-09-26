package JavaConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import controller.TestController;
import dao.TestDao;
import service.TestService;

@Configuration
public class JavaConfig {
	@ Bean
	public TestDao getTestDao() {
		return new TestDao( );
	}
	@ Bean
	public TestService getTestService() {
		TestService ts = new TestService( );
		ts.setTestDao(getTestDao());
		return ts; 
	}
	@ Bean
	public TestController getTestController() {
		TestController tc = new TestController( );
		tc.setTestService(getTestService());
	return tc; 
	}

}
