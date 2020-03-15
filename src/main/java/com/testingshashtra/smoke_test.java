package com.testingshashtra;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import keyword_driven_framework.keyword;

public class smoke_test {
	@BeforeTest
	public void ts_01() throws InterruptedException {
		
		keyword.openBrowser("Chrome");
		keyword.manageBrowser();
		
		
	}
	@Test
	public void tc_02() {

		
		
	}

}
