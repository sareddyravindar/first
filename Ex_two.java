package com;



import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex_two {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Ravindar Reddy\\Downloads\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//test 1
	driver.get("http://zero.webappsecurity.com/");
	driver.manage().window().maximize();
	//step b
	System.out.println("Zero - Personal Banking - Loans - Credit Cards");
	//step c
	String actual_result=driver.getTitle();
	System.out.println(actual_result.equalsIgnoreCase("Zero - Personal Banking - Loans - Credit Cards"));
	//Step d
	WebElement signin=driver.findElement(By.id("signin_button"));
	signin.click();
	//sted e
	System.out.println("Zero - Log in");
	//Step f
	String actual_result1=driver.getTitle();
	System.out.println(actual_result1.compareTo("Zero - Log in"));
	//Step g
	driver.findElement(By.id("user_login")).sendKeys("ravinder7525@gmail.com");
	//Step h
	driver.findElement(By.id("user_password")).sendKeys("1233444");
	//step I
	driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[2]/input")).click();
	driver.close();
	}

}
