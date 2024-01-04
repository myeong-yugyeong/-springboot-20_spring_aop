package com.spring.aop.log;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogTestController {

	@Autowired
	private TestClass testClass;
	
	@GetMapping("/log")
	@ResponseBody
	public String print() {
		
		testClass.testMethod1();
		testClass.testMethod2();
		testClass.testMethod3();
		testClass.testMethod4();
		testClass.testMethod5();
		
		return "success";
		
	}
	
}
