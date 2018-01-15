package jenkinsTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import controllers.MainController;

@SpringBootApplication
@ComponentScan(basePackageClasses = MainController.class)
public class ShantiJenkinsTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShantiJenkinsTestApplication.class, args);
	}
}
