package testpackage1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNG_Sequence {

	@BeforeSuite
	public void a() {
		System.out.println("Before Suite");
	}

	@AfterSuite
	public void b() {
		System.out.println("After Suite");
	}

	@BeforeClass
	public void c() {
		System.out.println("Before Class");
	}

	@AfterClass
	public void d() {
		System.out.println("After Class");
	}

	@BeforeMethod
	public void e() {
		System.out.println("Before Method");
	}

	@AfterMethod
	public void g() {
		System.out.println("After Method");
	}

	@Test
	public void f() {
		System.out.println("Test Annotation");
	}
}
