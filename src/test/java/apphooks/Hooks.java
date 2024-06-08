package apphooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;

public class Hooks {
	
	@BeforeAll(order = 1)
	public static void beforeAll()
	{
		System.out.println("before all is executing");
	}
	
	@AfterAll(order = 1)
	public static void afterAll()
	{
		System.out.println("after all is executing");
	}
	
//	@BeforeAll(order = 2)
//	public static void beforeAll2()
//	{
//		System.out.println("before all2 is executing");
//	}
//	
//	@AfterAll(order = 2)
//	public static void afterAll2()
//	{
//		System.out.println("after all2 is executing");
//	}
	
	
	@Before("@regression")
	public void beforeHook1()
	{
		System.out.println("Before hook1 is executing");
	}
	
	@BeforeStep("@regression")
	public void beforeStep1()
	{
		System.out.println("before step1");
	}
	
//	@BeforeStep(order = 2)
//	public void beforeStep2()
//	{
//		System.out.println("before step2");
//	}
	
	@AfterStep(order = 1)
	public void afterStep1()
	{
		System.out.println("After step1");
	}
	
//	@AfterStep(order = 2)
//	public void afterStep2()
//	{
//		System.out.println("After step2");
//	}
	
	
//	@Before(order = -200)
//	public void beforeHook2()
//	{
//		System.out.println("Before hook2 is executing");
//	}
	
	
	@After("@sanity")
	public void afterHook1()
	{
		System.out.println("After hook1 is executing");
	}
	
//	@After(order = -5000)
//	public void afterHook2()
//	{
//		System.out.println("After hook2 is executing");
//	}

}
