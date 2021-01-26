	package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstSel {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ravindar Reddy\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://form.jotform.com/201165787510252");
		driver.manage().window().maximize();
		//name
		driver.findElement(By.id("first_5")).sendKeys("Ravindar");
		//l_name
		driver.findElement(By.id("last_5")).sendKeys("Sareddy");
		//dob
		//month
		Select month=new Select(driver.findElement(By.id("input_65_month")));
		month.selectByVisibleText("December");
		//day
		Select day=new Select(driver.findElement(By.id("input_65_day")));
		day.selectByVisibleText("22");
		//year
		Select year=new Select(driver.findElement(By.id("input_65_year")));
		year.selectByVisibleText("1995");
		//grade
		driver.findElement(By.id("input_67")).sendKeys("4");
		//radio
		driver.findElement(By.id("input_66_0")).click();
		//address
		//line 1
		driver.findElement(By.id("input_3_addr_line1")).sendKeys("6935");
		//line2
		driver.findElement(By.id("input_3_addr_line2")).sendKeys("rue dumas");
		//city
		driver.findElement(By.id("input_3_city")).sendKeys("montreal");
		//province
		driver.findElement(By.id("input_3_state")).sendKeys("Quebec");
		//code
		driver.findElement(By.id("input_3_postal")).sendKeys("H4E3A2");
		//country
		Select country=new Select(driver.findElement(By.id("input_3_country")));
		country.selectByVisibleText("Canada");
		
		
		
		//parent Info
		//f_name
		driver.findElement(By.id("first_13")).sendKeys("Veer Nagi Reddy");
		//l_name
		driver.findElement(By.id("last_13")).sendKeys("Sareddy");
		//area code
		driver.findElement(By.id("input_15_area")).sendKeys("+91");
		//number
		driver.findElement(By.id("input_15_phone")).sendKeys("9908503803");
		//E-mail
		driver.findElement(By.id("input_16")).sendKeys("Sareddy@gmail.com");
		
		//Emergency Contact
		//name
		driver.findElement(By.id("first_18")).sendKeys("Vijeyendar");
		//l/-name
		driver.findElement(By.id("last_18")).sendKeys("Kunduru");
		//relation
		Select relstion=new Select(driver.findElement(By.id("input_19")));
		relstion.selectByVisibleText("Sibling");
		//area code
		driver.findElement(By.id("input_21_area")).sendKeys("+1");
		//number
		driver.findElement(By.id("input_21_phone")).sendKeys("5145752898");
		//info
		driver.findElement(By.id("input_22")).sendKeys("No");
		//info 2
		driver.findElement(By.id("input_23")).sendKeys("No");
		
		//click
		
				driver.findElement(By.xpath("//*[@id=\"input_2\"]")).submit();
		

	}

}
