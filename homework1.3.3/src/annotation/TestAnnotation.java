package annotation;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import annotation.controller.TestController;
public class TestAnnotation {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext appCon = new AnnotationConfigApplicationContext(ConfigAnnotation.class);
		TestController testcon = (TestController)appCon.getBean(TestController.class); 
		testcon.save();
	}
}
