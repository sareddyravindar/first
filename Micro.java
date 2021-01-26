package com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Micro {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ravindar Reddy\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bing.com/?toWww=1&redig=BA6513D415694ED89A7972E7D1F0966A&wlexpsignin=1");
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//ex wait
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='id_l']"))).click();
		//driver.findElement(By.xpath("//input[@id='i0116']")).sendKeys("ravinder7525@gmail.com");
		//driver.findElement(By.xpath("//input[@id='idSIButton9']")).click();
		//driver.findElement(By.xpath("//input[@id='i0118']")).sendKeys("@1Spadmaravi");
		//driver.findElement(By.xpath("//input[@id='idSIButton9']")).click();
		
		
		
}
}