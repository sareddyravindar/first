package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utilities.Constants;

public class NewTest {
	@DataProvider(name = "security")
	public String[][] testData() {

		String ar[][]= { 
				{ "1", "1@123" }, 
				{ "mercury", "mercury" }, 
				
				
			};

		return ar;	
	}
	@Test(priority = 1, dataProvider="security")
	public void sample(String uname, String pwd) {
		System.setProperty("webdriver.chrome.driver",Constants.path);
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		driver.manage().window().maximize();
		//username
		driver.findElement(By.name("userName")).sendKeys(uname);
		//password
		driver.findElement(By.name("password")).sendKeys(pwd);
	}
}
