package io.jianxun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class StockApplication {

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
