package com.btit95.sample;


import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class CalculatorTestRunner {
	public static void main(String[] args) {
		Result rs = JUnitCore.runClasses(CalculatorTest.class);
		System.out.println("================= Result ==================");
		for(Failure failure : rs.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println(rs.wasSuccessful());
	}
}
