package pea2.onpe.controller;

import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.reactive.config.CorsRegistry;

@Configuration
@CrossOrigin
@Controller	
public class OnpeController extends WebMvcAutoConfiguration{
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**");
	}
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
}
