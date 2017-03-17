package io.jianxun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import io.jianxun.domain.business.user.User;

@Controller
@SpringBootApplication
@EnableJpaAuditing
public class StockApplication {
	
	@Bean
	public AuditorAware<User> auditorProvider() {
		return new AuditorAwareImpl();
	}

	@RequestMapping("/hello")
	public @ResponseBody String hello() {
		return "hello";
	}

	@RequestMapping("hello/page")
	public String helloPage() {
		return "hello/page";
	}

	public static void main(String[] args) {
		SpringApplication.run(StockApplication.class, args);
	}
}
