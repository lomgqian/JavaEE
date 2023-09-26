package JavaConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import controller.AppleController;
import dao.AppleDao;
import service.AppleService;

@Configuration
public class JavaConfig {
	@ Bean
	public AppleDao getAppleDao() {
		return new AppleDao( );
	}
	@ Bean
	public AppleService getAppleService() {
		AppleService as = new AppleService( );
		as.setAppleDao(getAppleDao());
		return as; 
	}
	@ Bean
	public AppleController getAppleController() {
		AppleController ac = new AppleController( );
		ac.setAppleService(getAppleService());
	return ac; 
	}

}
