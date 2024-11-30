package com.jbk;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@RequestMapping("/welcome")
	public String welcome() {
		return "Welcome Niraj";
	}
	
	@RequestMapping("/add")
	public int add() {
		return 2 + 3;
	}
	
	@RequestMapping("/subtract")
	public int subtract() {
		return 5 - 3;
	}
	
	@RequestMapping("/multiply")
	public int multiply() {
		return 2 * 3;
	}
	
	@RequestMapping("/divide")
	public int divide() {
		return 10 / 2;
	}
}
