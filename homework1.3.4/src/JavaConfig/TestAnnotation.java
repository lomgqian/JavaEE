package JavaConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import controller.TestController;
public class TestAnnotation {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext appCon = new AnnotationConfigApplicationContext(JavaConfig.class);
		TestController testcon = appCon.getBean(TestController.class); 
		testcon.save();
	}
}
