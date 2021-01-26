package com;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.Constants;

public class Countries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",Constants.path);
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		
		Select countries=new Select(driver.findElement(By.xpath("//select[@name='country']")));


		List<WebElement> dropdown=countries.getOptions();

        
                    String drop_down_values=dropdown.get(4).getText().toLowerCase();
                    driver.navigate().to("https://www.google.com");
                    WebDriverWait wait=new WebDriverWait(driver,30);
                   
                    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                   
                  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='q']")))  ;
                  driver.findElement(By.xpath("//input[@name='q']")).sendKeys("places to search in "+drop_down_values);
                    Actions action = new Actions(driver);

                    action.sendKeys(Keys.ENTER).build().perform();
                    driver.close();
                   



	
	}

}
