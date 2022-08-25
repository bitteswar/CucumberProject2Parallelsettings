package stepDefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook {
	
	@Before("@Web")
	public void beforevalidation() {
		
		System.out.println("Steps Validated before WebPage");
	}

	@After("@Web")
	public void aftervalidation() {
		System.out.println("Steps Validated after WebPage");
		
	}
}
