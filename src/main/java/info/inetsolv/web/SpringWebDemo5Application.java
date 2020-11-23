package info.inetsolv.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"info.inetsolv.web.model"})
public class SpringWebDemo5Application {

	
	public static void main(String[] args) {
		SpringApplication.run(SpringWebDemo5Application.class, args);
	}

}
