package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ques2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ravindar Reddy\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();

		driver.findElement(By.name("firstName")).sendKeys("Aishwara");
		driver.findElement(By.name("lastName")).sendKeys("Reddy");
		driver.findElement(By.name("phone")).sendKeys("5146034241");
		driver.findElement(By.name("city")).sendKeys("Montreal");
		driver.findElement(By.name("state")).sendKeys("quebec");
		driver.findElement(By.name("postalCode")).sendKeys("H34A21");
		
		Select country=new Select(driver.findElement(By.name("country")));
		country.selectByVisibleText("CANADA");

        //username
		driver.findElement(By.name("userName")).sendKeys("mercury");
		//password
		driver.findElement(By.name("password")).sendKeys("mercury");
		//con-pwd
		driver.findElement(By.name("confirmPassword")).sendKeys("mercury");
		//signIn
		driver.findElement(By.name("submit")).click();
		

}
}