package testJenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import controllers.MainController;

@SpringBootApplication
@ComponentScan(basePackageClasses = MainController.class)
public class SpringBootJenkinsTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJenkinsTestApplication.class, args);
	}
}
