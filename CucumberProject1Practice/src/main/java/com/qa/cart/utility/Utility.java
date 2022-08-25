package com.qa.cart.utility;

import java.util.Iterator;
import java.util.Set;

import com.qa.cart.Base.TestBase;

public class Utility extends TestBase{
	
	
	public void movingtochildwindow() {
		
		String ParentWindow=driver.getWindowHandle();
		
		Set<String> windowlist=driver.getWindowHandles();
		
		Iterator<String> itr=windowlist.iterator();
		
		while(itr.hasNext()) {
			String childwindow=itr.next();
			
			if(!ParentWindow.equalsIgnoreCase(childwindow)){
				
				driver.switchTo().window(childwindow);
			}
			
			
		}
	}

}
