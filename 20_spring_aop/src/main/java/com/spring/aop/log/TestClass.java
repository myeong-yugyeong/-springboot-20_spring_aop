package com.spring.aop.log;

import org.springframework.stereotype.Component;

@Component
public class TestClass {
	
	public void testMethod1() {
		try {Thread.sleep(300);} catch (InterruptedException e) {e.printStackTrace();}
	}
	
	public void testMethod2() {
		try {Thread.sleep(300);} catch (InterruptedException e) {e.printStackTrace();}
	}
	
	public void testMethod3() {
		try {Thread.sleep(300);} catch (InterruptedException e) {e.printStackTrace();}
	}
	
	public void testMethod4() {
		try {Thread.sleep(300);} catch (InterruptedException e) {e.printStackTrace();}
	}
	
	public void testMethod5() {
		try {Thread.sleep(300);} catch (InterruptedException e) {e.printStackTrace();}
	}
	
}
