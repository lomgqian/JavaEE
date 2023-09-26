package JavaConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import controller.AppleController;

public class AppleTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext appCon = new AnnotationConfigApplicationContext(JavaConfig.class);
		AppleController testcon = appCon.getBean(AppleController.class); 
		testcon.printApple();
	}
}
