package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ravindar Reddy\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://form.jotform.com/201235567417252");
		driver.manage().window().maximize();
		 WebElement dateBox = driver.findElement(By.xpath("//input[@id='lite_mode_22']"));
		 dateBox.sendKeys("04-17-2020");
	}

}
