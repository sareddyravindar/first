package com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImAndExWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ravindar Reddy\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.ca/");
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//ex wait
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Electronics')]"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Computers')]"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[1]//li[1]//span[1]//div[1]//a[1]//div[1]//div[1]"))).click();;
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div/div/div/div/div/div/div[6]/div[2]/ul[1]/li[1]/span[1]/div[1]/a[1]/div[1]/div[1]"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//html//body//div//div//div//div//div//div//div//div//div//form//div//div//div//div//div//div//div//div//span//span//span//input"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div/div/div/div/div/div/div/div/div/span[1]/span[1]/button[1]"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//html//body//div//div//div//div//div//div//div//div//div//div//div//span//span//span//a[contains(text(),'Cart')]"))).click();
	WebElement a=wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("a-price-whole")));
		String s=a.getText();
System.out.println("Price of Item is="+s);
	}

}
