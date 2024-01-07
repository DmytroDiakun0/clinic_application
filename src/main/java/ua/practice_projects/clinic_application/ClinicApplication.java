package ua.practice_projects.clinic_application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class ClinicApplication implements WebMvcConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(ClinicApplication.class, args);
	}

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/login").setViewName("html/login_page");
		registry.addViewController("/signup").setViewName("html/signup_page");
	}

}
