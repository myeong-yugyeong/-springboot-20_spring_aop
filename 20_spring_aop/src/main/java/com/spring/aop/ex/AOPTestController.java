package com.spring.aop.ex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AOPTestController {

	@Autowired
	private Boss boss;
	
	@Autowired
	private Manager manager;
	
	@Autowired
	private Employee employee;
	
	@GetMapping("/test")
	@ResponseBody
	public String print() {
		
		boss.work();
		manager.work();
		employee.work();
		
		System.out.println("\n\n");
		
		boss.getWorkingTime();
		manager.getWorkingTime();
		employee.getWorkingTime();
	
		System.out.println("\n\n");
		
		boss.getInfo("사장" , 1000);
		manager.getInfo("관리자" , 700);
		employee.getInfo("직원" , 300);
		
		//boss.getError();
		
		return "success";
		
	}
	
}
