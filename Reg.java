package com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Reg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\server\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//signin
		driver.findElement(By.xpath("//a[@class='login']")).click();
		//email
		Thread.sleep(3000);
		driver.findElement(By.id("email_create")).sendKeys("ravindar7525@gmail.com");
		//register click
		driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span")).click();
		WebDriverWait wait=new WebDriverWait(driver,30);
	WebElement a=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='id_gender1']")));
		a.click();
		//firstName
		driver.findElement(By.id("customer_firstname")).sendKeys("Ravinder");
		//LastName
		driver.findElement(By.id("customer_lastname")).sendKeys("Sareddy");
		//Password
		driver.findElement(By.id("passwd")).sendKeys("Sareddy");
		//dob//day
		Select day=new Select(driver.findElement(By.id("days")));
		day.selectByValue("22");
		//dob//month
		Select month=new Select(driver.findElement(By.id("months")));
		month.selectByValue("8");
		//dob//year
		Select year=new Select(driver.findElement(By.id("years")));
		year.selectByValue("1995");
		//address
		driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("6935 Rue Dumas");
		//city
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Montreal");
		//state
		Select state=new Select(driver.findElement(By.id("id_state")));
		state.selectByValue("10");
		driver.findElement(By.xpath("//input[@id='postcode']")).sendKeys("12345");	
		//country
		Select country=new Select(driver.findElement(By.id("id_state")));
		country.selectByValue("21");
		//phone
		driver.findElement(By.xpath("//input[@id='phone_mobile']")).sendKeys("5145752898");	
		//add reference
		driver.findElement(By.xpath("//input[@id='alias']")).sendKeys("Rue Dumas");
		//reg
		driver.findElement(By.xpath("//span[contains(text(),'Register')]")).click();
	}

}
