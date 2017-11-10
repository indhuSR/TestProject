package org.ravi.helloworld;

import junit.framework.TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class AppTest{
	
	@Test
	public void testHome() {
		WebDriver driver = new FirefoxDriver();
                driver.get("http://localhost:8080/Helloworld.war/");
        }
}